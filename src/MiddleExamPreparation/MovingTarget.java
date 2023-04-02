package MiddleExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        int index;

        while (!command.equals("End")) {
            String[] commandArray = command.split("\\s+");
            switch (commandArray[0]) {
                case "Shoot":
                    index = Integer.parseInt(commandArray[1]);
                    if (index >= 0 && index < list.size()) {
                        int power = Integer.parseInt(commandArray[2]);
                        if (list.get(index) - power > 0) {
                            list.set(index, (list.get(index) - power));
                        } else {
                            list.remove(index);
                        }
                    }
                    break;
                case "Add":
                    index = Integer.parseInt(commandArray[1]);
                    if (index >= 0 && index < list.size()) {
                        int value = Integer.parseInt(commandArray[2]);
                        list.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    index = Integer.parseInt(commandArray[1]);
                    if (index >= 0 && index < list.size()) {
                        int radius = Integer.parseInt(commandArray[2]);
                        int elementsBeforeTheTarget = 0;
                        for (int i = 0; i < index; i++) {
                            elementsBeforeTheTarget++;
                        }
                        int elementsAfterTheTarget = 0;
                        for (int i = index + 1; i < list.size(); i++) {
                            elementsAfterTheTarget++;
                        }
                        if (radius > elementsBeforeTheTarget || radius > elementsAfterTheTarget) {
                            System.out.println("Strike missed!");
                            break;
                        } else {
                            int valueOfIndex = list.get(index);
                            list.subList(index - radius, index).clear();
                            index = list.indexOf(valueOfIndex);
                            list.subList(index + 1, index + radius + 1).clear();
                            list.remove(index);
                        }
                    }
            }
            command = sc.nextLine();
        }

        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + "|");
            }
        }

        sc.close();
    }

}

