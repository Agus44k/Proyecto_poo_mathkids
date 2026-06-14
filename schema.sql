-- schema.sql
-- Schema for Proyecto_poo_mathkids SQLite database
PRAGMA foreign_keys = ON;

CREATE TABLE IF NOT EXISTS students (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    email TEXT UNIQUE,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS scores (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    student_id INTEGER NOT NULL,
    score INTEGER NOT NULL,
    difficulty INTEGER NOT NULL,
    game_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (student_id) REFERENCES students(id)
);

-- Usage:
-- sqlite3 mathkids.db < schema.sql
-- Or let the application create the DB on first run (DatabaseManager already runs CREATE TABLE IF NOT EXISTS).
