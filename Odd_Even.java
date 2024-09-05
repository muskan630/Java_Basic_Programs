import java.util.Scanner;
public class Odd_Even {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome Odd Even Checker Calculator : ");
		System.out.print("Enter Your Number that you want check number is odd or even : ");
		float number = input.nextFloat();
		
		if (number % 2 == 0) {
			System.out.println(number +" is even number.");
		} else {
			System.out.println(number +" is odd number.");
		}
		System.out.println("Thank You !");
	}
}
