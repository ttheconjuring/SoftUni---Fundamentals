package MapLambdaStreamAPIExercise;

import java.util.*;

public class AMinerTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, Integer> recourseQuantityMap = new LinkedHashMap<>();

        int line = 0;
        String previousInput = "";
        while (!input.equals("stop")) {
            line++;
            if (line % 2 != 0) {
                recourseQuantityMap.putIfAbsent(input, 0);
                previousInput = input;
            } else {
                recourseQuantityMap.put(previousInput, recourseQuantityMap.get(previousInput) + Integer.parseInt(input));
            }
            input = sc.nextLine();
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : recourseQuantityMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());
        }

        sc.close();
    }

}
