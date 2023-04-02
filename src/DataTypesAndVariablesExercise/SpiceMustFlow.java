package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startingYield = Integer.parseInt(sc.nextLine());
        if(startingYield < 100) {
            System.out.println(0);
            System.out.println(0);
            return;
        }
        int days = 0;
        int totalAmount = 0;

        while (startingYield >= 100) {
            days++;
            totalAmount += startingYield - 26;
            startingYield -= 10;
        }

        System.out.println(days);
        System.out.println(totalAmount - 26);

        sc.close();
    }

}
