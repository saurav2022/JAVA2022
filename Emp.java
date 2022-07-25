public class Emp {

    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.country + " " + address.state);
    }

    public static void main(String[] args) {
        Address a1 = new Address("Toronto", "Ontario", "CA");
        Emp e1 = new Emp(100, "Swati", a1);

        Address a2 = new Address("New Jersey", "NY", "USA");
        Emp e2 = new Emp(101, "Prabhakar", a2);

        e1.display();
        e2.display();

    }
}
