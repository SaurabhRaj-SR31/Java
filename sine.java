
import java.util.Scanner;

class sine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of terms and angle in degrees:");
        int n = sc.nextInt();
        double x = sc.nextDouble();
 int no=(int)x;
 x=x*0.0174532925;

 
 double t=x;
 double sum=x;
for(int i=1;i<=n;i++)
{
    t=t*(-1)*x*x/((2*i)*(2*i+1));
    sum+=t;
}
System.out.println("sin("+no+")="+sum);
    }
}
