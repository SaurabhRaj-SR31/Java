import java.util.Scanner;

public class driver{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter word:");
        String str= scan.nextLine();
        int found=-1;
        for(int i=0;i<str.length();i++){
            found=str.indexOf(str.charAt(i));
            if(found!=i){
             
                char []c=new char[str.length()];
               for(int j=0;j<str.length();j++)
               {
                c[j]=str.charAt(found);
               }
               System.out.println(c);
                break;
            }
        }
        
    }
}
