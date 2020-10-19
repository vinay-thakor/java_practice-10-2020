import java.sql.SQLOutput;

public class StaticBlockDemo {
        static int  a;// int = is a datatype

    static {

        int a = 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("This is my main method");
       // System.out.println(a); ?
    }

    static {
        System.out.println("This is my second method");
    }
}
