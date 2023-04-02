package DataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorSpecialNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());
        byte sum = 0;
        byte num = 0;
        boolean isSpecial = false;
        for (byte i = 1; i <= n; i++) {
            num = i;
            while (i > 0) {
                sum += i % 10;
                i = (byte) (i / 10);
            }
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if(isSpecial) {
                System.out.printf("%d -> True%n", num);
            } else {
                System.out.printf("%d -> False%n", num);
            }
            sum = 0;
            i = num;
        }

        scanner.close();
    }

}


