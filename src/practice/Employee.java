package practice;

public class Employee {

    int empId;
    String name;
    static String companyName = "Prime Testing";

    public Employee(int empId,String name) {
        this.empId = empId;
        this.name = name;
    }

    // create method

    void display(){
        System.out.println(empId+""+name+""+companyName);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Jones");
        e1.display();
        Employee e2 = new Employee(102,"Peter");
        e2.display();
    }



}
