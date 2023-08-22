class Num {
    int val;

    Num() {

    }

    Num(int n) {
        val = n;
    }

    int Factorial(int num) {
        if (num <= 0)
            return 1;
        else
            return num * Factorial(num - 1);
    }

    void istrong(int num) {
        int sum = 0,p=0;
        int x = num;
        while(x > 0) 
        {
            int fact = 1;
            int rem = x % 10;
            fact = Factorial(rem);
            sum += fact;
            x=x / 10;
            
        }

        if (num ==sum) {
      p=1;
        }
        if(p==1)
        {
            System.out.println("strong no.");

        }
        else
        {
            System.out.println(" not strong no.");
        }
       
    }

    void isfriendly(Num a, Num b) {
        int i, j;
        int sum1 = 0, sum2 = 0;
        for (i = 1; i < a.val; i++) {
            if (((a.val) % i == 0)) {
                sum1 += i;

            }

        }
        for (j = 1; j < b.val; j++) {
            if (((b.val) % j == 0)) {
                sum2 += j;

            }

        }
        if ((sum1 % a.val == 0) && (sum2 % b.val == 0)) {
            System.out.println("friendly");
        } else {
            System.out.println(" not friendly");

        }

    }

}

public class Number {
    public static void main(String[] args) {
        Num a = new Num(6);
        Num b = new Num(28);
        Num c = new Num();
        c.isfriendly(a, b);
        c.istrong(145);
    }
}
