package com.NJC_AdityaChatterjee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieProject {

	public static void main(String[] args) {
		
		Connection conn=null;
		Statement stmt=null;
		
		String query="select * from movies";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/NJC_Labs",
				"root","aditya");
			
			stmt=conn.createStatement();
			
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				String movie_name=rs.getString("Movie_Name");
				String lead_actor=rs.getString("Lead_Actor");
				int Release_Year=rs.getInt("Release_Year");
				String director=rs.getString("Director_Name");
				
				System.out.println(movie_name+lead_actor+Release_Year+director);
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(stmt!=null) {
					stmt.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
