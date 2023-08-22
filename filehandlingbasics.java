import java.io.*;

public class filehandlingbasics {
    public static void main(String[] args) {
        File f = new File("C:/Users/Saurabh Raj/Desktop/java");

        // System.out.println(f.getName());
        // System.out.println(f.getParent());
        // System.out.println(f.getPath());
        // System.out.println(f.getAbsolutePath());

        // System.out.println(f.exists());
        // System.out.println(f.isFile());
        // System.out.println(f.isDirectory());
        // System.out.println(f.canWrite());
        // System.out.println(f.canRead());

        // System.out.println(f.length());
        // System.out.println(f.lastModified());

     if(f.isDirectory())
     {
         String s[]=f.list();
for(int i=0;i<s.length;i++)
{
    System.out.println(s[i]);
}
     }



//      if(f.isDirectory())
//      {
//          File s[]=f.listFiles();
// for(int i=0;i<s.length;i++)
// {
//     System.out.println(s[i]);
// }
//      }
        
    }
}
