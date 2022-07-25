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

public class SimpleInheritance {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }

}
