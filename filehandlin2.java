import java.io.*;


public class filehandlin2 {
    public static void main(String[] args) throws IOException 
    {
        FileReader fr=new FileReader("f1.txt");
        BufferedReader f2=new  BufferedReader (fr);
      

        String s;int i;
        int c=0;
        int sp = 0;
        int ch = 0;
        int ln = 0;
        int v=0;
        while ((i = f2.read()) != -1) {
            if ((char) i == ' ') {
                sp++;
            }

            else if ((char) i == '\n') {
                ln++;
            }
            
            else if ((char) i == 'a'||(char) i == 'e'||(char) i == 'i'||(char) i == 'o'||(char) i == 'u') {
                v++;
            }
             else {
                ch++;
            }

        }
        while((s=f2.readLine())!=null)
        {
            String  buf[]=s.split(" ");
        c+=buf.length;

        }
        System.out.println(v);
        System.out.println(ch+v);
        

        System.out.println(sp);
        System.out.println(ln);
        System.out.println(c);

  
    }
}
