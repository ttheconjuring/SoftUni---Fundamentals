package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        int number;
        int index;

        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            switch (commandArray[0]) {
                case "Add":
                    number = Integer.parseInt(commandArray[1]);
                    list.add(number);
                    break;
                case "Remove":
                    number = Integer.parseInt(commandArray[1]);
                    list.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    index = Integer.parseInt(commandArray[1]);
                    list.remove(index);
                    break;
                case "Insert":
                    number = Integer.parseInt(commandArray[1]);
                    index = Integer.parseInt(commandArray[2]);
                    list.add(index, number);
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
