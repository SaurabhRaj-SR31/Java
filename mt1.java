class palin extends Thread {
    String check;

    palin(String str) {
        check = str;

    }

    public void run() {

        String s = ((new StringBuffer(check)).reverse().toString());
        if (check.equals(s)) {
            System.out.println("palindrome");
        } else {
            System.out.println(" not palindrome");

        }
    }
}

class reverse extends Thread {
    String check;

    reverse(String str) {
        check = str;

    }

    public void run() {

        String s = ((new StringBuffer(check)).reverse().toString());
        System.out.println(s);
    }
}

class search extends Thread {
    String check;

    search(String str) {
        check = str;

    }

    public void run() {
        if (check.contains("ram")) {
            System.out.println("yes");
        } else
            System.out.println("no");

    }
}

public class mt1 {
    public static void main(String[] args) {

        String str = "abc  ram def";
        palin p = new palin(str);
        reverse r = new reverse(str);
        search s = new search(str);
        p.setPriority(Thread.MAX_PRIORITY);
        r.setPriority(s.getPriority() + 1);
        s.setPriority(Thread.MIN_PRIORITY);
        System.out.println(p.getPriority());
        System.out.println(r.getPriority());

        System.out.println(s.getPriority());

        p.start();
        r.start();
        s.start();

        // try{
        // p.join();

        // }
        // catch(InterruptedException ne){

        // }

        // try{
        // r.join();

        // }
        // catch(InterruptedException ne){

        // }

    }
}
