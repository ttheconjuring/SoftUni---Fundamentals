package ArraysExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TreasureHunt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] item = sc.nextLine().split("\\|");
        int n = item.length;

        String command = sc.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandArray = command.split(" ");
            int m = commandArray.length;
            switch (commandArray[0]) {
                case "Loot":
                    String newLootSaver = "";
                    boolean isNew = true;
                    for (int i = 1; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            if (commandArray[i].equals(item[j])) {
                                isNew = false;
                                break;
                            }
                        }
                        if (isNew) {
                            newLootSaver += commandArray[i] + " ";
                        }
                        isNew = true;
                    }
                    if (newLootSaver.equals("")) {
                        break;
                    }
                    // creating an array with the new loot
                    String[] newLoot = newLootSaver.split("\\s+");
                    // reversing (idk why) (crying)
                    Collections.reverse(Arrays.asList(newLoot));
                    // creating the merging array
                    String[] wtf = new String[n + newLoot.length];
                    // initializing the merging array
                    System.arraycopy(newLoot, 0, wtf, 0, newLoot.length);
                    System.arraycopy(item, 0, wtf, newLoot.length, n);
                    // merging with the original 1
                    item = wtf;
                    // changing the length of the original array
                    n = item.length;
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandArray[1]);
                    if (index >= 0 && index < n) {
                        String holder = item[index];
                        for (int i = index; i < n - 1; i++) {
                            item[i] = item[i + 1];
                        }
                        item[n - 1] = holder;
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandArray[1]);
                    if (count >= n) {
                        String[] afterRemovingItems = new String[0];
                        // printing the stolen items
                        System.out.println(String.join(", ", item));
                        item = afterRemovingItems;
                        n = item.length;
                    } else {
                        // filling the stolen items array
                        String[] afterRemovingItems = new String[n - count];
                        for (int i = 0; i < afterRemovingItems.length; i++) {
                            afterRemovingItems[i] = item[i];
                        }
                        // printing the stolen items
                        for (int i = n - count; i < n; i++) {
                            if (i == n - 1) {
                                System.out.print(item[i]);
                            } else {
                                System.out.print(item[i] + ", ");
                            }
                        }
                        System.out.println();
                        item = afterRemovingItems;
                        n = item.length;
                    }
                    break;
            }
            command = sc.nextLine();
        }

        if (item.length == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            double sum = 0;
            for (String s : item) {
                sum += s.length();
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", sum / n);
        }
        sc.close();
    }

}