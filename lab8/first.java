import java.util.Scanner;

interface Market{
    final Scanner scan= new Scanner(System.in);
    void sales();
}

class Hardware implements Market{
    String category;
    String manufacturer;
    int h;
    Hardware(){
        System.out.print("Enter the category:");
        category=scan.next();
        System.out.print("Enter the manufacturer:");
        manufacturer=scan.next();
        System.out.print("Enter sell per day:");
        h=scan.nextInt();
    }
    public void sales(){
        System.out.println("Total hardware units sold:"+(h*30*3));
    }
    
}

class Software implements Market{
    String Type;
    String OS;
    int s;
    Software(){
        System.out.print("Enter the type:");
        Type=scan.nextLine();
        System.out.print("Enter the operating system:");
        OS=scan.nextLine();
        System.out.print("Enter sell per day:");
        s=scan.nextInt();
    }
    public void sales(){
        System.out.println("Total software units sold:"+s*3*30);
    }
}

public class first{
    public static void main(String args[]){
        Market m= new Hardware();
        m.sales();
        m=new Software();
        m.sales();
    }
}