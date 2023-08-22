import java.util.Scanner;

interface student {
    int total();
}

abstract class stu implements student {
    String name;
    int reg;
}

class ug extends stu {
    int ses;
    int ass;
    int end;

    public int total() {
        int sum = this.ses + this.end + this.ass;
        return sum;
    }

    public void set()

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        this.name = sc.nextLine();
        System.out.println("enter reg:");
        this.reg = sc.nextInt();
        System.out.println("enter insem:");
        this.ses = sc.nextInt();
        if (this.ses > 20 || this.ses < 0) {
            System.out.println("invalid");
        }
        System.out.println("enter ass:");
        this.ass = sc.nextInt();
        if (this.ass > 20 || this.ass < 0) {
            System.out.println("invalid");
        }
        System.out.println("enter endsem:");
        this.end = sc.nextInt();
        if (this.end > 20 || this.end < 0) {
            System.out.println("invalid");
        }

    }

    void display() {
        System.out.println(name);
        System.out.println(reg);
        System.out.println(ses);
        System.out.println(ass);
        System.out.println(end);

        System.out.println(total());

    }
}

public class interface2 {
    public static void main(String[] args) {
        ug s = new ug();
        s.set();
        s.display();

    }
}
