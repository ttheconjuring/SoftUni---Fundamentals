package MiddleExamPreparation;

import java.util.Scanner;

public class CounterStrike {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(sc.nextLine());

        int victories = 0;
        boolean enoughInitialEnergy = true;

        String input = sc.nextLine();

        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);
            if (distance > initialEnergy) {
                enoughInitialEnergy = false;
                break;
            } else {
                initialEnergy -= distance;
                victories++;
                if (victories % 3 == 0) {
                    initialEnergy += victories;
                }
            }
            input = sc.nextLine();
        }

        if (enoughInitialEnergy) {
            System.out.printf("Won battles: %d. Energy left: %d", victories, initialEnergy);
        } else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", victories, initialEnergy);
        }

        sc.close();
    }

}
