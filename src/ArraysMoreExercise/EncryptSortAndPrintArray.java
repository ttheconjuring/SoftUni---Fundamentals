package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] array = new String[n];
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            String current = array[i];
            int sum = 0;
            int sumVowels = 0;
            int sumConsonants = 0;
            for (int j = 0; j < current.length(); j++) {
                char currentChar = current.charAt(j);
                switch (currentChar) {
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                        sumVowels += (int) currentChar * current.length();
                        break;
                    default:
                        sumConsonants += (int) currentChar / current.length();
                }
            }
            sum = sumVowels + sumConsonants;
            arr[i] = sum;
        }

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }

        sc.close();
    }

}
