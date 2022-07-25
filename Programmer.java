//Superclass  or Parent class
class Employee {
    float salary = 110000;
}

// Subclass or child class
public class Programmer extends Employee {
    int bonus = 20000;

    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Salary of programmer is " + p.salary);
        System.out.println("Bonus of programmer is " + p.bonus);
    }
}