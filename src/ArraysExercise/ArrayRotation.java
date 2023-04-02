package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = array.length;
        int rotations = Integer.parseInt(sc.nextLine());
        int holder;

        for (int i = 0; i < rotations; i++) {
            holder = array[0];
            for (int j = 0; j < n - 1; j++) {
                array[j] = array[j + 1];
            }
            array[n - 1] = holder;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        sc.close();
    }

}
