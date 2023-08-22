import java.util.Scanner;
class floyd {
    public static void main(String[] args) {
    int n;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the no. of rows:");
    n = sc.nextInt();
    int a=1 ;
    for (int i=0;i<n ;i++)
    {
        for (int j=0;j<i;j++)
        {
            System.out.print(a+" ");
            a++;
        }
        System.out.println(" ");
    }


    }
}

