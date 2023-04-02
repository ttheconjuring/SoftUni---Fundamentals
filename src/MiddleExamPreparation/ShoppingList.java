package MiddleExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = Arrays.stream(sc.nextLine().split("!")).collect(Collectors.toList());

        String command = sc.nextLine();

        String item;

        while (!command.equals("Go Shopping!")) {
            String[] commandArray = command.split("\\s+");
            switch (commandArray[0]) {
                case "Urgent":
                    item = commandArray[1];
                    if (!list.contains(item)) {
                        list.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    item = commandArray[1];
                    list.remove(item);
                    break;
                case "Correct":
                    String oldItem = commandArray[1];
                    String newItem = commandArray[2];
                    if (list.contains(oldItem)) {
                        list.set(list.indexOf(oldItem), newItem);
                    }
                    break;
                case "Rearrange":
                    item = commandArray[1];
                    if (list.contains(item)) {
                        list.remove(item);
                        list.add(item);
                    }
                    break;
            }
            command = sc.nextLine();
        }

        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }

        sc.close();
    }

}
