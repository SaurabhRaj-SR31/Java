import java.util.Scanner;

class quest {
    public static void main(String[] args){
    System.out.println("enter no.:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   // int n =Integer.parseInt(args[0]);
    if(n>99 && n<=999){
    System.out.println("it is a three digit no.");
    int x=n/100;
    int sum=0;
    {
        while(n>9){
        int r=n%10;
           sum+=r;
           n=n/10; 
    }
    if(sum==x)
    {
        System.out.println("condition true");
    }
    else
    System.out.println("condition false");
    
}}
    else
    System.out.println("it is not a three digit no.");
    
    }
}