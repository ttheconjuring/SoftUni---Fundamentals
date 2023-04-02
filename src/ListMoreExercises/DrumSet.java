package ListMoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double savings = Double.parseDouble(sc.nextLine());
        List<Integer> drumInitialQuality = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> drumCurrentQuality = new ArrayList<>(drumInitialQuality);

        String hitPower = sc.nextLine();

        while (!hitPower.equals("Hit it again, Gabsy!")) {
            int damage = Integer.parseInt(hitPower);
            for (int i = 0; i < drumCurrentQuality.size(); i++) {
                drumCurrentQuality.set(i, drumCurrentQuality.get(i) - damage);
                if (drumCurrentQuality.get(i) <= 0) {
                    double replacementPrice = drumInitialQuality.get(i) * 3;
                    if (replacementPrice <= savings) {
                        savings -= replacementPrice;
                        drumCurrentQuality.set(i, drumInitialQuality.get(i));
                    } else {
                        drumCurrentQuality.remove(drumCurrentQuality.get(i));
                        drumInitialQuality.remove(drumInitialQuality.get(i));
                        i--;
                    }
                }
            }
            hitPower = sc.nextLine();
        }

        for (Integer integer : drumCurrentQuality) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("Gabsy has " + String.format("%.2f", savings) + "lv.");

        sc.close();
    }

}
