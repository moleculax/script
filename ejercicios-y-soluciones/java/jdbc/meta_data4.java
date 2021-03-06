// ******************************************************************
// * File    : meta_data4.java
// * Author  : Peter Crompton
// * Date    : 16th October 2000
// *
// * Purpose : Example of handling meta data for the database.
// *
// ******************************************************************

import java.sql.*;
import oracle.jdbc.driver.*;

class meta_data4
{
public static void main (String args [])
throws SQLException
{

// Load the Oracle JDBC driver
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
String url = "jdbc:oracle:thin:pc/pc@127.0.0.1:1521:pc" ;

// Open a database connection
Connection conn = DriverManager.getConnection( url );

// Create Oracle DatabaseMetaData object
DatabaseMetaData meta = conn.getMetaData ();

// gets driver info:
System.out.println("\n JDBC driver version is: " + meta.getDriverVersion());

System.out.println("\n SQL92 Non-Standard key words: " + meta.getSQLKeywords()) ;

System.out.println("\n Search String escape: " + meta.getSearchStringEscape()) ;

System.out.println("\n String functions supported: " + meta.getStringFunctions()) ;

// Close the database connection
conn.close() ;
}
}
