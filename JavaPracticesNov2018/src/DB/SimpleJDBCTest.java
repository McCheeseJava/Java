package DB;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class SimpleJDBCTest {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = null;
		String query = "SELECT * FROM pg_am";
		
		try (Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {

			while (rs.next()) {
				String amname    = rs.getString("amname");
				String amhandler = rs.getString("amhandler");
				System.out.println("amname: " + amname + "\n" + "amhandler:" + amhandler);
			} // end of while
		} //try
		
		catch (SQLException e) {
			System.out.println("SQL Exception: " + e);
		} // end of try-with-resources
		
	}
}