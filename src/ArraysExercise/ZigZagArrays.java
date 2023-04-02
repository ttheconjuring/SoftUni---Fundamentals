package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        int[] numbers = new int[2];
        for (int i = 1; i <= n; i++) {
            numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                array1[i - 1] = numbers[1];
                array2[i - 1] = numbers[0];
            } else {
                array1[i - 1] = numbers[0];
                array2[i - 1] = numbers[1];
            }
        }

        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : array2) {
            System.out.print(i + " ");
        }


        sc.close();
    }

}
