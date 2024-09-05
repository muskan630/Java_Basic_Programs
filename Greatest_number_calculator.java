import java.util.Scanner;

public class Greatest_number_calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Three Greater number of calculator : ");
		System.out.print("Please Enter first number - ");
		float First_num = input.nextFloat();
		System.out.print("Now Enter second number - ");
		float Second_num = input.nextFloat();
		System.out.print("Well, Enter third number - ");
		float Third_num = input.nextFloat();
		
		if (First_num >= Second_num && First_num>=Third_num) {
			 System.out.println(First_num +" is greater than ");
		} else if(Second_num >= Third_num) {
			 System.out.println(Second_num +" is greater number");
		}
		else {
			System.out.println(Third_num +" is greater number");
		}
		System.out.println("Thank You !");
	}

}
