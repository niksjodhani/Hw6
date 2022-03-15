package homework;

//upercase to lowercase and lowercase to uppercase it convert autometiclly
// if you put uppercase then it convert lowercase
//if you out lowercase then it convert upercase

import java.util.Scanner;

public class Project19 {
    static Scanner sc;//staic variable

    public static void main(String[] args) {
        String a;

        sc = new Scanner(System.in);

        System.out.print(" Enter Any String and  result is convert to it  =  ");
        a = sc.nextLine();//USER INPUT IS IN TO A

        if (a == a.toLowerCase()) {//if input is lowercase then it convert into uppercase
            String c = a.toUpperCase();
            System.out.println("you enter lowercase string");
            System.out.println(" The Uppercase String  =  " + c);

        } else {//if input uppercase then it convert in to lowercase


            String b = a.toLowerCase();//uppercase to lowercase convert
            System.out.println("you enter Uppercase string");
            System.out.println(" The Lowercase String  =  " + b);

        }

    }
}

