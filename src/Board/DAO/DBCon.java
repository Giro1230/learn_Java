package Board.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBCon {
    private final String url = "jdbc:mysql://localhost:3306/myDB";
    private final String uid = "root";
    private final String upw = "6725";

    Connection con;

    public Connection getCon() {
        return con;
    }

    public void DBConnection() throws SQLException, ClassNotFoundException {
        try {
            con = DriverManager.getConnection(url, uid, upw);
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void Disconnect() throws SQLException {
        con.close();
    }
}
