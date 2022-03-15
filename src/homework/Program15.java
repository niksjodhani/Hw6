package homework;

import java.util.Scanner;
//a Java program to swap two variables.

public class Program15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first variable or name");
        String a = sc.next();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter second variable or name");
        String b = sc.next();
        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        String temp = a;//temporary save the value of variable
        a = b;// b is give the value of a
        b = temp;//b is take vale of a

        System.out.println("After swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

