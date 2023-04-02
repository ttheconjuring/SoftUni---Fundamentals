package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        int number;

        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            switch (commandArray[0]) {
                case "Contains":
                    number = Integer.parseInt(commandArray[1]);
                    if (list.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (commandArray[1]) {
                        case "even":
                            for (Integer integer : list) {
                                if (integer % 2 == 0) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (Integer integer : list) {
                                if (integer % 2 != 0) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer integer : list) {
                        sum += integer;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    number = Integer.parseInt(commandArray[2]);
                    switch (commandArray[1]) {
                        case "<":
                            for (Integer integer : list) {
                                if (integer < number) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (Integer integer : list) {
                                if (integer > number) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (Integer integer : list) {
                                if (integer >= number) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (Integer integer : list) {
                                if (integer <= number) {
                                    System.out.print(integer + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
            command = sc.nextLine();
        }
        sc.close();
    }

}
