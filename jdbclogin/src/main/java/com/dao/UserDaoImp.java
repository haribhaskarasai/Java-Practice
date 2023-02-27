package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.User;

public class UserDaoImp implements UserDao {

	@Override
	public boolean createUser(User user) {
		PreparedStatement preparedStatement = null;
		User user2=null;
		Connection connection = MySQLConnectionCheck.getConnection();
		String insert = " INSERT INTO user(userid,username,password)VALUES(?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setInt(1, user.getUserId());
			preparedStatement.setString(2, user.getUserName());
			preparedStatement.setString(3, user.getUserPassword());
			preparedStatement.execute();
			user2=readUserById(user.getUserId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(user2!=null) {
			return true;
		}
		return false;
	}

	@Override
	public User readUserById(int userId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		User user = null;
		Connection connection = MySQLConnectionCheck.getConnection();
		String read = "SELECT * FROM user WHERE userId=?";
		try {
			preparedStatement = connection.prepareStatement(read);
			preparedStatement.setInt(1, userId);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				user = new User();
				user.setUserId(resultSet.getInt("userid"));
				user.setUserName(resultSet.getString("userName"));
				user.setUserPassword(resultSet.getString("password"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User readUserByIdAndPassword(int userId, String Password) {
		String autQuary = "SELECT * FROM user WHERE userid=? and password=?";
		Connection connection = MySQLConnectionCheck.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(autQuary);
			preparedStatement.setInt(1, userId);
			preparedStatement.setString(2, Password);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("Success" + resultSet.getInt("userid"));
				System.out.println("Success name " + resultSet.getString("username"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteUserById(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUserByName(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

}
