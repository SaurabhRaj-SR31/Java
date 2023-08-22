import java.util.Scanner;

interface Sort {
    void sort(Sort a[]);
}

class emp implements Sort {
    Scanner sc = new Scanner(System.in);

    int reg;

    emp() {

    }

    emp(int e) {
        this.reg = e;
    }

    public void sort(Sort a[]) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                emp o1 = (emp) a[j];
                emp o2 = (emp) a[j + 1];

                if (o1.reg > o2.reg) {
                    int temp = o1.reg;
                    o1.reg = o2.reg;
                    o2.reg = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(((emp) a[i]).reg + " ");
        }
        System.out.println(" ");

    }
}

class student implements Sort {
    int id;
    Scanner sc = new Scanner(System.in);

    student() {

    }

    student(int s) {
        this.id = s;
    }

    public void sort(Sort a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                student o1 = (student) a[j];
                student o2 = (student) a[j + 1];

                if (o1.id > o2.id) {
                    int temp = o1.id;
                    o1.id = o2.id;
                    o2.id = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(((student) a[i]).id + " ");
        }
        System.out.println(" ");
    }
}

public class interface1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no.:");
        int n = sc.nextInt();
        emp e1 = new emp();
        student s1 = new student();

        Sort[] e = new emp[n];
        Sort[] s = new student[n];
        System.out.println("enter id:");
        for (int i = 0; i < n; i++) {

            e[i] = new emp(sc.nextInt());

        }
        e1.sort(e);
        System.out.println("enter reg:");
        for (int i = 0; i < n; i++) {
            s[i] = new student(sc.nextInt());

        }
        s1.sort(s);

    }
}
