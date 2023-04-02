package ListsExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();

        while (!input.equals("end")) {
            String[] inputArray = input.split("\\s+");
            if (inputArray[0].equals("Add")) {
                int passengers = Integer.parseInt(inputArray[1]);
                wagons.add(passengers);
            } else {
                int passengers = Integer.parseInt(inputArray[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);
                    if (currentWagon < maxCapacity) {
                        int freeSpots = maxCapacity - currentWagon;
                        if (freeSpots >= passengers) {
                            currentWagon += passengers;
                            wagons.set(i, currentWagon);
                            break;
                        }
                    }
                }
            }
            input = sc.nextLine();
        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }

        sc.close();
    }

}
