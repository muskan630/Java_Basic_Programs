import java.util.Scanner;
public class Even_Odd_Bitwise {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Welcome to Even Odd Calculator using bitwise operator!");
		System.out.print("Enter a number that want to check for odd or even - ");
		int num = input.nextInt();
		
		if ((num & 1) == 1){
			System.out.println("Your number is odd");
		} else {
			System.out.println("Your number is even");
		}
	}

}
