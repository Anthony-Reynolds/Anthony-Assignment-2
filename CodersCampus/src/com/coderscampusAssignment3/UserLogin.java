package com.coderscampusAssignment3;

import java.io.IOException;
import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) throws IOException {
		UserLogin userLogin = new UserLogin();
		userLogin.start();
	}

	private void start() throws IOException {
		FileService fileService = new FileService();
		User[] users = fileService.users("data.txt");
		int d = 0;
		while (d < 5) {

			for (User user : users) {
				d++;

				System.out.println("please enter your user name");
				Scanner userName = new Scanner(System.in);
				String showUserName = userName.nextLine();

				System.out.println("please enter your password");
				Scanner userPassword = new Scanner(System.in);
				String showUserPassword = userPassword.nextLine();
				if (user.getUserName().equals(showUserName) && user.getPassword().equals(showUserPassword)) {
					System.out.println("Welcome " + user.getName());
					d=6;
					userName.close();
					userPassword.close();
					break;
				} else if ( d<4 && !user.getUserName().equals(showUserName)
						 && !user.getPassword().equals(showUserPassword)) {
					System.out.println("wrong password, please try again");
				}
				if (d == 5) {
					System.out.println("Too many failed login attempts, you are now locked out");
					userName.close();
					userPassword.close();
					break;
				}

			}
		}
	}

}
