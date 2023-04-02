package MiddleExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = array.length;

        String command = sc.nextLine();

        int targetsDown = 0;

        while (!command.equals("End")) {
            int index = Integer.parseInt(command);
            if (index >= 0 && index < n) {
                int currentTarget = array[index];
                if (currentTarget != -1) {
                    targetsDown++;
                    array[index] = -1;
                    for (int i = 0; i < n; i++) {
                        if (array[i] != -1) {
                            if (array[i] > currentTarget) {
                                array[i] -= currentTarget;
                            } else {
                                array[i] += currentTarget;
                            }
                        }
                    }
                }
            }
            command = sc.nextLine();
        }

        System.out.print("Shot targets: " + targetsDown + " -> ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }

}
