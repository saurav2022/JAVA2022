class A {
    A() {
        System.out.println("Hello a");
    }

    A(int x) {
        this();
        System.out.println(x);
    }
}

public class ThisConstructor {
    public static void main(String args[]) {
        A a = new A(10);

    }
}
