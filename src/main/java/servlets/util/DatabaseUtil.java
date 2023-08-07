package servlets.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	//mysql 
	//String URL = "jdbc:Mysql://localhost:3306/seu_banco_de_dados";
	// Class = com.mysql.cj.jdbc.Driver
	
    private static final String URL = "jdbc:postgresql://localhost:5432/teste_new";
    private static final String USER = "postgres";
    private static final String PASSWORD = "91095850";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}