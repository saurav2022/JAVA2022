class A {
    int data;
}

class B {
    A obj;

    B(A obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.data);
    }
}

public class ThisMethod2 {
    public static void main(String args[]) {
        A a = new A();
        a.data = 100;
        B b = new B(a);
        b.display();
    }
}
