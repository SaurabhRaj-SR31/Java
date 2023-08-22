import java.util.Scanner;

class symmetricmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("enter rows :");
int r=sc.nextInt();
System.out.println("enter cols :");
int c=sc.nextInt();
int [][]a=new int[r][c];
System.out.println("enter elements of the matrics:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
    a[i][j]=sc.nextInt();
}

}
System.out.println("Matrix:");

for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
    System.out.print(a[i][j]+" ");
}
System.out.println();
}
int f=1;
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
    if(a[i][j]!=a[j][i])
    {
        f=0;
break;
    }
    else
    {
        f=1;
    break;
    }

}

}

if(f==1)
{
System.out.println("symetric matrix");
}
else
{
    System.out.println("not symetric matrix");
    }


    }}
