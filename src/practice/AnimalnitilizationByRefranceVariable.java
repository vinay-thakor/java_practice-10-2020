package practice;

public class AnimalnitilizationByRefranceVariable {

    String colour;
    int age;

    public static void main(String[] args) {
        AnimalnitilizationByRefranceVariable arv = new AnimalnitilizationByRefranceVariable();
        arv.age = 10;
        arv.colour = "Black";
        System.out.println("Colour of animal is " +arv.colour + " and Age of animal is    "+arv.age);

    }
}
