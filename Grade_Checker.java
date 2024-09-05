import java.util.Scanner;
public class Grade_Checker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Grade Checker : ");
		System.out.print("Please enter marks : ");
		float marks = input.nextFloat();
		
		if (marks >= 90 ) {
			System.out.println("Well Done ! You have got A grade.");
		} else if (marks >= 75){
			System.out.println("Good ! You have got B grade");
		} else if (marks >= 60) {
			System.out.println("You have got C grade. Work harder for next time !");
		} else if (marks >= 30){
			System.out.println("Need to work hard ! You have got D grade !");
		} else {
			System.out.println("Sorry, You Failed ! You have got E grade");
		}
	}
}
