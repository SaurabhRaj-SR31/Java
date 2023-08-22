//import java.util.Scanner;
public class stringpractice {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        String str="raavi raam raajesh saurabh rauf";
        String [] s = str.split(" ");
        for(int i = 0; i<s.length ; i++){
           if (s[i].contains("au"))
           {
            System.out.println(s[i]);
           }

        }
      
       
    }
}
