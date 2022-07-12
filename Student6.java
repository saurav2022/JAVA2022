class Student {
    int id;
    String name;

    /* Default constructor */
    Student() {
        id = 0;
        name = "";
    }

    Student(int id) {
        this.id = id;
    }

    // Parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void populateFields(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Student6 {
    public static void main(String args[]) {
        Student s1 = new Student(2000, "Nikolay");
        Student s2 = new Student(3000, "Greg");
        s1.display();
        s2.display();
    }
}
