public class jiju {
    public static void main(String arg[])
    {

        String str = "Prakash Sonu Julie Rosy";
        String [] splittedStr = str.split(" ");
        for(int i = 0; i<splittedStr.length ; i++){
            System.out.println(splittedStr[i]);

        }

        String tempstr = splittedStr[0];
        splittedStr[0] = splittedStr[splittedStr.length -1] ;
        splittedStr[splittedStr.length -1] = tempstr;
        System.out.println("\n ==== After Swapping   \n");
        for(int i = 0; i<splittedStr.length ; i++){
            System.out.println(splittedStr[i]);

        }
    }
}



        // String userStr1 = "Prakash";
        // String userStr2 = "Sonu";

        // method1(userStr1, userStr2);



    


    // public static void  method1(String str1, String str2){
    //     String reversedStr1 = reverseString(str1);
    //     String reversedStr2 = reverseString(str2);

    //     System.out.println("String1: "+ reversedStr1);
    //     System.out.println("String2: "+ reversedStr2);

    //     String  concanatedStr = reversedStr1 + reversedStr2;

    //     System.out.println("Concatenated String: "+ concanatedStr);


        
    // } 
    
    // public static String reverseString(String str){
    //     String reverse = "";
    //     for(int i = str.length() -1; i >= 0 ; i--){
    //         reverse = reverse + str.charAt(i);
    //     }
    //     return reverse;
    // }

    // //public static Boolean isPalindromeString(String str){
        
        
    // }


    

