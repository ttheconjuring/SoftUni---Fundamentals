package TextProcessing;

import java.util.Scanner;

public class TextFilter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bannedWords = sc.nextLine();
        String[] bannedWordsArray = bannedWords.split(",\\s+");
        int n = bannedWordsArray.length;
        String text = sc.nextLine();

        for (int i = 0; i < n; i++) {
            text = text.replaceAll(bannedWordsArray[i], getCensored(bannedWordsArray[i]));
        }
        System.out.println(text);

        sc.close();
    }

    public static String getCensored(String word) {
        StringBuilder sb = new StringBuilder();
        int n = word.length();
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }
        return sb.toString();
    }


}
