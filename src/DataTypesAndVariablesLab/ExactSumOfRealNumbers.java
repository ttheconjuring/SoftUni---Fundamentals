package DataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte n = Byte.parseByte(sc.nextLine());

        BigDecimal sum = new BigDecimal(0);
        BigDecimal number;
        for (int i = 0; i < n; i++) {
            number = new BigDecimal(sc.nextLine());
            sum = sum.add(number);
        }

        System.out.println(sum);

        sc.close();
    }
}
