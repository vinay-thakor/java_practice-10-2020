package practice;

// this keyword is used to invoke current class instance variable

public class ThisDemo {
    int i; // it is instance variable which declare out side the method and with the class#

    void setVale(int i){
        this.i=i;

    }
    void show(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        ThisDemo td = new ThisDemo();
        td.setVale(100);
        td.show();
    }
}
