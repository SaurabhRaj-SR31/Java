
import java.util.Scanner;

public class special2 {
    public static void main(String[] args) {
        System.out.println("enter no.:");
        /*
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int x = n;
         */
        /*
         * //..........................................................
         * // automorphic no.
         * 
         * int r = n % 10;
         * int y = n * n % 10;
         * 
         * if (r == y) {
         * System.out.println("automorphic no.");
         * } else
         * System.out.println("not automorphic no.");
         */
        // .............................................................

        // buzz no.
        /*
         * int r = n % 10;
         * if(r==7||n%7==0)
         * {
         * System.out.println("buzz no.");
         * } else
         * 
         * {
         * System.out.println("not buzz no.");
         * }
         */

        // ...............................................................

        // coprime
        /*
         * Scanner sc = new Scanner(System.in);
         * int a = sc.nextInt();
         * System.out.println("enter no.:");
         * int i;
         * 
         * int hcf = 0;
         * int b = sc.nextInt();
         * for (i = 1; i <= a; i++) {
         * 
         * if (a % i == 0 && b % i == 0) {
         * hcf = i;
         * 
         * }
         * }
         * if (hcf == 1) {
         * System.out.println("coprime no.");
         * } else
         * 
         * {
         * System.out.println(" not coprime no.");
         * }
         */
        // ................................................................
        // spy no.
        /*
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * 
         * int sum = 0;
         * int m = 1;
         * while (n > 0) {
         * int r = n % 10;
         * sum = sum + r;
         * m = m * r;
         * n = n / 10;
         * }
         * if (sum == m) {
         * System.out.println("spy no.");
         * } else
         * 
         * {
         * System.out.println("not spy no.");
         * 
         * }
         */
        // ...................................................................
        // duck no.
        /*
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int x = 0;
         * while (n > 0) {
         * int r = n % 10;
         * if (r == 0) {
         * x = 1;
         * 
         * }
         * n = n / 10;
         * 
         * }
         * 
         * if (x == 1) {
         * System.out.println("duck no.");
         * } else
         * 
         * {
         * System.out.println("not duck no.");
         * 
         * }
         */
        // ....................................................................
        // fibbonacci series
        /*
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int a = 0;
         * int b = 1;
         * int c;
         * for (int i = 0; i < n; i++) {
         * System.out.print(a+" ");
         * c = a + b;
         * a = b;
         * b = c;
         * }
         */
        // .....................................................................
        // neon number
       /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n * n;
        int sum = 0;
        while (x > 0) {
            int r = x % 10;
            sum = sum + r;
            x = x / 10;
        }
        if (n==sum) {
            System.out.println("neon no.");
        } else

        {
            System.out.println("not neon no.");
        }*/

    }
}
