import java.util.Scanner;
public class Perimeter {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Want Area Calculator or Perimeter Calculator ?  ");
    String area_peri = input.next(); 
    if (area_peri.equalsIgnoreCase("Perimeter Calculator")) {
      System.out.println("Welcome to Perimeter Calculator !");
	  System.out.print("Which Perimeter do u want to find ? Square/Rectangle/Triangle/Circle/Parallelogram - ");
	  String choice_quadri = input.next();
	
      if(choice_quadri.equalsIgnoreCase("Square")) {
		  System.out.print("Please Enter side of square in cms : ");
		  float sq_side = input.nextFloat();
		  float square_peri = 4*sq_side;
		  System.out.println("The Perimeter of Square is : "+ square_peri + "cm" );
	  }
	  else if(choice_quadri.equalsIgnoreCase("Rectangle")) {
		  System.out.print("Please Enter Length of rectangle in cms : ");
		  float rect_length = input.nextFloat();
		  System.out.print("Now Please Enter Breadth of rectangle in cms : ");
		  float rect_breadth = input.nextFloat();
		  float rect_peri = 2*(rect_length + rect_breadth);
		  System.out.println("The Perimeter of Rectangle is : "+ rect_peri +"cm");  
	  }
	  else if(choice_quadri.equalsIgnoreCase("Triangle")) {
		  System.out.print("Please Enter first side of triangle in cms : ");
		  float tri_1side = input.nextFloat();
		  System.out.print("Now Please second side of triangle in cms : ");
		  float tri_2side = input.nextFloat();
		  System.out.print("Now Please third side of triangle in cms : ");
		  float tri_3side = input.nextFloat();
		  float triangle_peri = tri_1side + tri_2side + tri_3side;
		  System.out.println("The Perimeter of Triangle is : " +triangle_peri +"cm");
	  }
	  else if(choice_quadri.equalsIgnoreCase("Circle")) {
		  System.out.print("Please enter radius of circle : ");
		  float circle_radius = input.nextFloat();
		  float circle_peri = 2*(float)Math.PI*circle_radius;
		  System.out.println("The Circumference of circle is : " +circle_peri +"cm");
	  }
	  else if(choice_quadri.equalsIgnoreCase("Parallelogram")) {
		  System.out.print("Please Enter base of Parallelogram in cms : ");
		  float para_base = input.nextFloat();
		  System.out.print("Please Enter side of Parallelogram in cms :");
		  float para_side = input.nextFloat();
		  float para_peri = 2*(para_base + para_side);
		  System.out.println("The Perimeter of Parallelogram is : " +para_peri +"cm");
	  }
	  else {
          System.out.println("Invalid choice. Please run the program again and select a valid shape.");
      }
	 }
	else {
		System.out.println("Welcome to Area Calculator !");
		 System.out.print("Which Area do u want to find - Square/Rectangle/Triangle/Circle/Parallelogram - ");
		 String choice_shape = input.next();
		 
		 if(choice_shape.equalsIgnoreCase("Square")) {
			  System.out.print("Please Enter side of square in cms : ");
			  float sq_side = input.nextFloat();
			  float square_area = sq_side*sq_side;
			  System.out.println("The Area of Square is : "+ square_area + "cm^2" );
		 }
		 else if(choice_shape.equalsIgnoreCase("Rectangle")) {
			  System.out.print("Please Enter Length of rectangle in cms : ");
			  float rect_length = input.nextFloat();
			  System.out.print("Now Please Enter Breadth of rectangle in cms : ");
			  float rect_breadth = input.nextFloat();
			  float rect_area = rect_length * rect_breadth;
			  System.out.println("The Area of Rectangle is : "+ rect_area +"cm^2");  
		  }
		  else if(choice_shape.equalsIgnoreCase("Triangle")) {
			  System.out.print("Please Enter base of triangle in cms : ");
			  float tri_base = input.nextFloat();
			  System.out.print("Now Please height of triangle in cms : ");
			  float tri_height = input.nextFloat();
			  float triangle_area = (float)(0.5* tri_base *tri_height) ;
			  System.out.println("The Area of Triangle is : " +triangle_area +"cm^2");
		  }
		  else if(choice_shape.equalsIgnoreCase("Circle")) {
			  System.out.print("Please enter radius of circle : ");
			  float circle_radius = input.nextFloat();
			  float circle_area = 2*22/7*circle_radius*circle_radius;
			  System.out.println("The Area of circle is : " +circle_area +"cm^2");
		  }
		  else if(choice_shape.equalsIgnoreCase("Parallelogram")) {
			  System.out.print("Please Enter base of Parallelogram in cms : ");
			  float para_base = input.nextFloat();
			  System.out.print("Please Enter height of Parallelogram in cms :");
			  float para_height= input.nextFloat();
			  float para_area = (para_base * para_height);
			  System.out.println("The Area of Parallelogram is : " +para_area +"cm^2");
		  }
		  else {
	          System.out.println("Invalid choice. Please run the program again and select a valid shape.");
	      }
     }
	 System.out.println("Thanku ! ");
	  
	}

}
