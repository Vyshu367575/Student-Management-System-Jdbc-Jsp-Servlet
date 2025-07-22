package com.vc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vyshu","root","admin");
			
			 PreparedStatement st = Con.prepareStatement("update study set course=? where id=?");
			 st.setString(1,"Hibernet");
			 st.setInt(2, 102);
			 int rowsUpdated =st.executeUpdate();
			 System.out.println("no of rows updated:"+rowsUpdated);
			
			
			
			st.close();
			Con.close();			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
