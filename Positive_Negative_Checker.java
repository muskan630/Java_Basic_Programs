import java.util.Scanner;
public class Positive_Negative_Checker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to my positive-negative checker : ");
		System.out.print("Please Enter your number that you want to check number is negative or positive : ");
		double number = input.nextDouble();
		
		if (number > 0) {
			System.out.println(number +" is positive number ");
		} else if (number < 0) {
			System.out.println(number +" is negative number");
		} else {
			System.out.println(number +" is Zero number");
		}
	}
}
