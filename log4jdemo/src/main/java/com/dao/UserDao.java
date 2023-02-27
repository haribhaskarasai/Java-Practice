package com.dao;

import java.util.List;

import com.exception.UserException;
import com.model.User;

public interface UserDao {
	public abstract User createUser(User user) throws UserException;
	public abstract User readByUserIdAndPassword(int userId,String password) throws UserException;
	public abstract List<User> readUsers();
	
	public abstract User updateUser(int searchId,User user) throws UserException;
	public abstract boolean deleteUserById(int deleatId) throws UserException;
	

}
