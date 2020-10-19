package practice;

public class B extends A {
    int i = 20;

    B(){
        System.out.println("I am in B class");
    }

    void show(int i) {
        System.out.println(i);//30
        System.out.println(this.i);//20
        System.out.println(super.i);//10 super keyword refers to the immediate parent class instance variable
    }

    public static void main(String[] args) {

        B ob = new B();
       // ob.show(30);


    }
}
