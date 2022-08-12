package com.coderscampus;

import java.util.Scanner;

import java.util.Random;



public class Assigment2Application {

	public static void main(String[] args) {
	
		Random number = new Random();
		Scanner scanner = new Scanner(System.in);
		int randomNumber = number.nextInt(100);
		int turns = 5;
		int guesses = 0;
		int userInput = 0;
   

		 while (guesses<turns)
	     {
	        System.out.println("Pick a number between 1 and 100");
	        userInput = scanner.nextInt();
	       
	           if (userInput < 1 || userInput > 100){
	              System.out.println("Your guess is not between 1 and 100, please try again");
	           }

	           else if (userInput == randomNumber){
	              
	              System.out.println("You win!");

	           }
	           else if (userInput < randomNumber){
	        	   guesses++;
	              System.out.println("Please pick a higher number!");
	           }
	           else if (userInput > randomNumber){
	        	   guesses++;
	              System.out.println("Please pick a lower number!");
	             
	           }
		 if (guesses==turns) {
			System.out.println("You lose! The correct number was: " + randomNumber); 
		 }
		 }
		 scanner.close();
	} 
	}
