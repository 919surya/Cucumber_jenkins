package pages;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String columnValue;
	public String getDataFromDb(String columnName) {
// setting properties for MySQL:
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlUrl="jdbc:mysql://localhost:3306/february2022";
			String sqlUsername="root";
			String sqlPassword="root";
			String sqlQuery="select * from users";
//create a connection to local DB:
			connection=DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);		
// Empowring the connection reference variable to execute queries
			statement = connection.createStatement();
// Execute/Deliver query	
			resultSet = statement.executeQuery(sqlQuery);
			while(resultSet.next()) {
				columnValue=resultSet.getString(columnName);
				return columnValue;
			}
					
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}finally {
			if(resultSet !=null ) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		  	 }
				if(connection !=null)
					try {
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
			
		return columnValue;
			
	}
}
