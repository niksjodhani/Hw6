package homework;
//uppercase to lowercase convert
import java.util.Scanner;

public class Program9 {


    static Scanner sc;//staic variable

    public static void main(String[] args) {
        String a;

        sc = new Scanner(System.in);

        System.out.print(" Enter Uppercase String to convert =  ");
        a = sc.nextLine();//USER INPUT IS IN TO A


        String b = a.toLowerCase();//uppercase to lowercase convert
        System.out.println(" The Lowercase String  =  " + b);
    }
}


