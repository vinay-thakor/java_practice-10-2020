package practice;
// this keyword is the reference variable that refers to the current object

public class ThisNewProgramme {

    int i ;
    void setValue(int i){
        this.i=i;

    }

    void show(){
        System.out.println(i);
    }

    public static void main(String []args){
        ThisNewProgramme tn1 = new ThisNewProgramme();

        tn1.setValue(10);
        tn1.show();
    }


}
