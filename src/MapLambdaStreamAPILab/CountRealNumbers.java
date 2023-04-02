package MapLambdaStreamAPILab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = Arrays.stream(sc.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        int n = numbers.length;

        Map<Double, Integer> numberMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            /* numberList.putIfAbsent(numbers[i], 0);
               numberList.put(numbers[i], numberList.get(numbers[i]) + 1);*/
            if (!numberMap.containsKey(numbers[i])) {
                numberMap.put(numbers[i], 1);
            } else {
                numberMap.put(numbers[i], numberMap.get(numbers[i]) + 1);
            }
        }


        for (Map.Entry<Double, Integer> entry : numberMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

        sc.close();
    }

}
