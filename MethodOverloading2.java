// Method Overloading by changing datatype of arguments
// Method Overloading is not possible by merely changing the return type of the method
class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        System.out.println(Adder.add(1, 2));
        System.out.println(Adder.add(1.5, 2.7));
    }
}
