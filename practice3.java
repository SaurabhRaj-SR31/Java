class Outer {
    int outer_x = 100;

    // void test() {
    // Inner inner = new Inner();
    // inner.display();
    // }

    static class Inner {
        void display() {
            System.out.println("display: outer_x =" + outer_x);
        }
    }

    public static void method2(){}
}

public class practice3 {
    public static void main(String args[]) {
        Outer outerObj = new Outer();
      
        //Outer.Inner inner =  outerObj.new Inner();
        Outer.Inner inner = new Outer.Inner();
        inner.display();
        Outer.method2();
    }
}
