import java.io.*;
class onlyext implements FilenameFilter{
    String ext;
    onlyext(String ext)
    {
        this.ext=ext;
    }
 
    public boolean accept(File dir,String name)
    {
        return name.endsWith(ext)&&name.startsWith("a");
    }
}



public class filehandlingbasics2 {
    public static void main(String[] args) {
        File f = new File("C:/Users/Saurabh Raj/Desktop/java");
       FilenameFilter only=new onlyext("java");
       
     if(f.isDirectory())
     {
         String s[]=f.list(only);
for(int i=0;i<s.length;i++)
{
    System.out.println(s[i]);
}
     }
    }
}
