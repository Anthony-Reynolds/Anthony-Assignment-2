package com.coderscampusAssignment3;

public class UserService {
	public User createUser ( String UserName, String password, String name) {
		User user = new User(UserName, password, name);
		user.setUserName(UserName);
		user.setPassword(password);
		user.setName(name);
		return user;
	}

}
