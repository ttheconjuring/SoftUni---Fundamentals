package MiddleExamPreparation;

import java.util.*;

public class Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = array.length;

        int sumOfAllElements = 0;
        for (int i = 0; i < n; i++) {
            sumOfAllElements += array[i];
        }

        double averageValue = sumOfAllElements * 1.0 / n;

        List<Integer> greater = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (array[i] > averageValue) {
                greater.add(array[i]);
            }
        }

        if(greater.isEmpty()) {
            System.out.println("No");
            return;
        }

        Collections.sort(greater);
        Collections.reverse(greater);

        if(greater.size() < 5) {
            for (Integer integer : greater) {
                System.out.print(integer + " ");
            }
        } else {
            for (int i = 0; i < 5; i++) {
                System.out.print(greater.get(i) + " ");
            }
        }


        sc.close();
    }

}
