package ListMoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());

        String str = sc.nextLine();
        int n = str.length();

        List<Character> strList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            strList.add(str.charAt(i));
        }

        String message = "";

        for (int i = 0; i < numbers.size(); i++) {
            int index = 0;
            for (int j = 0; j < numbers.get(i).length(); j++) {
                index += Integer.parseInt(String.valueOf(numbers.get(i).charAt(j)));
            }
            while (index >= str.length()) {
                index = index - str.length();
            }
            String character = String.valueOf(strList.get(index));
            strList.remove(index);
            message += character;
        }

        System.out.println(message);

        sc.close();
    }

}

