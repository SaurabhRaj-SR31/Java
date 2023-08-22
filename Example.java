// class Example {

//     static class X {
//         static String str = "Inside Class X";
//     }

//     public static void main(String args[]) {
//         X.str = "Inside Class Example1";
//         System.out.println("String stored in str is- " + X.str);
//     }
// }

// class Example{
//    static int num;

//     static class X {
//         static String str="Inside Class X";
//        int   num = 99;
//     }

//     public static void main(String args[]) 
//     {
//         Example.X obj = new Example.X();
//         System.out.println("Value of num=" + Example.X.str);
//     }
// }

// class Example{
//     static int num;
//     static String mystr;
//     static {
//         num = 97;
//         mystr = "Static keyword in Java";
//     }

//     public static void main(String args[]) {
//         System.out.println("Value of num=" + num);
//         System.out.println("Value of mystr=" + mystr);
//     }
// }

// class Example {
//     static int num;
//     static String mystr;
   
//     static {
//         System.out.println("Static Block 1");
//         num = 68;
//         mystr = "Block1";
//     }

//     static {
//         System.out.println("Static Block 2");
//         num = 98;
//         mystr = "Block2";
//     }

//     public static void main(String args[]) {
//         System.out.println("Value of num=" + num);
//         System.out.println("Value of mystr=" + mystr);
//     }
// }

// class Example {
//     static int i;
//     static String s;

//     public static void main(String args[]) 
//     {
//         Example obj = new Example();
     
//         System.out.println("i:" + obj.i);
//         System.out.println("s:" + obj.s);
//     }
// }

// class Example{
//     static int i;
//     static String s;

 
//     static void display() {
        
//         Example obj1 = new Example();
//         System.out.println("i:" + obj1.i);
     
//     }

//     void funcn() {
//         display();
//     }

//     public static void main(String args[])
//     {
        
//         display();
//     }
// }
