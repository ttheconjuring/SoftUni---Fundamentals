package DataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte n = Byte.parseByte(sc.nextLine());

        String number;
        char[] digit;
        byte sum = 0;

        for (int i = 1; i <= n; i++) {
            number = String.valueOf(i);
            digit = new char[number.length()];
            digit = number.toCharArray();
            for (int j = 0; j < digit.length; j++) {
                sum += Byte.parseByte(String.valueOf(digit[j]));
            }
            if(sum == Byte.parseByte(String.valueOf(5)) || sum == Byte.parseByte(String.valueOf(7)) || sum == Byte.parseByte(String.valueOf(11))) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
            sum = 0;
        }

        sc.close();
    }

}
