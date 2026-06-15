/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_poo_mathkids;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
    

    private static final String URL = "jdbc:sqlite:mathkids.db";
    private static Connection conexion = null;


    public static Connection conectar() {

        try {
            if (conexion == null || conexion.isClosed()) {

                try {
                    Class.forName("org.sqlite.JDBC");
                } catch (ClassNotFoundException ex) {
                    System.out.println("El .jar no está en el Classpath: " + ex.getMessage());
                }

                conexion = DriverManager.getConnection(URL);
                System.out.println("Conexión exitosa a SQLite.");
                crearTablas(); 
            }
        } catch (SQLException e) {
            System.out.println("Error de conexión a la base de datos: " + e.getMessage());
        }
        return conexion;
    }


    public static void desconectar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexión: " + e.getMessage());
        }
    }


    private static void crearTablas() {
        String sqlUsuarios = "CREATE TABLE IF NOT EXISTS usuarios ("
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " usuario TEXT UNIQUE NOT NULL,"
                + " nombre_completo TEXT NOT NULL,"
                + " contrasena TEXT NOT NULL,"
                + " rol TEXT NOT NULL"
                + ");";

        String sqlProgreso = "CREATE TABLE IF NOT EXISTS progreso ("
                + " id_usuario INTEGER,"
                + " estrellas_totales INTEGER DEFAULT 0,"
                + " reto_superado INTEGER DEFAULT 0," 
                + " FOREIGN KEY(id_usuario) REFERENCES usuarios(id)"
                + ");";

        try (Statement stmt = conexion.createStatement()) {
            stmt.execute(sqlUsuarios);
            stmt.execute(sqlProgreso);
            System.out.println("Tablas verificadas/creadas correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al crear tablas: " + e.getMessage());
        }
    }
}