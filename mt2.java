class even implements Runnable {

    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }

                Thread.sleep(100);
            }
        } catch (InterruptedException ne) {

        }
    }
}

class odd implements Runnable {
    public void run() {

        try {

            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }

                Thread.sleep(1000);
            }
        } catch (InterruptedException ne) {

        }

    }
}

public class mt2 {
    public static void main(String[] args) {

        even e = new even();
        Thread t1 = new Thread(e);
        odd o = new odd();
        Thread t2 = new Thread(o);
        t1.setPriority(10);
        
        t2.setPriority(1);
        t1.start();

        t2.start();
        // t1.setName("even");
        // System.out.println(t1);
        //

        // try{
        // t1.join();
        // }
        // catch (InterruptedException ne) {

        // }

        // t2.setName("odd");
        // System.out.println(t2);
        // System.out.println(t2.isAlive());

        // try{
        // t2.join();
        // }
        // catch (InterruptedException ne) {

        // }
        // try {
        //     for (int i = 0; i < 20; i++) {
        //         if (i % 5 == 0) {
        //             System.out.println("main thread:" + i);
        //         }

        //         Thread.sleep(1000);
        //     }
        // } catch (InterruptedException ne) {

        // }
        // System.out.println("main exiting");

        // System.out.println(t1.isAlive());

    }

}
