import javax.lang.model.util.ElementScanner14;

public class reversestring {
    public static void main(String[] args) {
        String str="radar";
        String rev="";

        for(int i=str.length()-1;i>=0;i--)
        {
          rev+=str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev))
         System.out.println("palindrome");
         else
         System.out.println("palindrome");

    }
}
