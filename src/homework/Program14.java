package homework;
//a Java program to print the area and perimeter of a rectangle.
import java.util.Scanner;

public class Program14 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Hight of the Rectangle:");
        float l = s.nextFloat();
        System.out.println("Enter the width of the Rectangle:");
        float b = s.nextFloat();
        System.out.println("Expected Output:");
        System.out.println("area is " + l + "" + "*" + "" + b + "=" + l * b);
        float perimeter = 2 * (l + b);
        System.out.println("perimeter is 2* " + l + "" + "" +"+"+ +  b + "= " + perimeter);
    }
}

