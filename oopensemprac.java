import java.util.Scanner;

import java.io.*;

class employee implements Serializable {
    // Scanner sc = new Scanner(System.in);

    String name;
    int id;
    int leavebalance;
    int dateto;
    int datefrom;
    String leavetype;

    // employee() {
    // System.out.println("enter emp name :");
    // this.name = sc.nextLine();
    // System.out.println("enter emp id:");
    // this.id = sc.nextInt();
    // }
    employee() {
    }

    employee(String name, int id) {

        this.name = name;
        this.id = id;
    }

    public synchronized void update(employee ee[]) {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter emp leave type:");
            ee[i].leavetype = sc.nextLine();
            System.out.println("enter emp datefrom:");
            ee[i].datefrom = sc.nextInt();
            System.out.println("enter emp datefrom:");
            ee[i].dateto = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (ee[i].leavetype.equalsIgnoreCase("casual")) {
                ee[i].leavebalance = 12 - (ee[i].datefrom - ee[i].dateto);
                if (ee[i].leavebalance > 0) {
                    System.out.println(ee[i]);
                } else { 
                    System.out.println("leave over!!");
                }
            } else if (ee[i].leavetype.equalsIgnoreCase("compensatory")) {
                ee[i].leavebalance = 13 - (ee[i].datefrom - ee[i].dateto);
            } else {
                ee[i].leavebalance = 10 - (ee[i].datefrom - ee[i].dateto);
            }

        }

    }

    public String toString() {
        return "name:" + name + " id:" + id + " leavetype:" + leavetype + " leavebalance:" + leavebalance;
    }

}

class thread1 extends Thread {
    employee e1 = new employee("aaa", 21);
    employee e2 = new employee("bbb", 31);
    employee e3 = new employee("ccc", 41);
    // employee e4=new employee("ddd",51);
    // employee e5=new employee("eee",61);

    // thread1(employee e1, employee e2, employee e3, employee e4, employee e5) {
    // this.e1 = e1;
    // this.e2 = e2;
    // this.e3 = e3;
    // this.e4 = e4;
    // this.e5 = e5;

    // }

    public void run() {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Saurabh Raj\\Desktop\\java\\emp.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e1);
            oos.writeObject(e2);
            oos.writeObject(e3);
            // oos.writeObject(e4);
            // oos.writeObject(e5);
            oos.flush();
            oos.close();

        } catch (IOException ie) {
            System.out.println("exception in serialization1:" + ie.getMessage());
            System.exit(0);
        } catch (Exception ie) {
            System.out.println("exception in deserialization1:" + ie.getMessage());
            System.exit(0);
        }

    }
}

class thread2 extends Thread {

    employee e;
    employee ee[] = new employee[10];

    thread2(employee target) {
        this.e = target;
    }

    public void run() {
        try {

            FileInputStream fis = new FileInputStream("C:\\Users\\Saurabh Raj\\Desktop\\java\\emp.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            for (int i = 0; i < 3; i++) {

                ee[i] = (employee) ois.readObject();

                // Scanner sc = new Scanner(System.in);
                // System.out.println("enter emp leave type:");
                // ee[i].leavetype = sc.nextLine();
                // System.out.println("enter emp datefrom:");
                // ee[i].datefrom = sc.nextInt();
                // System.out.println("enter emp datefrom:");
                // ee[i].dateto = sc.nextInt();
            }
            e.update(ee);
            // for (int i = 0; i < 5; i++) {
            // if (ee[i].leavetype.equalsIgnoreCase("casual")) {
            // ee[i].leavebalance = 12 - (ee[i].datefrom - ee[i].dateto);
            // if (ee[i].leavebalance > 0) {
            // System.out.println(ee[i]);
            // } else {
            // System.out.println("leave over!!");
            // }
            // } else if (ee[i].leavetype.equalsIgnoreCase("compensatory")) {
            // ee[i].leavebalance = 13 - (ee[i].datefrom - ee[i].dateto);
            // } else {
            // ee[i].leavebalance = 10 - (ee[i].datefrom - ee[i].dateto);
            // }

            // }
            // ee2 = (employee) ois.readObject();
            // ee3 = (employee) ois.readObject();
            // ee4 = (employee) ois.readObject();
            // ee5 = (employee) ois.readObject();
            ois.close();

            // System.out.println(ee1);
            // System.out.println(ee2);
            // System.out.println(ee3);
            // System.out.println(ee4);
            // System.out.println(ee5);

            // Scanner sc = new Scanner(System.in);
            // System.out.println("enter emp-1 leave type:");
            // ee1.leavetype=sc.nextLine();
            // System.out.println("enter emp-1 datefrom:");
            // ee1.datefrom=sc.nextInt();
            // System.out.println("enter emp-1 datefrom:");
            // ee1.dateto=sc.nextInt();

            // System.out.println("enter emp-2 leave type:");
            // ee2.leavetype=sc.nextLine();
            // System.out.println("enter emp-2 datefrom:");
            // ee2.datefrom=sc.nextInt();
            // System.out.println("enter emp-2 datefrom:");
            // ee2.dateto=sc.nextInt();

            // System.out.println("enter emp-3 leave type:");
            // ee3.leavetype=sc.nextLine();
            // System.out.println("enter emp-3 datefrom:");
            // ee3.datefrom=sc.nextInt();
            // System.out.println("enter emp-3 datefrom:");
            // ee3.dateto=sc.nextInt();

        } catch (IOException ie) {
            System.out.println("exception in serialization2:" + ie.getMessage());
            System.exit(0);
        } catch (Exception ie) {
            System.out.println("exception in deserialization2:" + ie.getMessage());
            System.exit(0);
        }

        // System.out.println(ee1);
        // System.out.println(ee2);
        // System.out.println(ee3);
    }

}

public class oopensemprac {
    public static void main(String[] args) {
        employee target = new employee();
        // employee e1 = new employee();

        // employee e2 = new employee();

        // employee e3 = new employee();
        // // System.out.println("enter emp name :");
        // // e3.name = sc.nextLine();
        // // System.out.println("enter emp id:");
        // // e3.id = sc.nextInt();

        // employee e4 = new employee();
        // // System.out.println("enter emp name :");
        // // e4.name = sc.nextLine();
        // // System.out.println("enter emp id:");
        // // e4.id = sc.nextInt();

        // employee e5 = new employee();
        // System.out.println("enter emp name :");
        // e5.name = sc.nextLine();
        // System.out.println("enter emp id:");
        // e5.id = sc.nextInt();

        thread1 t1 = new thread1();
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException ie) {
            System.out.println("exception while joining");
        }

        thread2 t2 = new thread2(target);
        t2.start();

    }
}
