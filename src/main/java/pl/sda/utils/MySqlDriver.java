package pl.sda.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDriver {
    private static String user ="root";
    private static String url ="jdbc:mysql://localhost:3306/citizens?useTimezone=true&serverTimezone=GMT";
    private static String password ="skyline";

    public MySqlDriver() {
    }

    public static Connection createConnection(){
        Connection con = null;

        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
