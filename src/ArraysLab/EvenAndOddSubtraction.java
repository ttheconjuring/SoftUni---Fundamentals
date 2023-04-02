package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = array.length;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            if(array[i] % 2 == 0) {
                evenSum += array[i];
            } else {
                oddSum += array[i];
            }
        }

        System.out.println(evenSum - oddSum);

        sc.close();
    }

}
