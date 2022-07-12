class Student {
    int id;
    String name;

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
}

public class Student2 {
    public static void main(String args[]) {
        Student s = new Student(102, "Alex");
        System.out.println(s.id);
        System.out.println(s.name);

        Student s1 = new Student();
        s1.id = 100;
        s1.name = "Swati";
        Student s2 = new Student();
        s2.populateFields(101, "Patrick");

        Student s3 = new Student(104);

        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s3.id);
        System.out.println(s3.name);
    }
}
