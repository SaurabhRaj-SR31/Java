import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        System.out.println("enter number of rows :");
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        System.out.println("enter number of columns :");
       
        int n= sc.nextInt();
        System.out.println("enter elements of the matrix:");
        int a[][]=new int [10][10];

        for(int i=0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                
            }
            
        }
        for(int i=0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
        }
    
    }
}
