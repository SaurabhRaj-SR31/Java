import java.util.Scanner;
public class special1 {
    public static void main(String[] args) {
        System.out.println("enter no.:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int x=n;
         int sum=0;
         while(n!=0){
            int r=n%10;
            int f=1;
            for(int i=1;i<=r;i++)
            {
                f=f*i;

            }
            sum+=f;
            n=n/10;

         }
         if (sum==x)
         {System.out.println("special no.");}
         else
         System.out.println("not special no.");


    }
}
