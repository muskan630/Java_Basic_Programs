import java.util.Scanner;
public class Fahrenheit_to_Celsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("What do you want to calculate: Fahrenheit to Celsius or Celsius to Fahrenheit? ");
        String Calcu = input.nextLine();
        
        if (Calcu.equalsIgnoreCase("Fahrenheit to Celsius")) {
            System.out.println("Welcome to the Fahrenheit to Celsius Calculator:");
            System.out.print("Enter your temperature in F: ");
            float fah_temp = input.nextFloat();
            
            float cel = (fah_temp - 32) * 5 / 9;
            System.out.println("Your temperature is " + cel + " C");
        }
        else if (Calcu.equalsIgnoreCase("Celsius to Fahrenheit")) {
            System.out.println("Welcome to the Celsius to Fahrenheit Calculator:");
            System.out.print("Enter your temperature in C: ");
            float cel_temp = input.nextFloat();
            
            float fah = (cel_temp * 9 / 5) + 32;
            System.out.println("Your temperature is " + fah + " F");
        }
        else {
            System.out.println("Invalid option selected.");
        }
    }
}











