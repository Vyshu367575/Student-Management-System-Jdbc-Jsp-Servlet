package com.vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vyshu","root","admin");
			PreparedStatement pst=con.prepareStatement("insert into study values(?,?,?)");
			pst.setInt(1, 102);
			pst.setString(2, "vyshu");
			pst.setString(3, "javafullstack");
			int noOfRows=pst.executeUpdate();
System.out.println("no of rows " +	noOfRows);
		pst.close();
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
