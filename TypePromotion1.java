public class TypePromotion1 {
    void sum(int a, long b) {
        System.out.println("int - long");
        System.out.println(a + b);
    }

    void sum(long a, long b) {
        System.out.println("long - long");
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {

        TypePromotion1 tp = new TypePromotion1();
        tp.sum(20, 30);
        tp.sum(20, 30, 40);

    }

}
