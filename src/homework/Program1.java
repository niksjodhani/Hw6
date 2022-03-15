package homework;

//print simple value
//this program is declaire  two instance variable  and instance method
//all decalration is calling in main method
public class Program1 {
    //Declare instance variables
    int a = 10;
    int b = 20;

    //Declare instance method
    public void test() {
        System.out.println(a);
        System.out.println(b);
    }

    // declare main class and calling instance method in main class
    public static void main(String[] args) {
        Program1 obj = new Program1();
        obj.test();//instance clss calling in static main method via obj

    }

}
