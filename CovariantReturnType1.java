class A {
    A get() {
        return this;
    }
}

public class CovariantReturnType1 extends A {
    @Override
    CovariantReturnType1 get() {
        return this;
    }

    void message() {
        System.out.println("This is an example of covariant return type");
    }

    public static void main(String[] args) {
        new CovariantReturnType1().get().message();
    }

}
