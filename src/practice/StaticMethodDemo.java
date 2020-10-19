package practice;
/*
1. static method belongs to the class , not to the objects
2. A static method can be accessed directly by the class name and dose not need any object.
3.
 */

public class
StaticMethodDemo {

    static int a =10; // create a static variable
    int b = 20; // create a non static / instance variable / globle variable

    public static void main(String[] args) {
        //importance(); // static method can call directly
        StaticMethodDemo.importance();//

        // create object to access non static method
        StaticMethodDemo sd = new StaticMethodDemo();
        System.out.println(sd.b);


    }

    // create a static method

    static void importance(){
        System.out.println(a);
    }

    // create a instance method
    void methodTwo(){
        System.out.println(b);
    }
}
