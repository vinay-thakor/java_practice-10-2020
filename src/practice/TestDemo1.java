package practice;

// this keyword can be used to invoke current class method(implicitly)
// if you don't use the this keyword, compiler automatically adds this keyword while invoking the method

public class TestDemo1 {
    void display(){
        System.out.println("Hello.....");
    }

    void show(){
        display();
       // this.display();
    }

    public static void main(String[] args) {
        TestDemo1 td = new TestDemo1();
        td.show();
    }
}
