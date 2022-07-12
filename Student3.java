public class Student3 {
    int id;
    String name;

    Student3() {
        id = 0;
        name = "";
    }

    Student3(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor
    Student3(Student3 another_student) {
        id = another_student.id;
        name = another_student.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Student3 s1 = new Student3(2000, "Nikolay");
        Student3 s2 = new Student3(s1);
        s1.display();
        s2.display();
    }
}
