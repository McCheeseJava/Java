/*
 * Copyright 2003 Sun Microsystems, Inc.  ALL RIGHTS RESERVED.
 * Use of this software is authorized pursuant to the terms of the license found at
 * http://developer.java.sun.com/berkeley_license.html.
 */ 

import java.sql.*;

public class GetParamMetaData {

    public static void main(String args[]) {

		String url = "jdbc:mySubprotocol:myDataSource";

		Connection con;
		PreparedStatement pstmt;
		ParameterMetaData pmd;

		String sql = "UPDATE COFFEES SET SALES = ? " +
											"WHERE COF_NAME = ?";

		try {

			Class.forName("myDriver.ClassName");

		} catch(java.lang.ClassNotFoundException e) {
	        System.err.print("ClassNotFoundException: ");
		    System.err.println(e.getMessage());
		}

		try {

	    	con = DriverManager.getConnection(url,
						"myLogin", "myPassword");

			pstmt = con.prepareStatement(sql);

			pmd = pstmt.getParameterMetaData();

			int totalDigits = pmd.getPrecision(1);
			int digitsAfterDecimal = pmd.getScale(1);
			boolean b = pmd.isSigned(1);
			System.out.println("The first parameter ");
			System.out.println("    has precision " + totalDigits);
			System.out.println("    has scale " + digitsAfterDecimal);
			System.out.println("    may be a signed number " + b);

			int count = pmd.getParameterCount();
			System.out.println("count is " + count);

			for (int i = 1; i <= count; i++) {
				int type = pmd.getParameterType(i);
				String typeName = pmd.getParameterTypeName(i);
				System.out.println("Parameter " + i + ":"); 
				System.out.println("    type is " + type); 
				System.out.println("    type name is " + typeName); 
			}
				
			pstmt.close();
	     	con.close();

        } catch (Exception e) {
			e.printStackTrace();

		}
	}
}
