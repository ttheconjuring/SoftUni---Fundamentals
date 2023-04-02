package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = array.length;
        boolean isTop = false;

        for (int i = 0; i < n; i++) {
            if(i == n - 1) {
                System.out.print(array[n - 1]);
                return;
            }
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if(isTop) {
                System.out.print(array[i] + " ");
            }
        }


        sc.close();
    }

}
