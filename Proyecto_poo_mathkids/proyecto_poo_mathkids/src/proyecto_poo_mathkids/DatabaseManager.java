package proyecto_poo_mathkids;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:sqlite:mathkids.db";
    private static final String CREATE_STUDENTS_TABLE = """
        CREATE TABLE IF NOT EXISTS students (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            name TEXT NOT NULL,
            email TEXT UNIQUE,
            created_at DATETIME DEFAULT CURRENT_TIMESTAMP
        );
    """;
    
    private static final String CREATE_SCORES_TABLE = """
        CREATE TABLE IF NOT EXISTS scores (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            student_id INTEGER NOT NULL,
            score INTEGER NOT NULL,
            difficulty INTEGER NOT NULL,
            game_date DATETIME DEFAULT CURRENT_TIMESTAMP,
            FOREIGN KEY (student_id) REFERENCES students(id)
        );
    """;
    
    // Open a connection and enable foreign keys for this connection
    private Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL);
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("PRAGMA foreign_keys = ON;");
        } catch (SQLException e) {
            System.err.println("Warning enabling foreign keys: " + e.getMessage());
        }
        return conn;
    }

    public DatabaseManager() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.err.println("SQLite driver not found: " + e.getMessage());
        }
        initializeDatabase();
    }
    
    private void initializeDatabase() {
        try (Connection conn = getConnection()) {
            createTables(conn);
        } catch (SQLException e) {
            System.err.println("Error initializing database: " + e.getMessage());
        }
    }
    
    private void createTables(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(CREATE_STUDENTS_TABLE);
            stmt.execute(CREATE_SCORES_TABLE);
        }
    }
    
    public int registerStudent(String name, String email) {
        String sql = "INSERT INTO students (name, email) VALUES (?, ?)";
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating student failed, no rows affected.");
            }
            
            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error registering student: " + e.getMessage());
        }
        return -1;
    }
    
    public boolean authenticateStudent(String name, String email) {
        String sql = "SELECT * FROM students WHERE name = ? AND email = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("Error authenticating student: " + e.getMessage());
        }
        return false;
    }
    
    public int saveScore(int studentId, int score, int difficulty) {
        String sql = "INSERT INTO scores (student_id, score, difficulty) VALUES (?, ?, ?)";
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            pstmt.setInt(1, studentId);
            pstmt.setInt(2, score);
            pstmt.setInt(3, difficulty);
            
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Saving score failed, no rows affected.");
            }
            
            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error saving score: " + e.getMessage());
        }
        return -1;
    }
    
    public List<ScoreRecord> getTopScores(int limit) {
        List<ScoreRecord> scores = new ArrayList<>();
        String sql = """
            SELECT s.id, s.student_id, stu.name, s.score, s.difficulty, s.game_date
            FROM scores s
            JOIN students stu ON s.student_id = stu.id
            ORDER BY s.score DESC, s.game_date ASC
            LIMIT ?
        """;
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, limit);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    ScoreRecord record = new ScoreRecord(
                        rs.getInt("id"),
                        rs.getInt("student_id"),
                        rs.getString("name"),
                        rs.getInt("score"),
                        rs.getInt("difficulty"),
                        rs.getString("game_date")
                    );
                    scores.add(record);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error getting top scores: " + e.getMessage());
        }
        return scores;
    }
    
    public List<ScoreRecord> getStudentScores(int studentId) {
        List<ScoreRecord> scores = new ArrayList<>();
        String sql = """
            SELECT id, student_id, score, difficulty, game_date
            FROM scores
            WHERE student_id = ?
            ORDER BY game_date DESC
        """;
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, studentId);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    ScoreRecord record = new ScoreRecord(
                        rs.getInt("id"),
                        rs.getInt("student_id"),
                        "",
                        rs.getInt("score"),
                        rs.getInt("difficulty"),
                        rs.getString("game_date")
                    );
                    scores.add(record);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error getting student scores: " + e.getMessage());
        }
        return scores;
    }
    
    public static class ScoreRecord {
        private final int id;
        private final int studentId;
        private final String studentName;
        private final int score;
        private final int difficulty;
        private final String gameDate;
        
        public ScoreRecord(int id, int studentId, String studentName, int score, int difficulty, String gameDate) {
            this.id = id;
            this.studentId = studentId;
            this.studentName = studentName;
            this.score = score;
            this.difficulty = difficulty;
            this.gameDate = gameDate;
        }
        
        public int getId() { return id; }
        public int getStudentId() { return studentId; }
        public String getStudentName() { return studentName; }
        public int getScore() { return score; }
        public int getDifficulty() { return difficulty; }
        public String getGameDate() { return gameDate; }
        
        @Override
        public String toString() {
            return String.format("%s - Score: %d (Difficulty: %d) - %s",
                studentName, score, difficulty, gameDate);
        }
    }
}
