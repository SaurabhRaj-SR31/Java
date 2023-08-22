import java.util.Scanner;

class Employee {
    String name;// can we use string instead of char array
    String city;
    float salary;
    float da;
    float rent;
    Scanner sc = new Scanner(System.in);

    void getdata() {
        System.out.print("enter the details:\n");
        System.out.println("......................");
        System.out.println(" enter name:");
        name = sc.nextLine();
        System.out.println(" enter city:");
        city = sc.nextLine();
        System.out.println(" enter salary:");
        salary = sc.nextFloat();
        System.out.println(" enter da:");
        da = sc.nextFloat();
        System.out.println(" enter rent :");
        rent = sc.nextFloat();

    }

    float calculate()
    {

       return (salary +salary *da/100+salary *rent/100);
    }

    void display()
    {
        System.out.println(" enter name  :"+name);
       
        System.out.println(" enter city  :"+city);
       
        System.out.println(" enter salary:"+salary);
       
        System.out.println(" enter da    :"+da);
       
        System.out.println(" enter rent  :"+rent);
        
        System.out.println(" Total       :"+calculate());


    }
}

public class emp {
    public static void main(String[] args) {

        Employee e=new Employee();
      

       
       
           e.getdata();
      
         
            e.display();
    

    }
}
