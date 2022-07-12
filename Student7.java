class Student {
    int rollNo;
    String name, course;
    float fees;

    Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    Student(int rollNo, String name, String course, float fees) {
        this(rollNo, name, course);
        this.fees = fees;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + course + " " + fees);
    }

}

public class Student7 {

    public static void main(String args[]) {
        Student s1 = new Student(111, "Amal", "Java");
        Student s2 = new Student(112, "Bimal", "Python", 50);
        s1.display();
        s2.display();
    }

}
