package TextProcessing;

import java.util.Scanner;

public class ReverseStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!input.equals("end")) {
            System.out.println(input + " = " + getReversed(input));
            input = sc.nextLine();
        }

        sc.close();
    }

    public static String getReversed(String input) {
        int n = input.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

}
