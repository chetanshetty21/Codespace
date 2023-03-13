package com.xworkz.saree.runner;

import java.sql.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class SareeInsertRunner {

	public static void main(String[] args) {
		try (Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/web", "root",
				"Xworkzodc@123")) {
			String insertQuery = "insert into saree_table value(0,'mysore sliks','sliks','gpay','small','red')";
			Statement statement = conObj.createStatement();
			int rowsAffected = statement.executeUpdate(insertQuery);
			System.out.println("rowsAffected" + rowsAffected);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
