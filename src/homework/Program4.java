package homework;

//this program is declaire two static variable and two instance variable and satic method and instance method
//all decalration is calling in main method
public class Program4 {
    int a = 100;//instance variable
    String name = "Nikunj";//instance variable
    static int b = 200;//static variable
    static String surename = "Jodhani";//static variable

    //calling all in main method
    public static void main(String[] args) {
        Program4 obj = new Program4();
        obj.test1();//instance clss calling in static main method via obj
        test2();//static clss calling in static main method
    }

    public void test1() {//instanc method
        System.out.println("\"this result is instance method\"");
        System.out.println(a);
        System.out.println(b);
        System.out.println(surename);
        System.out.println(name);
    }

    public static void test2() {//static method
        Program4 obj = new Program4();
        System.out.println("\"this result is static method\"");
        System.out.println(obj.a);
        System.out.println(b);
        System.out.println(surename);
        System.out.println(obj.name);
    }
}
