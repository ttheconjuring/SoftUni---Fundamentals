package ListMoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> number = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int middle = number.size() / 2;

        double left = 0;
        for (int i = 0; i < middle; i++) {
            if (number.get(i) == 0) {
                left *= 0.8;
            } else {
                left += number.get(i);
            }
        }

        double right = 0;
        for (int i = number.size() - 1; i > middle; i--) {
            if (number.get(i) == 0) {
                right *= 0.8;
            } else {
                right += number.get(i);
            }
        }

        if (left < right) {
            System.out.println("The winner is left with total time: " + String.format("%.1f", left));
        } else {
            System.out.println("The winner is right with total time: " + String.format("%.1f", right));
        }
        sc.close();
    }

}
