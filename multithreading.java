class even implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class odd implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class print implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) 
             {
                System.out.print(i + " ");
            }
        
    }
}

public class multithreading {
    public static void main(String[] args) {

        even e = new even();
        Thread t1 = new Thread(e);
        t1.start();
        

        try {

            t1.join();
        } catch (InterruptedException ne) {

        }
        odd o = new odd();
        Thread t2 = new Thread(o);
        t2.start();
        
        try {

            t2.join();
        } catch (InterruptedException ne) {

        }
        print p  = new print();
        Thread t3 = new Thread(p);
        t3.start();

    }

}
