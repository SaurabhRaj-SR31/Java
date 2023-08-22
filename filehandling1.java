import java.io.*;

public class filehandling1 {
    public static void main(String[] args) throws IOException {
        int sp = 0;
        int ch = 0;
        int ln = 0;
        String str = " name is radar Saurabh racecar boi\n ";
        byte buff[] = str.getBytes();
        File f = new File("C:\\Users\\Saurabh Raj\\Desktop\\java\\f1.txt");
        OutputStream fo = new FileOutputStream(f);
        for (int i = 0; i < buff.length; i++) {
            fo.write(buff[i]);
        }
        fo.close();
        FileInputStream f2 = new FileInputStream(f);
        int i;
        while ((i = f2.read()) != -1) {
            if ((char) i == ' ') {
                sp++;
            }

            else if ((char) i == '\n') {
                ln++;
            }
             else {
                ch++;
            }

        }
        System.out.println(ch);
        System.out.println(sp);
        System.out.println(ln);

    }
}