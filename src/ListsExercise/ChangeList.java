package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        int element;

        while (!command.equals("end")) {
            String[] commandArray = command.split("\\s+");
            switch (commandArray[0]) {
                case "Delete":
                    element = Integer.parseInt(commandArray[1]);
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) == element) {
                            list.remove(i);
                            i--;
                        }
                    }
                    break;
                case "Insert":
                    element = Integer.parseInt(commandArray[1]);
                    int position = Integer.parseInt(commandArray[2]);
                    list.add(position, element);
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
