package homework;

import java.util.Scanner;

public class Program17 {


    /**
     * Java Program to convert Decimal number to Binary Number
     */
    public static void main(String[] args) {
        long dec;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter a Decimal Number");
        dec = scanner.nextLong();

        // Calling decimalToBinary method to convert decimal
        // number to binary
        System.out.println("Binary Number : " + decimalToBinary(dec));
    }

    /**
     * Method to convert a decimal number to binary number
     */
    public static long decimalToBinary(long n) {
        long remainder, binary = 0, i = 1;

        while (n != 0) {
            remainder = n % 2;
            n = n / 2;
            binary = binary + (remainder * i);
            i = i * 10;
        }
        return binary;
    }
}

