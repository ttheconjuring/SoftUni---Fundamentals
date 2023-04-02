package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class FromLeftToTheRight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String input;
        long num1;
        long num2;
        byte endIndex;
        long biggest;
        String big;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            input = sc.nextLine();
            endIndex = Byte.parseByte(String.valueOf(input.indexOf(" ")));
            num1 = Long.parseLong(input.substring(0, endIndex));
            num2 = Long.parseLong(input.substring(endIndex + 1));
            biggest = Math.max(num1, num2);
            big = String.valueOf(biggest);
            for (int j = 0; j < big.length(); j++) {
                if (big.charAt(j) == '-') {
                    continue;
                }
                sum += Integer.parseInt(String.valueOf(big.charAt(j)));
            }
            System.out.println(sum);
            sum = 0;
        }

        sc.close();
    }

}
