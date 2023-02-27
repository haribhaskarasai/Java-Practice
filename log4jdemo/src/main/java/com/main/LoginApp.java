package com.main;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.exception.UserException;
import com.model.User;

public class LoginApp {
	private static final Logger LOGGER = LogManager.getLogger(LoginApp.class);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserDao userDao = new UserDaoImpl();
		System.out.println("Enter Your choice");
		System.out.println("To create user                  : 1");
		System.out.println("To read all  users              : 2");
		System.out.println("To read user by id and passward : 3");
		System.out.println("To update user                  : 4");
		System.out.println("To delete user                  : 5");
		System.out.println("To exit                         : 6");
		int key = scanner.nextInt();
		boolean iterate = true;
		while (iterate) {
			switch (key) {
			case 1:
				System.out.println("Enter user id : ");
				int usetId = scanner.nextInt();
				LOGGER.info("Entered user id : " + usetId);

				System.out.println("Enter user name : ");
				String name = scanner.next();
				LOGGER.info("Entered user name : " + name);

				System.out.println("Enter password : ");
				String pswd = scanner.next();
				LOGGER.info("Entered user password : " + pswd);

				User user = new User();
				user.setUserId(usetId);
				user.setUserName(name);
				user.setPassword(pswd);
				try {
					User user2 = userDao.createUser(user);
					System.out.println("Welcome :" + user2.getUserName());
				} catch (UserException e) {
					LOGGER.error(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 2:
				// list all the user
				List<User> users = userDao.readUsers();
				for (User user2 : users) {
					LOGGER.info(user2.getUserId());
					LOGGER.info(user2.getUserName());
					LOGGER.info(user2.getPassword());

				}

				break;
			case 3:
				try {
					System.out.println("Enter User id to login :");
					int searchId = scanner.nextInt();
					System.out.println("Enter User password to login :");
					String searchPswd = scanner.next();
					User receive = userDao.readByUserIdAndPassword(searchId, searchPswd);
					System.out.println("Search : " + receive.getUserName());
				} catch (UserException e) {
					LOGGER.error(e.getMessage());
				}
				break;
			case 4:
				try {
					System.out.println("Enter User id to update :");
					int searchId = scanner.nextInt();

					User user1 = new User();
					System.out.println("Enter user name to update : ");
					String name1 = scanner.next();
					LOGGER.info("Entered user name : " + name1);
					System.out.println("Enter password to update: ");
					String pswd1 = scanner.next();
					LOGGER.info("Entered user password : " + pswd1);

					user1.setUserName(name1);
					user1.setPassword(pswd1);

					User receive = userDao.updateUser(searchId, user1);
					System.out.println("updated user name     : " + receive.getUserName());
					System.out.println("updated user password : " + receive.getPassword());
				} catch (UserException e) {
					LOGGER.error(e.getMessage());
				}
				break;
			case 5:
				try {
					System.out.println("Enter User id to delete :");
					int deleatId = scanner.nextInt();

					boolean receive = userDao.deleteUserById(deleatId);
					System.out.println("delete successful!");

				} catch (UserException e) {
					LOGGER.error(e.getMessage());
				}
				break;

			case 6:
				System.out.println("Bye Bye! don't come Again!");
				iterate = false;

			}
			if (iterate == true) {
				System.out.println("Enter Your choice");
				System.out.println("To create user                  : 1");
				System.out.println("To read all  users              : 2");
				System.out.println("To read user by id and passward : 3");
				System.out.println("To update user                  : 4");
				System.out.println("To delete user                  : 5");
				System.out.println("To exit                         : 6");
				key = scanner.nextInt();
			}
		}

	}

}
