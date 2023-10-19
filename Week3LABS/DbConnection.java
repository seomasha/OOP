package OOP.Week3LABS;

import java.sql.*;

public class DbConnection {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "sonyxperiam5";


    private Connection connection = null;


    public DbConnection() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllEntities() throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks;");

        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("task_description"));
            System.out.println("task_status");
        }
    }

    public void getTaskByID(int customerId) throws SQLException {
        PreparedStatement statement = this
                .connection
                .prepareStatement("SELECT * FROM tasks WHERE id = ?");
        statement.setInt(1, customerId);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("id"));
        }
    }
}
