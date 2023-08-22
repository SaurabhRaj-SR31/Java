import java.util.Scanner;

public class stringhandling1 {
    static int vowelcount = 0;

    public static void main(String[] args)

    {

        String line;
        System.out.println("enter string:");
        Scanner sc = new Scanner(System.in);
        line = sc.nextLine();
        int wordCount = 0;
        int characterCount = 0;

        int sentenceCount = 0;

        characterCount += line.length();
        String words[] = line.split("\\s+");
        wordCount += words.length;

        for (int i = 0; i < words.length; i++) {

            if (words[i].contains("a")) {
                vowelcount++;
            }
            if (words[i].contains("e")) {
                vowelcount++;
            }
            if (words[i].contains("i")) {
                vowelcount++;
            }
            if (words[i].contains("o")) {
                vowelcount++;
            }
            if (words[i].contains("u")) {
                vowelcount++;
            }
        }
        String sentence[] = line.split("[!?.:]+");
        sentenceCount += sentence.length;

        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Total word count = " + wordCount);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of vowels= " + vowelcount);

    }
}
