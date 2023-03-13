package com.xworkz.saree.runner;
import java.sql.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;
public class SareeUpdateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/web", "root",
				"Xworkzodc@123")) {
			String updateQuery = "UPDATE saree_table SET s_name = 'bangalore Skills', s_material= 'mysore' WHERE s_id = 20";
			Statement statement = conObj.createStatement();
			int rowsAffected = statement.executeUpdate(updateQuery);
			System.out.println("rowsAffected" + rowsAffected);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
