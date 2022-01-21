package TriangleApp;
// How to find the area of a triangle
import java.util.Scanner;
public class TriangleApp {
    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is you Name : ");
        // String input
        String name = keyboard.nextLine();

        // Numerical input
        System.out.println("Give the height value of the triangle : ");
        float height = keyboard.nextFloat();
        System.out.println("Give the base value of the triangle : ");
        float base = keyboard.nextFloat();
        // Calc   Area
        float area = (height*base)/2;
        System.out.println("Ok " + name + "" + "The area of the triangle  is : " + area);
    }
}
