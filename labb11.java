import java.util.Scanner;

class thread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class labb11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter choice:");
        System.out.println("a.runnable interface");
        System.out.println("b.Thread class");
while(true){
        char ch = sc.next().charAt(0);
        System.out.println();
        switch (ch) {
            case 'a':
                thread1 ob1 = new thread1();
                Thread t = new Thread(ob1);
                t.start();
                break;
                case 'b':
                thread2 ob2 = new thread2();
               
                ob2.start();
                break;
                default :return;
        }
    }}

}
