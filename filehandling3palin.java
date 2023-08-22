import java.io.*;
public class filehandling3palin {

public static boolean palindrome(String str)
{
    String rev="";
    for(int i=str.length()-1;i>=0;i--)
    {
        rev+=str.charAt(i);
    }
    if(str.equalsIgnoreCase(rev))
    {
        return true;

    }
    else 
    {
        return false;
    }
}

    public static void main(String[] args) throws IOException 
    {
        FileReader fr=new FileReader("f1.txt");
       

        BufferedReader br=new  BufferedReader (fr);
        String s;
      
        while((s=br.readLine())!=null)
        {
            String  buf[]=s.split(" ");
           
           FileWriter wr=new FileWriter("f2.txt");
           
        BufferedWriter bfr=new  BufferedWriter (wr);
           for(int i=0;i<buf.length;i++)
           {
               if(palindrome(buf[i]))
               {
                bfr.write(buf[i]+"\t");
               }

           }
           bfr.close();


        }
        br.close();
       
    }
}


