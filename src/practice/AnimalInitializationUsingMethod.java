package practice;

public class AnimalInitializationUsingMethod {

    String colour;
    int age;

    public static void main(String[] args) {
        AnimalInitializationUsingMethod ame = new AnimalInitializationUsingMethod();
        ame.initMethod("black",10);
        ame.display();

    }

    public void initMethod(String c, int a){
        colour = c;
         age = a;
    }

    public void display(){
        System.out.println(colour+"  "+age);
    }

}
