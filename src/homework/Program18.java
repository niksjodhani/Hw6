package homework;

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
// simple print statment
        System.out.println("any enter two number =");
        System.out.println("enter frist number");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();//user input a
        System.out.println("enter second number");
        Scanner sc1= new Scanner(System.in);
        int b= sc1.nextInt();//user input b
        System.out.println(a+""+"+"+b+""+""+"="+""+(a+b));//addition
        System.out.println(a+""+"-"+b+""+""+"="+""+(a-b));//subtraction
        System.out.println(a+""+"*"+b+""+""+"="+""+(a*b));//multipilcation
        System.out.println(a+""+"/"+b+""+""+"="+""+(a/b));//division
        System.out.println(a+""+"mod"+b+""+""+"="+""+(a % b));//persnatege



    }
}
