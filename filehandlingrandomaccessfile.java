import java.io.*;

public class filehandlingrandomaccessfile {
    public static void main(String[] args) {
        try{
            int a=10;
            double b=2.00000;
            String str="Saurabh";
            char ch='c';
            boolean f=true;
            RandomAccessFile raf=new RandomAccessFile("C:\\Users\\Saurabh Raj\\Desktop\\java\\data.txt","rw");
            // raf.setLength(100);
            // raf.seek(10);
            // System.out.println(raf.length());
            // System.out.println(raf.getFilePointer());
            raf.seek(0);
            raf.writeInt(a);
            
            raf.seek(5);
          
            raf.writeDouble(b);
           
            raf.writeBoolean(f);
            raf.writeChar(ch);
            raf.writeUTF(str);
         

         raf.seek(0);
      
        
           
            System.out.println(raf.readInt());
            raf.seek(5);
           

            System.out.println(raf.readDouble());
            System.out.println(raf.readBoolean());
            System.out.println(raf.readChar());
    System.out.println(raf.readUTF());



    

    raf.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
        }


}
