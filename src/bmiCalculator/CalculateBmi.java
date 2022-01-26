/* A program which will accept user input for their name, height, and weight, then use the provided 
 * inputs to calculate user's BMI*/
package bmiCalculator;

import java.util.Scanner;  // Importing the Scanner class to allow user input

//Class which contains the main method of the program 
public class CalculateBmi {
	// Main method of the program
	public static void main(String[]args) {
		// Creating an abject of scanner class to allow user input
		Scanner input = new Scanner(System.in);
		// Printing a prompt to ask for user input (name)
		System.out.print("Please enter your name: ");
		// Assigning the name input by the user to a variable  
		String name = input.next();
		// Printing a prompt to ask for user input (height)
		System.out.print("Please enter your height in meters: ");
		// Assigning the height input by the user to a variable 
		float height = input.nextFloat();
		// Printing a prompt to ask for user input (weight)
		System.out.print("Please enter your weight in Kilograms: ");
		// Assigning the weight input by the user to a variable 
		float weight = input.nextFloat();
		// Calculating the user's BMI using their height and weight and assigning it to a variable
		float bmi = weight/(height*height);
		// Printing the users BMI and formating it to only two decimal points
		System.out.printf(name+" your BMI is: %.2f Kg/m^2",(bmi));
}
}