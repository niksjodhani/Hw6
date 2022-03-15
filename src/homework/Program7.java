package homework;

import java.util.Scanner;

public class Program7 {
    /**
     * Java program to convert temperature from Fahrenheit to Celsius .
     */


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /* Input degree Fahrenheit from user */
        System.out.print("Enter Value in degree Fahrenheit: ");
        float f = in.nextFloat();


        /* Convert Fahrenheit to Celsius  */
        float c = ((f - 32) * 5) / 9;


        /* Print result */
        System.out.println(f + " degree Fahrenheit is equal to " + c + " degree  Celsius .");

    }
}
