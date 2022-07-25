class Bank {
    int getROI() {
        return 0;
    }
}

class RBC extends Bank {
    int getROI() {
        return 5;
    }
}

class ScotiaBank extends Bank {
    int getROI() {
        return 6;
    }
}

class TD extends Bank {
    int getROI() {
        return 7;
    }
}

public class MethodOverriding1 {
    public static void main(String[] args) {
        RBC r = new RBC();
        ScotiaBank s = new ScotiaBank();
        TD t = new TD();

        System.out.println(r.getROI());
        System.out.println(s.getROI());
        System.out.println(t.getROI());
    }

}
