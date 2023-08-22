
class autoboxing {

    public static void main(String[] args) {

        char c = 'a';

        Character ch = new Character(c);

        System.out.println(" Value of c: " + c);
        System.out.println("Value of ch: " + ch);
        Integer i = new Integer(10);

        int i1 = i;

        System.out.println("Value of i:" + i);
        System.out.println("Value of i1: " + i1);

    }
}