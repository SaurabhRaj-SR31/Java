class Student {
    long reg;
    String name;
    int age;

    Student(long reg, String name, int age) {
        this.reg = reg;
        this.name = name;
        this.age = age;

    }

}

class UG extends Student {
    int sem;
    double fees;

    UG(long reg, String name, int age, int sem, double fees) {

        super(reg, name, age);
        this.sem = sem;
        this.fees = fees;

    }

    void show() {
        System.out.println("REGISTRATION NO.: " + reg);
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
        System.out.println("SEM: " + sem);
        System.out.println("FEES: " + fees);

    }

}

class PG extends Student {
    int sem;
    double fees;

    PG(long reg, String name, int age, int sem, double fees) {

        super(reg, name, age);
        this.sem = sem;
        this.fees = fees;

    }

    void show() {
        System.out.println("REGISTRATION NO.: " + reg);
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
        System.out.println("SEM: " + sem);
        System.out.println("FEES: " + fees);
        System.out.println(".....................................");

    }

}

public class studentdriver {
    public static void main(String[] args) {
        UG u = new UG(210953278, "SAURABH", 19, 3, 10000000);
        PG p = new PG(210953000, "RAJ", 21, 7, 40000000);

        u.show();
        p.show();

    }
}
