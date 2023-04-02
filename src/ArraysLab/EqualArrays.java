package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] array2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = array1.length;
        int m = array2.length;

        boolean areIdentical = true;

        for (int i = 0; i < n; i++) {
            if (array1[i] != array2[i]) {
                areIdentical = false;
                break;
            }
        }

        if (areIdentical) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += array1[i];
            }
            System.out.println("Arrays are identical. Sum: " + sum);
        } else {
            int index = -1;
            for (int i = 0; i < n; i++) {
                if (array1[i] != array2[i]) {
                    index = i;
                    break;
                }
            }
            System.out.println("Arrays are not identical. Found difference at " + index + " index.");
        }


        sc.close();
    }

}
