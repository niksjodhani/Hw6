package homework;

//this program is declaire two static variable and  satic method
//all decalration is calling in main method
public class Program2 {
    //Declare static variables
    static int a = 10;
    static int b = 20;

    //Declare static method
    public static void test() {
        System.out.println(a);
        System.out.println(b);
    }

    // declare main class and calling static method in main class
    public static void main(String[] args) {

        test();//static clss calling in static main method

    }


}
