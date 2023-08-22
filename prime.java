import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println("enter number :");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
int f=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
               f=1;
               break;
        }
        if(f==1)
        System.out.println("not prime");
        else
        System.out.println(" prime");
    }
}
