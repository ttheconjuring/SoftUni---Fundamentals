package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = array.length;
        int number = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] + array[j] == number) {
                    System.out.println(array[i] + " " + array[j]);
                }
            }

        }

        sc.close();
    }
}
