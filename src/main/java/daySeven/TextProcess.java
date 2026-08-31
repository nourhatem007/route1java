package daySeven;

import static java.awt.SystemColor.text;

public class TextProcess {
    public static void main(String[] args) {
//        String s = "Hello big boy";
//        System.out.println(s);
//        System.out.println(s.length());
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        System.out.println(s.charAt(6));
//
//        String a = "Nour";
//        String b = "Nour";
//        System.out.println(a == b);
//
//        String c = new String("Nour");
//        System.out.println(c == a);
//        System.out.println(a.equals(c));
//
//        String text = "I love JAVA";
//        String lower = text.toLowerCase();
//        System.out.println(lower);
//        String upper = text.toUpperCase();
//        System.out.println(upper);
//        System.out.println(text.indexOf('v'));
//        System.out.println(text.lastIndexOf("A"));

        countWords("i hate java");
        reverseWords("i hate java");

    }
    public static void countWords(String text){
        String[] words = text.split(" ");
        int numberOfWords = 0;

        String message = String.format("You have %d words in your text box.", words.length);
        System.out.println(message);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    private static void reverseWords(String text){
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        System.out.println(reversed);
    }
}
