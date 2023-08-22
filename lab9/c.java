package lab9;
import java.util.Scanner;



class menu{
    public String reverseString(String str){
        String reverse = "";
        for(int i = str.length() -1; i >= 0 ; i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}
public class c {
    public static void main(String[] args) {
        menu m=new menu();
        Scanner sc=new Scanner(System.in);

System.out.println("enter string:");
String str=sc.nextLine();
m.reverseString(str);






    }

    
}
