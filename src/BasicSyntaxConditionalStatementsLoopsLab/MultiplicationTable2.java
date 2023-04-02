package BasicSyntaxConditionalStatementsLoopsLab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int multiplier = Integer.parseInt(sc.nextLine());

        if(multiplier > 10) {
            System.out.printf("%d X %d = %d", n, multiplier, n * multiplier);
        }

        for (int i = multiplier; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        }

        sc.close();
    }
}
