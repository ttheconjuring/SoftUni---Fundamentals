package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputArray = input.split("\\s+");
        String str1 = inputArray[0];
        String str2 = inputArray[1];
        System.out.println(getSumOf(str1, str2));

        sc.close();
    }

    private static int getSumOf(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int sum = 0;
        if (n == m) {
            for (int i = 0; i < n; i++) {
                int product = str1.charAt(i) * str2.charAt(i);
                sum += product;
            }
        } else if (n > m) {
            for (int i = 0; i < m; i++) {
                int product = str1.charAt(i) * str2.charAt(i);
                sum += product;
            }
            for (int i = m; i < n; i++) {
                sum += str1.charAt(i);
            }
        } else {
            for (int i = 0; i < n; i++) {
                int product = str1.charAt(i) * str2.charAt(i);
                sum += product;
            }
            for (int i = n; i < m; i++) {
                sum += str2.charAt(i);
            }
        }
        return sum;
    }

}

