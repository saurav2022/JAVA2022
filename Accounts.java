class Account {
    int acc_no;
    String name;
    float amount;

    void insert(int a, String n, float am) {
        acc_no = a;
        name = n;
        amount = am;
    }

    void deposit(float amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited succesfully.");
    }

    void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance!");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn succesfully.");
        }
    }

    void checkBalance() {
        System.out.println("Balance is " + amount);
    }

    void display() {
        System.out.println(acc_no + " " + name + " " + amount);
    }

}

public class Accounts {
    public static void main(String args[]) {
        Account a1 = new Account();
        a1.insert(12345, "Bob", 1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(2000);
        a1.checkBalance();
        a1.withdraw(500);
        a1.checkBalance();
    }
}
