/**
 * 
 */

/**
 * @author muttahirmumtaz
 *
 */

import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try //Try block is to check in the number has a valid type of int
		{
			int[] array = {5, 4, 3, 1, 2};
			
			Scanner reader = new Scanner(System.in);
			
			System.out.println("Enter number to search = ");
		  
			int userInput = reader.nextInt(); //Gets the user input
		  
			reader.close(); //Close the Scanner instance to avoid warning
			
			int indexOfANumber = findNumber (array, userInput); //Sends the array and target number to the function called findNumber
			
			//The the function returns -1, this means the number does not exist in the array
			if (indexOfANumber != -1) {
				System.out.println("The number is at index = " + indexOfANumber);
			}
			else {
				System.out.println("Number not found");
			}
		}
		catch(InputMismatchException exception) //if the entered number is not of int value
		{
		  System.out.println("This is not an integer");
		}

	}
	
	public static int findNumber (int[] array, int target) {
		
		int index = 0;
		
		for (index = 0 ; index < array.length ; index++) {
			if(array[index] == target) {
				return index;
			}
		}
		
		return -1;
		
	}

}
