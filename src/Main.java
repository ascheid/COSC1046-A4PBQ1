import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int decimalValue;
		int remainder;
		String hexValue = "";
		
		//Hex chars from 0 - 15
		char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9','A','B','C','D','E','F'};
		
		
		//Scanner used of data entry from keyboard
		Scanner s = new Scanner(System.in);
		
		
		//Prompt the user to enter an integer between 0 and 255
		System.out.print("Enter a decimal value(0-255): ");
		decimalValue = s.nextInt();
		
		//Input verification if it is inside the specified value 0 - 255
		while(decimalValue < 0 || decimalValue > 255) {
			System.out.println("Wrong entry! The value must be an integer between 0 - 255");
			System.out.print("Enter a decimal value(0-255): ");
			decimalValue = s.nextInt();
		}
		
		//While the decimal value hasn't been all isolated, each iteration its going to take one hex digit
		while(decimalValue > 0) {
			
			remainder = decimalValue % 16;
			hexValue = hex[remainder] + hexValue; 
			decimalValue = decimalValue/16;
			
		}
		
		//Displaying the result
		System.out.println("The hex value is " + hexValue);
		
		//Closing the scanner
		s.close();
	}

}
