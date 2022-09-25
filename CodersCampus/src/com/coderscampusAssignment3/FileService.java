package com.coderscampusAssignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
	public User[] users(String filePath) throws IOException {
		UserService userService = new UserService();
		BufferedReader fileReader = null;
		User[] userArray = new User[4];
		int i = 0;
		try {
			fileReader = new BufferedReader(new FileReader(filePath));
			String line = "";
			try {
				while ((line = fileReader.readLine()) != null) {
					String[] userDataArray = line.split(",");
					User user = userService.createUser(userDataArray[0], userDataArray[1], userDataArray[2]);
					userArray[i] = user;
					i++;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				fileReader.close();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userArray;
	}

}
