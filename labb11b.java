class even implements Runnable {
    public void run() {
       System.out.println("in thread 1");
    }
}

class odd implements Runnable {
    public void run() {
        System.out.println("in thread 2");
       
    }
}

class print implements Runnable {
    public void run() {
        System.out.println("in thread 3");
    
        
    }
}

public class labb11b{
    public static void main(String[] args) {

        even e = new even();
        Thread t1 = new Thread(e);
        t1.start();
       

        // try {

        //     t1.join();
        // } catch (InterruptedException ne) {

        // }
        odd o = new odd();
        Thread t2 = new Thread(o);
        t2.start();
        
        // try {

        //     t2.join();
        // } catch (InterruptedException ne) {

        // }
        print p  = new print();
        Thread t3 = new Thread(p);
        t3.start();

    }

}


    

