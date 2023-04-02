package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        int number;
        int index;

        while (!command.equals("End")) {
            String[] commandArray = command.split("\\s+");
            switch (commandArray[0]) {
                case "Add":
                    number = Integer.parseInt(commandArray[1]);
                    list.add(number);
                    break;
                case "Insert":
                    number = Integer.parseInt(commandArray[1]);
                    index = Integer.parseInt(commandArray[2]);
                    if (index < 0 || index >= list.size()) {
                        System.out.println("Invalid index");
                        break;
                    }
                    list.add(index, number);
                    break;
                case "Remove":
                    index = Integer.parseInt(commandArray[1]);
                    if (index < 0 || index >= list.size()) {
                        System.out.println("Invalid index");
                        break;
                    }
                    list.remove(index);
                    break;
                case "Shift":
                    int count = Integer.parseInt(commandArray[2]);
                    switch (commandArray[1]) {
                        case "left":
                            for (int i = 0; i < count; i++) {
                                int first = list.get(0);
                                list.remove(0);
                                list.add(first);
                            }
                            break;
                        case "right":
                            for (int i = 0; i < count; i++) {
                                int last = list.get(list.size() - 1);
                                list.remove(list.size() - 1);
                                list.add(0, last);
                            }
                            break;
                    }
                    break;
            }
            command = sc.nextLine();
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        sc.close();
    }
 
}
