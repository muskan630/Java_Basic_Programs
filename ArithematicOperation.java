import java.util.Scanner;
public class ArithematicOperation {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to my Arithmetic Operation Calculator");
		System.out.print("Please Enter First Number : ");
		double Firstnum = sc.nextDouble();
		System.out.print("Now, Please Enter Second Number : ");
		double Secondnum = sc.nextDouble();
 
		double sum = Firstnum + Secondnum;
		double subtract = Firstnum - Secondnum;
		double divide = Firstnum / Secondnum);
		float multiply = (float) (Firstnum * Secondnum);
		int modulus = (int) (Firstnum % Secondnum);
		
		System.out.print("Please Enter Your choice, Which arithematic operation you want to run - ");
		String Yourwish = sc.next();
		
		if(Yourwish.equals("sum")) {
			System.out.println("Your Addition is : "+sum);
		}
		else if(Yourwish.equals("subtract")){
			System.out.println("Your Subraction is : "+subtract);
		}
		else if(Yourwish.equals("divide") ) {
			System.out.println("Your Divide is : "+divide);
		}
		else if(Yourwish.equals("modulus")) {
			System.out.println("Your Modulus is : "+modulus);
		}
		else if(Yourwish.equals("multiply")) {
			System.out.println("Your multiply is : "+multiply);
		}
	    else {
	            System.out.println("Invalid operation");
	        }

	        System.out.println("THANK YOU!");
	}

}
