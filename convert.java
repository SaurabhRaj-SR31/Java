import java.util.Scanner;
public class convert
{
   public static void main(String[] args) 
    {
       
        
        char c;
        float d;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any integer:");
        int a = s.nextInt();
        byte  b = (byte) a;
System.out.println("Conversion int to byte:"+b);
  
	  System.out.print("Enter any double:");
        double x = s.nextDouble();
	  byte  y = (byte) x;
	   int z  =  (int) x;
System.out.println("Conversion double into byte:"+y);
System.out.println("Conversion double into int:"+z);

  System.out.print("Enter any char:");
        char ch=s.next().charAt(0);        
          int m  =  ch;
System.out.println("Conversion character into int:"+m);
    }
}