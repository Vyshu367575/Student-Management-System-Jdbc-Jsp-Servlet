package com.vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CURD {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vyshu","root","admin");
			Statement st = con.createStatement();
			 st.executeUpdate("create table studies(id int,name varchar(50),course varchar(50))");
		      System.out.println("table is create sucessfully!,check in db");
		      
		      PreparedStatement pst=con.prepareStatement("insert into studies values(?,?,?)");
				pst.setInt(1, 102);
				pst.setString(2, "vyshu");
				pst.setString(3, "javafullstack");
				int noOfRows=pst.executeUpdate();
				System.out.println("no of rows " +	noOfRows);
				
				PreparedStatement stmt = (PreparedStatement) con.createStatement();
		        ResultSet rs = stmt.executeQuery("SELECT * FROM studies");
		        while(rs.next()) {
		            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		        }
						
	    		PreparedStatement st1 = con.prepareStatement("update studies set course=? where id=?");
						 st1.setString(1,"Hibernet");
						 st1.setInt(2, 102);
						 int rowsUpdated =st1.executeUpdate();
						 System.out.println("no of rows updated:"+rowsUpdated);
						
	    		PreparedStatement st11 = con.prepareStatement("DELETE from studies=? where id=?");
						 st11.setInt(1, 1);
						 st11.executeUpdate();
						 con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
