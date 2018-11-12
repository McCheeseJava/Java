package jdbc;
import java.sql.*;
import oracle.jdbc.*;
import oracle.jdbc.pool.OracleDataSource;

public class JDBCVersion
{

	private OracleDataSource ods;
	private Connection conn;
	private Statement stmt;
	private DatabaseMetaData meta;

	public void initDB(){

		try{
			ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:hr/hr@localhost:1521/XE");
			conn = ods.getConnection();
			stmt = conn.createStatement(); //or stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			meta = conn.getMetaData();
			System.out.println("JDBC driver version being use in this application: " + meta.getDriverVersion());
		}
		catch(SQLException e){
			e.printStackTrace();
		}

	}


	public void drop() throws SQLException{
		String dropTableBooks = "drop table books";
		stmt.executeUpdate(dropTableBooks);
	}


	public void create() throws SQLException{
    	String createTableBooks = "CREATE TABLE BOOKS (BNAME VARCHAR(15), BID INTEGER)";
		stmt.executeUpdate(createTableBooks);
    }


    public void insert() throws SQLException{
		String insertToBooks = "INSERT INTO BOOKS VALUES('YourBook', 2)";
		stmt.executeUpdate(insertToBooks);
	}


	public void update() throws SQLException{
		String updateBooks = "UPDATE BOOKS SET BNAME='LOUSY_BOOK' WHERE BNAME='YourBook'";
		stmt.executeUpdate(updateBooks);
	}


	public void view() throws SQLException{
		String viewBooks = "SELECT BNAME, BID FROM BOOKS";
		ResultSet rs = stmt.executeQuery(viewBooks);

		ResultSetMetaData rsmd = rs.getMetaData();
        int numberOfColumns = rsmd.getColumnCount();
        System.out.println("number of columns returned:  " + numberOfColumns );

		while (rs.next()) {

						String bname = rs.getString("BNAME");
						int      bid = rs.getInt("BID");
					    System.out.println(bname +  "    "  +  bid);
		}

    }



  public static void main (String args[]) throws SQLException
  {

	JDBCVersion obj = new JDBCVersion();
	obj.initDB();

	  try{

		 obj.drop();
		 try{
			  obj.create();
			  obj.insert();
			  obj.update();
		      obj.view();
		 }

		 catch(SQLException e) {}
	  }


	  catch (SQLException e){
		 try{
		 			  obj.create();
		 			  obj.insert();
		 			  obj.update();
		 		      obj.view();
		 }

		 catch(SQLException e1) {}

	  }



    /*

    PreparedStatement updateCountry = conn.prepareStatement("UPDATE COUNTRIES SET COUNTRY_NAME = ? WHERE REGION_ID LIKE ?");
	updateCountry.setString(1, "Nimbia");
	updateCountry.setInt(2, 1);
    System.out.println("number of rows updated:  " +  updateCountry.executeUpdate()  );


    String query =  "SELECT COUNTRY_NAME, REGION_ID FROM COUNTRIES WHERE REGION_ID=1";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				String c = rs.getString("COUNTRY_NAME");
				String r = rs.getString("REGION_ID");
			    System.out.println(c +  "    "  +  r);
		}

     */

  }

}