import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        int LS[]=new int[100];                      //LS is the array
        int n,key,flag=0;                          //n is the number of array elements and key is the element to be searched
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of array elements");
        n=sc.nextInt();
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        LS[i]=sc.nextInt();
        System.out.println("Enter element to search");
        key=sc.nextInt();           
        for (int i:LS){
          if(LS[i]==key){
            flag=1;
            System.out.println(key+" is found at location "+(i+1));
          }
      }
      if(flag==0){
        System.out.println(key+" is not found");
    }  
  }
}
