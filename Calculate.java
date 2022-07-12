public class Calculate {
    static int cube(int x) {
        return x * x * x;
    }

    // int a = 20;

    public static void main(String args[]) {
        // static methods can directly be called by the class without instantiation.
        int r = Calculate.cube(5);
        System.out.println(r);
        // System.out.println(a);
    }
}
