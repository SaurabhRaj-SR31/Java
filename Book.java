  



class Book1{
    static int c=0;
    public String title, author, edition;
    Book1(String s1, String s2, String s3) {
        this.title = s1;
        this.author = s2;
        this.edition = s3;
        c++;
    }
    void display() {
        System.out.println("TITLE: "+this.title);
        System.out.println("AUTHOR: "+this.author);
        System.out.println("EDITION: "+this.edition);
        System.out.println("......................");
    }
}

public class Book { 
    public static void main(String args[]) {
        Book1[] arr = new Book1[6];
        arr[0] = new Book1("JAVA 1", "Harry", "1st");
        arr[1] = new Book1("JAVA 1", "MarRy", "1st");
        arr[2] = new Book1("JAVA 2", "Harry", "2nd");
        arr[3] = new Book1("JAVA 2", "MarRy", "2nd");
        arr[4] = new Book1("JAVA 3", "Harry", "3rd");
        arr[5] = new Book1("JAVA 3", "MarRy", "3rd");
       for(int i=0;i<Book1.c;i++)
       {if(arr[i].author.equals("Harry"))
        arr[i].display();
       }
    }
}
