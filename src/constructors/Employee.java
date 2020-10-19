package constructors;
/*
1. constructor is a block (similar to method)  - having same name as that of class Name
2. does not have any return type, not even void
3. the only modifiers applicable for constructor are public, private , default, protected
4. it execute automatically when we create an object
5. it use to initialize an object (not to create object)
6. if compiler create default constructor so it can not decide which will be return type
7. 1. Default constructor(no argument con.) 2. no -arg con.(user defined) 3. Parameterized
    constructor create by programmer.
 */

public class Employee {
    String name;
    int emp_id;

    public Employee(String name, int emp_id){ // parameterized constructor
        System.out.println(this.name = name); //this.name  = name;
        System.out.println(this.emp_id = emp_id);
        System.out.println("Parameterized constructor");
        //System.out.println(name,emp_id);

    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Viany",01);
        Employee e2 = new Employee("Prime",1);
       // System.out.println(e1.name,e1.emp_id);

    }
}
