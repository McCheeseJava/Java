/*
 * Copyright 2003 Sun Microsystems, Inc.  ALL RIGHTS RESERVED.
 * Use of this software is authorized pursuant to the terms of the license found at
 * http://developer.java.sun.com/berkeley_license.html.
 */ 

import java.sql.*;
     
public class CreateStores {

	public static void main(String args[]) {
		  
		String url = "jdbc:mySubprotocol:myDataSource";
		Connection con;
		String createTable;
		String createArray;
		createArray = "CREATE TYPE COF_ARRAY AS ARRAY(10) OF VARCHAR(40)";
		createTable = "CREATE TABLE STORES ( " +
						"STORE_NO INTEGER, LOCATION ADDRESS, " +
						"COF_TYPES COF_ARRAY, MGR REF MANAGER )";
		Statement stmt;
	
		try {
			Class.forName("myDriver.ClassName");

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: "); 
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, 
									"myLogin", "myPassword");
	
			stmt = con.createStatement();							

	   	    stmt.executeUpdate(createArray);
	   	    stmt.executeUpdate(createTable);
	
			stmt.close();
			con.close();
	
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}
}
