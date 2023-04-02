package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> hand1 = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> hand2 = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (hand1.size() > 0 && hand2.size() > 0) {
            int i = 0;
            if (hand1.get(i) > hand2.get(i)) {
                hand1.add(hand1.get(i));
                hand1.add(hand2.get(i));
                hand1.remove(i);
                hand2.remove(i);
            } else if (hand1.get(i) < hand2.get(i)) {
                hand2.add(hand2.get(i));
                hand2.add(hand1.get(i));
                hand2.remove(i);
                hand1.remove(i);
            } else {
                hand1.remove(i);
                hand2.remove(i);
            }
        }

        int sum = 0;
        if (hand1.size() > 0) {
            for (Integer integer : hand1) {
                sum += integer;
            }
            System.out.println("First player wins! Sum: " + sum);
        } else {
            for (Integer integer : hand2) {
                sum += integer;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }

        sc.close();
    }

}
