
import java.io.*;
import java.util.Scanner;

class Above80Exception extends Exception {
    int detail;

    Above80Exception(int a) {
        detail = a;
    }

    public String toString() {
        return "CAUGHT THE EXCEPTION " + detail;
    }
}

class FileOperation implements Serializable {
    String name;
    int roll_no;
    int marks;

    FileOperation(String n, int rn, int m) {
        name = n;
        roll_no = rn;
        marks = m;
    }

    public void WriteStudentDetails(FileOperation f) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.txt"));
            oos.writeObject(f);
        } catch (Exception e) {
        }
    }

    public void ReadStudentDetails(FileOperation f) throws Above80Exception {
        if (f.marks < 80) {
            try {
                throw new Above80Exception(f.marks);
            } catch (Above80Exception e) {
                System.out.println(e);
            }
        } else {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.txt"));
                FileOperation f2 = (FileOperation) ois.readObject();
                System.out.println(f2.name + " " + f2.roll_no + " " + f2.marks);
            } catch (Exception e) {
            }
        }
    }
}

class Thread1 extends Thread {
    FileOperation f123;

    Thread1(FileOperation f) {
        f123 = f;
        this.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                f123.WriteStudentDetails(f123);
            }
        } catch (Exception e) {
        }
    }
}

class Thread2 extends Thread {
    FileOperation f124;

    Thread2(FileOperation f) {
        f124 = f;
        this.start();
    }

    public void run() {
        try {
            f124.ReadStudentDetails(f124);
        } catch (Above80Exception e) {
        }
    }
}

class jaanvioop {
    public static void main(String args[])  {
       try{ Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("ENTER NAME : ");
            String name = sc.next();
            System.out.println("ENTER ROLL NO. : ");
            int r_n = sc.nextInt();
            System.out.println("ENTER MARKS [OOP] : ");
            int m = sc.nextInt();
          
            FileOperation f = new FileOperation(name, r_n, m);
            Thread1 t1 = new Thread1(f);
            try {
                t1.join();
            } catch (InterruptedException e) {
            }
            Thread2 t2 = new Thread2(f);
        }}
        catch(Exception e)
        {
            
        }
    }
}