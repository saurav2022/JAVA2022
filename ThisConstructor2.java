class A {
    A() {
        this(5);
        System.out.println("Hello a");
    }

    A(int x) {
        System.out.println(x);
    }
}

public class ThisConstructor2 {
    public static void main(String args[]) {
        A a = new A();

    }
}
