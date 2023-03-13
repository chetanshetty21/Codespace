package com.xworkz.saree.runner;

import java.sql.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class SareeDeleteRunner {
	public static void main(String[] args) {
		
		try (Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/web", "root",
						"Xworkzodc@123")) {
			String deleteQuery = "DELETE FROM saree_table WHERE s_name='bangalore Skills'";
			Statement statement = conObj.createStatement();
			int rowsAffected = statement.executeUpdate(deleteQuery);
			System.out.println("rowsAffected" + rowsAffected);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}