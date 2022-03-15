package homework;
// a Java program that takes three numbers as input to calculate and
//print the average of the numbers
import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {

        System.out.println("enter first value=>");
        Scanner sc =new Scanner(System.in);//user input
        double a = sc.nextInt();
        System.out.println("enter second value=>");
        Scanner sc1 =new Scanner(System.in);//user input
        double b = sc1.nextInt();
        System.out.println("enter third value=>");//user input

        Scanner sc2 =new Scanner(System.in);
        double c = sc2.nextInt();
        double d =(a+b+c)/3;//avrege of three number
        System.out.println(d);





    }
}
