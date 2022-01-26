/*Program which accepts user input for the length and width of a rectangle, compute the rectangle's 
area and perimeter, and then print area and perimeter in short, integer, long, and double data types */

package areaCalculator;  

import java.util.Scanner;  // Importing the Scanner class to allow user input

// Class which contains the main method of the program 
public class CalculateArea {

// Main method of the program
	public static void main(String[] args) {
		// Printing a prompt to ask for user inputs (length)
		System.out.print("Please enter rectangle's length. Must be an integer: ");
		// Creating an abject of scanner class to allow user input
		Scanner input = new Scanner(System.in);
		// Assigning the length input by the user to a variable  
		int length = input.nextInt();
		// Printing a prompt to ask for user inputs (width)
		System.out.print("Please enter rectangle's width. Must be an integer: ");
		// Assigning the width input by the user to a variable
		int width = input.nextInt();
		// Calculating the rectangle's perimeter and assigning it to a variable
		int rectanglePerimeter = (2*length)+(2*width);
		// Calculating the rectangle's area and assigning it to a variable
		int rectangleArea = length*width;
        // Printing the perimeter using short datatype by explicit casting 
		System.out.println("The perimeter of the rectangle using short data type is: "+ (short)(rectanglePerimeter));
		// Printing the perimeter using int datatype 
		System.out.println("The perimeter of the rectangle using integer data type is: "+ rectanglePerimeter);
		// Printing the perimeter using long datatype by implicit casting 
		System.out.println("The perimeter of the rectangle using long data type is: "+(long)(rectanglePerimeter));
		// Printing the perimeter using double datatype by implicit casting 
		System.out.printf("The perimeter of the rectangle using double data type is %.4f \n",(double)(rectanglePerimeter));
		// Printing the area using short datatype by explicit casting 
		System.out.println("The area of the rectangle using short data type is: "+ (short)(rectangleArea));
		// Printing the area using int datatype 
		System.out.println("The area of the rectangle using integer data type is: "+ rectangleArea);
		// Printing the area using long datatype by implicit casting 
		System.out.println("The area of the rectangle using long data type is: "+(long)(rectangleArea));
		// Printing the area using double datatype by implicit casting 
		System.out.printf("The area of the rectangle using double data type is %.4f \n",(double)(rectangleArea));
	}

}
