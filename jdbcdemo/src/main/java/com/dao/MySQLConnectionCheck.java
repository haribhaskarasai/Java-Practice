package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.model.User;

public class MySQLConnectionCheck {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatment = null;
		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/db1";
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, "root", "Reset123");
			System.out.println(connection != null ? "connection established" : "connection failed");
			String readQueary = "SELECT * FROM user";
			String readyQuaryById = "INSERT INTO user values('1002','hari','bye')";
			String readByUser = "select * from user where userid=?";
			preparedStatment = connection.prepareStatement(readByUser);
			System.out.println("search a user by id :");
			Scanner scanner = new Scanner(System.in);
			int tempVar = scanner.nextInt();
			preparedStatment.setInt(1, tempVar);
			resultSet = preparedStatment.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("userId"));
				System.out.println(resultSet.getString("username"));
				System.out.println(resultSet.getString("password"));
			}

			statement = connection.createStatement();
			resultSet = statement.executeQuery(readQueary);
			User user = null;

			while (resultSet.next()) {
				user = new User();
				user.setUserId(resultSet.getInt("userId"));
				user.setUserName(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));

			}
			if (user != null) {
				System.out.println(user.getUserId());
				System.out.println(user.getUserName());
				System.out.println(user.getPassword());
			}

		} catch (ClassNotFoundException cnfe) {
			System.out.println("There is no respective jars : " + cnfe.getMessage());
		} catch (SQLException se) {// Catching SQL Exception
			System.out.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
