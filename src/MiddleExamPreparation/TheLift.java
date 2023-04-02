package MiddleExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peopleWaitingToGetOn = Integer.parseInt(sc.nextLine());
        int[] wagon = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = wagon.length;

        for (int i = 0; i < n; i++) {
            if (wagon[i] < 4) {
                int freeSpots = 4 - wagon[i];
                if (freeSpots <= peopleWaitingToGetOn) {
                    peopleWaitingToGetOn -= freeSpots;
                    wagon[i] += freeSpots;
                } else {
                    wagon[i] += peopleWaitingToGetOn;
                    peopleWaitingToGetOn = 0;
                    break;
                }
            }
        }

        if (peopleWaitingToGetOn == 0 && !isFull(wagon, n)) {
            System.out.println("The lift has empty spots!");
            for (int i : wagon) {
                System.out.print(i + " ");
            }
        } else if (peopleWaitingToGetOn > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaitingToGetOn);
            for (int i : wagon) {
                System.out.print(i + " ");
            }
        } else {
            for (int i : wagon) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    public static boolean isFull(int[] array, int n) {
        boolean flag = true;
        for (int i : array) {
            if (i != 4) {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
// people < free spots
// people > free spots
// people == free spots