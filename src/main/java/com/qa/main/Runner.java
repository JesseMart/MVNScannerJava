//package com.qa.main;
//
//import java.util.Scanner;
//
//public class Runner {
//
//	public static Scanner scanner = new Scanner(System.in);
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	
//		int result = 0;
//		boolean flag = true;
//		
//		do {
//		
//		
//			System.out.println("Please enter your number: ");
//			result = Integer.parseInt(scanner.nextLine());
//			
//			System.out.println("");
//			switch(result) {
//			case 1:
//				System.out.println("One");
//				break;
//			case 2: 
//				System.out.println("Two");
//				break;
//			case 0: 
//				System.out.println("Exiting App");
//				flag = false;
//				break;
//				
//				default:
//					System.out.println("We have no idea what u entered here");
//					flag = false;
//					break;
//				
//		}
//		
//	} while(flag);
//		scanner.close();
//	}
//}
package com.qa.main;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		//Declared the two numbers we need 
		int num1, num2;
		
		//Opened a new scanner input
		Scanner scanner = new Scanner(System.in);
		System.out.println("CALCULATOR -- ENTER TWO NUMBERS\n");
		
		//Grabbing first number
		System.out.println("Enter first number: ");	
		num1 = scanner.nextInt();
		//Grabbing Second Number
		System.out.println("Enter second number: ");
		num2 = scanner.nextInt();
		
		//Grabbing the operation using number options as input
		System.out.println("Enter a number matching the operation to perform: \n 1. Add\n 2. Multiply\n 3. Division\n 4. Subtraction");
		int result = scanner.nextInt();
		
		scanner.close();
		
		// Using switch cases to choose right operation to perform
		switch(result) {
		case 1:
			result = num1 + num2;
			break;
		case 2: 
			result = num1 * num2;
			break;
		case 3:
			result = num1 / num2;
			break;
		case 4:
			result = num1 - num2;
			default:
				System.out.println("You input was incorrect! ");
				return;
		}
		System.out.println("Your result of your two numbers is : " + result);
		
		
			
		

	}

}
