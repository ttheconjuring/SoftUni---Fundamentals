package TextProcessing;

import java.util.Scanner;

public class RepeatStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputArray = input.split("\\s+");
        int n = inputArray.length;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int m = inputArray[i].length();
            for (int j = 0; j < m; j++) {
                sb.append(inputArray[i]);
            }
        }

        System.out.println(sb.toString());

        sc.close();
    }

}
