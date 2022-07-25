class Animal {
    void eat() {
        System.out.println("eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("bark");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weep");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }

}
