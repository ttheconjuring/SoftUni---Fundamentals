package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = array.length;
        boolean exists = false;

        if (n == 1) {
            System.out.println(0);
            return;
        } else if (n == 2) {
            System.out.println("no");
            return;
        }

        for (int i = 0; i < n; i++) {
            int current = array[i];
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            int rightSum = 0;
            for (int j = i + 1; j < n; j++) {
                rightSum += array[j];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }
        }
        if (!exists) {
            System.out.println("no");
        }

        sc.close();
    }

}
