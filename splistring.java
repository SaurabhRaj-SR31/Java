//import java.util.Scanner;
class splistring {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter string:");
        String str="my name is sonu";
        String s[]=str.split(" ");

          String temp=s[0];
          s[0]=s[s.length-1];
          s[s.length-1]=temp;
         
            for(int i=0;i<s.length;i++){
        
         System.out.print(" "+s[i]);
 }
               
}
}
