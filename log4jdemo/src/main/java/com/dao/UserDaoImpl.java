package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.exception.UserException;
import com.model.User;

public class UserDaoImpl implements UserDao {

	// collection=database

	private static List<User> list = new ArrayList();

	@Override
	public User createUser(User user) throws UserException {
		list.add(user);
		return user;
	}

	@Override
	public User readByUserIdAndPassword(int userId, String password) throws UserException {
		User userTemp = null;
		for (User user : list) {
			if (user.getUserId() == userId && user.getPassword().equals(password)) {
				userTemp = user;
			}

		}
		if (userTemp != null) {
			return userTemp;
		} else {
			throw new UserException("No such user");
		}

	}

	@Override
	public List<User> readUsers() {

		return list;
	}

	@Override
	public User updateUser(int searchId, User user) throws UserException {

		User userTemp = null;
		for (User user1 : list) {
			if (user1.getUserId() == searchId) {
				user1.setUserName(user.getUserName());
				user1.setPassword(user.getPassword());
				userTemp = user1;
			}

		}
		if (userTemp != null) {
			return userTemp;
		} else {
			throw new UserException("No such user");
		}
	}

	@Override
	public boolean deleteUserById(int deleatId) throws UserException {

		boolean found = false;
		int index = 01;
		for (User user1 : list) {
			if (user1.getUserId() == deleatId) {
				index = list.indexOf(user1);
				found = true;
			}

		}

		if (found != false) {
			list.remove(index);
			return true;
		} else {
			throw new UserException("No such user");
		}
	}

}
