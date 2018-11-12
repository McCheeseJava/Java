/*
 * Copyright 2003 Sun Microsystems, Inc.  ALL RIGHTS RESERVED.
 * Use of this software is authorized pursuant to the terms of the license found at
 * http://developer.java.sun.com/berkeley_license.html.
 */ 

import java.sql.*;

public class AutoGenKeys {

    public static void main(String args[]) {

        String url = "jdbc:mySubprotocol:myDataSource";

		Connection con = null;
		PreparedStatement pstmt;
		String insert = "INSERT INTO COFFEES VALUES ('HYPER_BLEND', " +
											"101, 10.99, 0, 0)";
		String update = "UPDATE COFFEES SET PRICE = ? WHERE KEY = ?";

		try {

			Class.forName("myDriver.ClassName");

		} catch(java.lang.ClassNotFoundException e) {
	        System.err.print("ClassNotFoundException: ");
		    System.err.println(e.getMessage());
		}

		try {

	    	con = DriverManager.getConnection(url,
						"myLogin", "myPassword");

			pstmt = con.prepareStatement(insert,
					Statement.RETURN_GENERATED_KEYS);

			pstmt.executeUpdate();
			ResultSet keys = pstmt.getGeneratedKeys();

			int count = 0;
			
			keys.next();
			int key = keys.getInt(1);

			pstmt = con.prepareStatement(update);
			pstmt.setFloat(1, 11.99f);
			pstmt.setInt(2, key);
			pstmt.executeUpdate();

			keys.close();
			pstmt.close();
	     	con.close();

		} catch (SQLException e) {
	    	e.printStackTrace();
		}

    }

}
