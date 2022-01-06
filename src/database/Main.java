package database;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver");
        String dburl = "jdbc:h2:~/test"; // 接続先
        String sql = "INSERT INTO EMPLOYEES(name) VALUES('aoki')";
        Connection conn = DriverManager.getConnection(dburl); // DBに接続
        conn.createStatement().executeUpdate(sql); // SQLを送信
        conn.close();
    }
}
