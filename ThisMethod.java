class A {
    void m(A obj) {
        System.out.println("method is invoked.");
    }

    void p() {
        m(this);
    }
}

public class ThisMethod {
    public static void main(String args[]) {
        A a = new A();
        a.p();
    }
}
