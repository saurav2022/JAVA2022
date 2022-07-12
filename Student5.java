class Student {
    int id;
    String name;

    // Static variable
    static String college = "WC";

    // Static method
    static void change() {
        college = "UOT";
    }

    /* Default constructor */
    Student() {
        id = 0;
        name = "";
    }

    Student(int i) {
        id = i;
    }

    // Parameterized constructor
    Student(int ii, String nm) {
        id = ii;
        name = nm;
    }

    void populateFields(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}

public class Student5 {
    public static void main(String args[]) {
        Student.change();
        Student s1 = new Student(2000, "Nikolay");
        Student s2 = new Student(3000, "Greg");
        s1.display();
        s2.display();
    }
}
