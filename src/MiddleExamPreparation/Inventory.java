package MiddleExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String command = sc.nextLine();

        String item;

        while (!command.equals("Craft!")) {
            String[] commandArray = command.split(" - ");
            switch (commandArray[0]) {
                case "Collect":
                    item = commandArray[1];
                    if (!list.contains(item)) {
                        list.add(item);
                    }
                    break;
                case "Drop":
                    item = commandArray[1];
                    list.remove(item);
                    break;
                case "Combine Items":
                    String[] items = commandArray[1].split(":");
                    String oldItem = items[0];
                    String newItem = items[1];
                    if (list.contains(oldItem)) {
                        list.add(list.indexOf(oldItem) + 1, newItem);
                    }
                    break;
                case "Renew":
                    item = commandArray[1];
                    if (list.contains(item)) {
                        list.remove(item);
                        list.add(item);
                    }
                    break;
            }
            command = sc.nextLine();
        }

        System.out.println(String.join(", ", list));

        sc.close();
    }

}
