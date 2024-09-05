import java.util.Scanner;
public class Bitwise_Operation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Welcome to Bitwise Operator Calculator : ");
		System.out.print("By Which type of operator do you want to calculate operator in bitwise operator : ");
		String operator = input.next();
		
		if (operator.equalsIgnoreCase("AND")) {
			System.out.println("Please enter first number : ");
			int num1 = input.nextInt();
			System.out.println("Now Please enter second number : ");
			int num2 = input.nextInt();
			int result = num1 & num2;
			System.out.println("Your result is " +result);
		}else if(operator.equalsIgnoreCase("Or")){
			System.out.println("Please enter first number : ");
			int num1 = input.nextInt();
			System.out.println("Now Please enter second number : ");
			int num2 = input.nextInt();
			int result = num1 | num2;
			System.out.println("Your result is " +result);
		}else if(operator.equalsIgnoreCase("XOR")) {
			System.out.println("Please enter first number : ");
			int num1 = input.nextInt();
			System.out.println("Now Please enter second number : ");
			int num2 = input.nextInt();
			int result = num1^num2;
			System.out.println("Your result is " +result);
		}else if (operator.equalsIgnoreCase("NOT")) {
			System.out.println("Please enter first number : ");
			int num = input.nextInt();
			int result = ~num;
			System.out.println("Your result is " +result);
		}else if (operator.equalsIgnoreCase("LeftShiftOperator")) {
			System.out.println("Please enter first number : ");
			int num = input.nextInt();
			int result = num<<1;
			System.out.println("Your result is " +result);
		}else if(operator.equalsIgnoreCase("RightShiftOperator")){
			System.out.println("Please enter first number : ");
			int num = input.nextInt();
			int result = num>>1;
			System.out.println("Your result is " +result);
		}else {
			System.out.println("Invalid choice");
		}
	}

}
