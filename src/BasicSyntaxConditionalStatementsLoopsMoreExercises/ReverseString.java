package BasicSyntaxConditionalStatementsLoopsMoreExercises;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] array = str.toCharArray();
        String reverse = "";
        int n = array.length;

        for (int i = n - 1; i >= 0; i--) {
            reverse += array[i];
        }

        System.out.println(reverse);

        sc.close();
    }

}
