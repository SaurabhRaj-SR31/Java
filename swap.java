class swapping{
    int a;
    swapping(){}
    swapping( int x)
    {
a=x;
    }
    void swapper(swapping x,swapping y)
    {
swapping temp=new swapping();
temp.a=x.a;
x.a=y.a;
y.a=temp.a;
    }
}


public class swap {
    public static void main(String[] args) {
        swapping x=new swapping(3);
        swapping y=new swapping(5);
        
y.swapper(x, y);
System.out.println(x.a+" "+y.a);



    }
}
