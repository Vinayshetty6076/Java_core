package usingcallablestatement;

import java.sql.Connection;
import java.sql.SQLException;

public class client {
	public static void main(String[] args) throws SQLException {

		Connection connection = DBUtil2.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection is taken..");
		
		
		}


}