package practice;

// this() keyword can be used to invoke current class constructor

public class ThisDemoConstructor {
    ThisDemoConstructor() {
        this(10);

    System.out.println("This is no argument constructor");

    }

    ThisDemoConstructor(int a) {
        //this();
        System.out.println("This is a parameter constructor");

    }

    public static void main(String[] args) {
        ThisDemoConstructor tc = new ThisDemoConstructor();
    }

}
