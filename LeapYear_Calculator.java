import java.util.Scanner;
public class LeapYear_Calculator {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Welcome to Leap Year Calculator : ");
		 System.out.print("Enter a year which you want to calculate leap year or not : ");
         int year = input.nextInt();
         
         if (year % 400 == 0 ) {
			System.out.println(year +" is a leap year.");
		}
         else if (year % 4 == 0 && year%100!= 0) {
			System.out.println(year + " is a leap year.");
		} 
		 else{
			System.out.println(year + " is not a leap year.");
		}
         System.out.println("Thanku !");
	}

}
