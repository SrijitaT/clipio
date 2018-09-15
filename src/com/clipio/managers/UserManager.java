package com.clipio.managers;

import com.clipio.dao.UserDao;
import com.clipio.entities.User;

public class UserManager {
	private static UserManager instance = null;
	private static UserDao dao = new UserDao();

	private UserManager() {
	}

	public static UserManager getInstance() {
		if (instance == null) {
			instance = new UserManager();
		}
		return instance;
	}

	public User createUser(long id, String email, String password, String firstName, String lastName, int gender,
			String userType) {

		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setPassword(password);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);

		return user;
	}

	public User[] getUsers() {
		return dao.getUsers();
	}
}
