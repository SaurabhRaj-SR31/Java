import java.io.*;

class student implements Serializable {
    String name;
    int marks1;
    int marks2;
    int marks3;
    float per;
    char g;
int total=50;

    student(String name, int marks1,int marks2,int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3= marks3;

       
    }

    public String toString() {
        return "name:" + name + " precentage:" + per+" greade:"+g;
    }

}

public class filehandlingserialization {
    public static void main(String[] args) {

        try {
            student s1 = new student("aa", 20,10,10);
             student s2 = new student("bb", 9,9,9);
            // student s3 = new student("cc", 13);
            // student s4 = new student("dd", 5);
            // student s5 = new student("ee", 17);



            FileOutputStream fos = new FileOutputStream("C:\\Users\\Saurabh Raj\\Desktop\\java\\student1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.writeObject(s2);
            // oos.writeObject(s3);
            // oos.writeObject(s4);
            // oos.writeObject(s5);
            oos.flush();
            oos.close();

student stu1;
student stu2;
// student stu3;
// student stu4;
// student stu5;
FileInputStream fis=new FileInputStream("C:\\Users\\Saurabh Raj\\Desktop\\java\\student1.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
stu1=(student)ois.readObject();
stu2=(student)ois.readObject();
// stu3=(student)ois.readObject();
// stu4=(student)ois.readObject();
// stu5=(student)ois.readObject();

ois.close();
stu1.per=((stu1.marks1+stu1.marks2+stu1.marks3)*100)/50;
if(stu1.per>=75)
stu1.g='A';
else
{

    stu1.g='B';
}
System.out.println(stu1);
stu2.per=((stu2.marks1+stu2.marks2+stu2.marks3)*100)/50;
if(stu2.per>=75)
stu2.g='A';
else{

    stu2.g='B';
}
System.out.println(stu2);
// if(stu2.marks>10)
// System.out.println(stu2);

// if(stu3.marks>10)
// System.out.println(stu3);

// if(stu4.marks>10)
// System.out.println(stu4);

// if(stu5.marks>10)
// System.out.println(stu5);

        }
         catch (IOException ie) {
            System.out.println("exception in serialization:" + ie.getMessage());
            System.exit(0);
        }
        catch (Exception ie) {
            System.out.println("exception in deserialization:" + ie.getMessage());
            System.exit(0);
        }
    }
}
