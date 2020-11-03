package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

class ConnectionDemo {
	private static Connection CONNECTION = null;
	private static String SERVER_NAME = "localhost";
	private static String DATABASE_NAME = "springcourse";
	private static String USERNAME = "root";
	private static String PASSWORD = "";


    public static void main(String[] args) {
    	CONNECTION = ConnectionDemo.getConnection();
        
        PreparedStatement preparedStatement;
        try {
            preparedStatement = CONNECTION.prepareStatement(
                    "insert into t_customer (id, first_name, last_name, last_login, comments)" +
                    "values (?, ?, ?, ?, ?)");
        } catch (SQLException e) {
            return;
        }
        try {
            preparedStatement.setLong(1, 4L);
            preparedStatement.setString(2, "D");
            preparedStatement.setString(3, "Star");
            preparedStatement.setNull(4, Types.TIMESTAMP);
            preparedStatement.setNull(5, Types.CLOB);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return;
        }
        try {
        	CONNECTION.commit();
        } catch (SQLException e) {
            return;
        }
        try {
        	CONNECTION.close();
        } catch (SQLException e) {
            // noop
        }
    }

	public static Connection getConnection(){
		if(CONNECTION == null){
			try {
				// Load the JDBC driver
				String driverName = "org.gjt.mm.mysql.Driver"; // MySQL MM JDBC driver
				Class.forName(driverName);
	
				String url = "jdbc:mysql://" + SERVER_NAME +  "/" + DATABASE_NAME; // a JDBC url
				CONNECTION = DriverManager.getConnection(url, USERNAME, PASSWORD);
			
				return CONNECTION;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}else{
			return CONNECTION;
		}
		
	}
}