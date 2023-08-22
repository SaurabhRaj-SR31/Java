import java.util.Scanner;
public class palin {
    public static void main(String[] args) {
        int  r =0;
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int x=n;
        while(n!=0)
        {
            r = r* 10 + n % 10;
            n = n / 10;
           
        }
        if(r==x)
        System.out.println("palindrome");
        else  
        System.out.println(" not palindrome");
    }
}
