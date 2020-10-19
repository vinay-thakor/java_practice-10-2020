package practice;



public class Animal{

    public static void main(String[] args) {
        System.out.println(" 1");
        Animal buzo = new Animal();
        buzo.eat();
        buzo.run();
        Bird sp = new Bird();
        sp.fly();
        // another way to do this by useing extends keyword
        // buzo.fly(); inheritance concepts we can used here too
    }
    public void eat() {
        System.out.println(" I am eating......");
    }
    public void run() {
        System.out.println(" I am running......");
    }
}
