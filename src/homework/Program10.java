package homework;
//table program
import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//user input
        System.out.println("\"ENTER NUMBER\"=>");
        int a = sc.nextInt();
        for (int i=1 ; i<=10;i++) {//forloop condition
            System.out.println(a + "*" + i + "="+a * i);
        }
    }

}
