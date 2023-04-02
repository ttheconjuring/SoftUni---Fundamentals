package MiddleExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());

        int move = 0;

        String input = sc.nextLine();

        while (!input.equals("end")) {
            String[] inputArray = input.split("\\s+");
            int firstIndex = Integer.parseInt(inputArray[0]);
            int secondIndex = Integer.parseInt(inputArray[1]);
            move++;
            if ((firstIndex == secondIndex) || (isOutOfBounds(firstIndex, list.size()) || isOutOfBounds(secondIndex, list.size()))) {
                System.out.println("Invalid input! Adding additional elements to the board");
                list.add(list.size() / 2, "-" + move + "a");
                list.add(list.size() / 2, "-" + move + "a");
            } else {
                String firstElement = list.get(firstIndex);
                String secondElement = list.get(secondIndex);
                if (firstElement.equals(secondElement)) {
                    int indexOfTheFirstElement = list.indexOf(firstElement);
                    list.remove(indexOfTheFirstElement);
                    int indexOfTheSecondElement = list.indexOf(secondElement);
                    list.remove(indexOfTheSecondElement);
                    System.out.println("Congrats! You have found matching elements - " + firstElement + "!");
                } else {
                    System.out.println("Try again!");
                }
            }
            if (list.isEmpty()) {
                System.out.println("You have won in " + move + " turns!");
                return;
            }
            input = sc.nextLine();
        }

        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ", list));

        sc.close();
    }

    public static boolean isOutOfBounds(int index, int length) {
        return index < 0 || index >= length;
    }


}
