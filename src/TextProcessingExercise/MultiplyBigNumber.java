package TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* String reallyBigNumber = sc.nextLine();
        String m = sc.nextLine();
        if (reallyBigNumber.equals("0")) {
            System.out.println(0);
            return;
        } else if (m.equals("0")) {
            System.out.println(0);
            return;
        }

        int n = reallyBigNumber.length();
        int addToTheNext = 0;
        StringBuilder result = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            int a = Integer.parseInt(String.valueOf(reallyBigNumber.charAt(i)));
            int b = Integer.parseInt(m);
            int product = a * b + addToTheNext;
            if (i != 0) {
                int lastDigit = product % 10;
                result.append(lastDigit);
                addToTheNext = product / 10;
            } else {
                result.append(new StringBuilder(String.valueOf(product)).reverse().toString());
            }
        }

        System.out.println(result.reverse().toString()); */

        BigInteger reallyBigNumber = new BigInteger(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(reallyBigNumber.multiply(BigInteger.valueOf(n)));

        sc.close();
    }

}


