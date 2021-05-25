package calculatorExercise;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("CALCULATOR -- ENTER TWO NUMBERS\n");
		
		System.out.println("Enter first number: ");	
		num1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		num2 = scanner.nextInt();
		
		System.out.println("Enter a number matching the operation to perform: \n 1. Add\n 2. Multiply\n 3. Division\n 4. Subtraction");
		int result = scanner.nextInt();
		
		scanner.close();
		
		
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
