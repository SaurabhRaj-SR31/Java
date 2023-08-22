import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string:");
        String s = sc.nextLine();
    char c[]=s.toCharArray();
    for(int i=0;i<s.length();i++)
    {
        for(int j=i+1;j<s.length();j++)
        {
            if(c[i]>c[j])
            {
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
            }
        }
    }
    System.out.println(c);
    }
}
