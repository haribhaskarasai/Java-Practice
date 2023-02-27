package com.dao;

import com.model.User;

public interface UserDao {
	public abstract boolean createUser(User user);
	public abstract User readUserById(int userId);
	public abstract User readUserByIdAndPassword(int userId,String Password);
	public abstract int updateUser(User user);
	public abstract boolean deleteUserById(int userId);
	public abstract boolean deleteUserByName(String userName);

}
