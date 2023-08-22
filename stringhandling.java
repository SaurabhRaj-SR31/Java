public class stringhandling {
    public static void main(String[] args) {
        // count no. of a in string
//         String s="abcadeabf";
// int c=0;

//         for(int i=0;i<s.length();i++)
//         {
//             if('a'==s.charAt(i))
//             {
//                 c++;
//             }
           
//         }
//         System.out.println(c);


// System.out.println(s.compareTo(s2));
        // System.out.println(s.replace('a','A'));
        // System.out.println((s));
        // System.out.println(s.toUpperCase());
        // System.out.println(s.charAt(1));
// String s="abaaaagh";
// char []a=s.toCharArray();
// int n=a.length;
// for(int i=1;i<n;i++)
// {
//     if(a[0]==a[i])
//     {
//         a[i]=a[n-1];
//     }
// }
// a[0]=a[n-1];
// System.out.println(a);

// String s="abcdef";
// byte []b=s.getBytes();
// for(int i=0;i<b.length;i++)
// {
//     System.out.println(b[i]);
// }
// System.out.println(s.indexOf('c'));
// System.out.println(s.indexOf('c',3));
// System.out.println(s.lastIndexOf('c',7));
// System.out.println(s.lastIndexOf('c',8));
// System.out.println(s.lastIndexOf('d',8));



// String s="this is a demo of the getchars method";
// int start=10;
// int end=13;
// char ch[]=new char[end-start];
// s.getChars(start,end,ch,0);
// System.out.println(ch);

// String s="Manipal institute of technology";

// String s2="Nanipal Institute of technology karnataka";

// if(s.regionMatches(false,8,s2,8,9))
// {
//     System.out.println("matches");
// }
// else
// System.out.println("not matching");


//..................stringbuffer................
StringBuffer s=new StringBuffer("abc");
// System.out.println(s.length());
// System.out.println(s.capacity());
// s.setCharAt(1,'x');
// System.out.println(s);
StringBuffer s2=new StringBuffer("abc");

// System.out.println(s.append(s2));
// System.out.println(s);

// s.insert(0,s2);
// s.reverse();
// System.out.println(s);


// s.delete(2,5);
boolean t=s==s2;
System.out.println(t);




    }


}
