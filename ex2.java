
import java.util.Scanner;
public class ex2 {
public static void main(String[] args) {
    
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no.1 :");
    int a=sc.nextInt();
    System.out.println("enter no.2 :");
    int b=sc.nextInt();
    int c=(a << 2) + (b >> 2);

System.out.println("exp1 ="+c);
int d=(b > 0);
int x= (a + b * 100) / 10;
int y= a & b;

}
}
