import java.util.Scanner;
import java.lang.Math;

public class nseries {
    public static void main(String[] args) {
        System.out.println("enter the no. of terms: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        double sum=0.0;
        for(double i=1.0;i<=n;i++)
        {
           double x= Math.pow((1/i), i);
            sum = sum + x;
        }
        System.out.printf("Sum=%.5f",sum);
    }

}
