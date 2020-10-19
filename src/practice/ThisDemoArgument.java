package practice;

// this keyword can be used to pass as an argument in the call

public class ThisDemoArgument {
    void m1(ThisDemoArgument ta) {
        System.out.println("I am M1 method");
    }
    void m2(){
        m1(this);

    }

    public static void main(String[] args) {
        ThisDemoArgument ta = new ThisDemoArgument();
        ta.m2();
    }
}
