class account {
    static int balance = 1000;
    void display(String name,int accno)
    {
        System.out.println(name);
        System.out.println(accno);

    }

    synchronized void deposit(int amt) {
        balance += amt;
        System.out.println("BALANCE="+balance);
    }

    synchronized void withdraw(int amt) {
        balance -= amt;
        System.out.println("BALANCE="+balance);

    }
}

class thread1 extends Thread{

    account a;
    String name;
    int accno;
    thread1(account a,String name,int accno)
    {
        this.a=a;
        this.name=name;
        this.accno=accno;
    }
    public void run()
    {
        a.display(name,accno);
        a.deposit(200);
    }

}
class thread2 extends Thread{

    account a;
    String name;
    int accno;
    thread2(account a,String name,int accno)
    {
        this.a=a;
        this.name=name;
        this.accno=accno;
    }
    public void run()
    {
        a.display(name,accno);
        a.withdraw(100);
    }

}
public class mt3 {
public static void main(String[] args) {
    account target=new account();
    thread1 t1=new thread1(target,"saurabh",210953278);
    t1.start();
    thread2 t2=new thread2(target,"ram",210953999);
    t2.start();
}
} 
