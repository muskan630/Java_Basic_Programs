import java.util.Scanner;

public class Perimeter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Want Area Calculator or Perimeter Calculator? ");
        String area_peri = input.nextLine();  // Use nextLine() to capture full input

        if (area_peri.equalsIgnoreCase("Perimeter Calculator")) {
            System.out.println("Welcome to Perimeter Calculator!");
            System.out.print("Which perimeter do you want to find? Square/Rectangle/Triangle/Circle/Parallelogram - ");
            String choice_quadri = input.nextLine();  // Use nextLine() to capture full input

            if (choice_quadri.equalsIgnoreCase("Square")) {
                System.out.print("Please enter the side of the square in cm: ");
                float sq_side = input.nextFloat();
                float square_peri = 4 * sq_side;
                System.out.println("The perimeter of the square is: " + square_peri + " cm");
            } else if (choice_quadri.equalsIgnoreCase("Rectangle")) {
                System.out.print("Please enter the length of the rectangle in cm: ");
                float rect_length = input.nextFloat();
                System.out.print("Now please enter the breadth of the rectangle in cm: ");
                float rect_breadth = input.nextFloat();
                float rect_peri = 2 * (rect_length + rect_breadth);
                System.out.println("The perimeter of the rectangle is: " + rect_peri + " cm");
            } else if (choice_quadri.equalsIgnoreCase("Triangle")) {
                System.out.print("Please enter the first side of the triangle in cm: ");
                float tri_1side = input.nextFloat();
                System.out.print("Now please enter the second side of the triangle in cm: ");
                float tri_2side = input.nextFloat();
                System.out.print("Now please enter the third side of the triangle in cm: ");
                float tri_3side = input.nextFloat();
                float triangle_peri = tri_1side + tri_2side + tri_3side;
                System.out.println("The perimeter of the triangle is: " + triangle_peri + " cm");
            } else if (choice_quadri.equalsIgnoreCase("Circle")) {
                System.out.print("Please enter the radius of the circle in cm: ");
                float circle_radius = input.nextFloat();
                float circle_peri = 2 * (float) Math.PI * circle_radius;
                System.out.println("The circumference of the circle is: " + circle_peri + " cm");
            } else if (choice_quadri.equalsIgnoreCase("Parallelogram")) {
                System.out.print("Please enter the base of the parallelogram in cm: ");
                float para_base = input.nextFloat();
                System.out.print("Please enter the side of the parallelogram in cm: ");
                float para_side = input.nextFloat();
                float para_peri = 2 * (para_base + para_side);
                System.out.println("The perimeter of the parallelogram is: " + para_peri + " cm");
            } else {
                System.out.println("Invalid choice. Please run the program again and select a valid shape.");
            }

        } else if (area_peri.equalsIgnoreCase("Area Calculator")) {
            System.out.println("Welcome to Area Calculator!");
            System.out.print("Which area do you want to find? Square/Rectangle/Triangle/Circle/Parallelogram - ");
            String choice_shape = input.nextLine();  // Use nextLine() to capture full input

            if (choice_shape.equalsIgnoreCase("Square")) {
                System.out.print("Please enter the side of the square in cm: ");
                float sq_side = input.nextFloat();
                float square_area = sq_side * sq_side;
                System.out.println("The area of the square is: " + square_area + " cm^2");
            } else if (choice_shape.equalsIgnoreCase("Rectangle")) {
                System.out.print("Please enter the length of the rectangle in cm: ");
                float rect_length = input.nextFloat();
                System.out.print("Now please enter the breadth of the rectangle in cm: ");
                float rect_breadth = input.nextFloat();
                float rect_area = rect_length * rect_breadth;
                System.out.println("The area of the rectangle is: " + rect_area + " cm^2");
            } else if (choice_shape.equalsIgnoreCase("Triangle")) {
                System.out.print("Please enter the base of the triangle in cm: ");
                float tri_base = input.nextFloat();
                System.out.print("Now please enter the height of the triangle in cm: ");
                float tri_height = input.nextFloat();
                float triangle_area = 0.5f * tri_base * tri_height;
                System.out.println("The area of the triangle is: " + triangle_area + " cm^2");
            } else if (choice_shape.equalsIgnoreCase("Circle")) {
                System.out.print("Please enter the radius of the circle in cm: ");
                float circle_radius = input.nextFloat();
                float circle_area = (float) Math.PI * circle_radius * circle_radius;
                System.out.println("The area of the circle is: " + circle_area + " cm^2");
            } else if (choice_shape.equalsIgnoreCase("Parallelogram")) {
                System.out.print("Please enter the base of the parallelogram in cm: ");
                float para_base = input.nextFloat();
                System.out.print("Please enter the height of the parallelogram in cm: ");
                float para_height = input.nextFloat();
                float para_area = para_base * para_height;
                System.out.println("The area of the parallelogram is: " + para_area + " cm^2");
            } else {
                System.out.println("Invalid choice. Please run the program again and select a valid shape.");
            }

        } else {
            System.out.println("Invalid option. Please run the program again and choose either 'Area Calculator' or 'Perimeter Calculator'.");
        }

        System.out.println("Thank you!");
    }
}
