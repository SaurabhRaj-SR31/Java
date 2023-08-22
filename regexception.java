class invalidregno extends Exception{
int reg;
    invalidregno(int a)
    {
reg=a;
System.out.println(reg);
    }
    // public int tostring()
    // {
    //     return reg;
    // }
}
public class regexception {
static void check(int x)throws invalidregno
{
    if(x>0&&x<=100)
    System.out.println("valid:"+x);
    else
    throw new invalidregno(x);
}


    public static void main(String[] args) {
         
try{
    check(20);
    check(101);
}
catch(invalidregno e)
{
    System.out.println("CAUGHT::"+e.getMessage());
}

    }

}
