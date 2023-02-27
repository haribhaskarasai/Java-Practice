package com.main;

import java.util.Scanner;

import com.dao.UserDao;
import com.dao.UserDaoImp;
import com.model.User;

public class UserMain {
	/*
	 * public static void main(String[] args) { Scanner scanner = new
	 * Scanner(System.in); System.out.println("Enter user Id : "); int temp =
	 * scanner.nextInt(); System.out.println("Enter password : "); String string =
	 * scanner.next(); UserDao userDao = new UserDaoImp(); User user =
	 * userDao.readUserByIdAndPassword(temp, string); if (user != null) {
	 * System.out.println("user Id : " + user.getUserId());
	 * System.out.println("user Name : " + user.getUserName());
	 * 
	 * } else { System.out.println("No such user with id : " + temp); }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserDao userDao = new UserDaoImp();
		System.out.println("Enter user deatails to Create: ");
		System.out.println("Enter userId : ");
		User user1 = new User();
		user1.setUserId(scanner.nextInt());
		System.out.println("Enter user Name: ");
		user1.setUserName(scanner.next());
		System.out.println("Enter user Password: ");
		user1.setUserPassword(scanner.next());
		boolean b = userDao.createUser(user1);
		if (b != false) {
			System.out.println("user Id : " + user1.getUserId());
			System.out.println("user Name : " + user1.getUserName());

		} else {
			System.out.println("User not created! ");
		}

		/*
		 * System.out.println("Enter user Id to Search: "); int tempId1 =
		 * scanner.nextInt(); User user2 = userDao.readUserById(tempId1); if (user2 !=
		 * null) { System.out.println("user Id : " + user2.getUserId());
		 * System.out.println("user Name : " + user2.getUserName());
		 * 
		 * } else { System.out.println("No such user with id : " + tempId1); }
		 */
	}

}
