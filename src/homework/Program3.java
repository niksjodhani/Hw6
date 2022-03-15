package homework;

//this program is declare one static variable and one instance variable and static method and instance method
//all declarations is calling in main method
public class Program3 {
    //Declare instance variables
    int a = 10;//instance variable
    static String name = "Nikunj";//static variable

    //Declare instance method
    public void test() {
        System.out.println("this is output from instance method");
        System.out.println(a);
        System.out.println(name);
    }

    public static void test1() {
        Program3 obj = new Program3();
        System.out.println("this is output from static method");
        System.out.println(name);
        System.out.println(obj.a);
    }

    // declare main class and calling instance method in main class
    public static void main(String[] args) {
        Program3 obj = new Program3();//calling instance in static main method via obj
        obj.test();//instance clss calling in static main method via obj
        test1();//static clss calling in static main method
    }
}
