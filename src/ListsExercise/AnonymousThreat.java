package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("3:1")) {
            String[] commandArray = command.split("\\s+");
            switch (commandArray[0]) {
                case "merge":
                    int startIndex = Integer.parseInt(commandArray[1]);
                    if (startIndex < 0 || startIndex >= list.size()) {
                        startIndex = 0;
                    }
                    int endIndex = Integer.parseInt(commandArray[2]);
                    if (endIndex < 0 || endIndex >= list.size()) {
                        endIndex = list.size() - 1;
                    }
                    String mergedStrings = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        String currentString = list.get(i);
                        mergedStrings += currentString;
                    }
                    list.subList(startIndex, endIndex + 1).clear();
                    list.add(startIndex, mergedStrings);
                    break;
                case "divide":
                    int index = Integer.parseInt(commandArray[1]);
                    int partitions = Integer.parseInt(commandArray[2]);
                    if (partitions == 0 || partitions == 1) {
                        break;
                    }
                    String currentString = list.get(index);
                    list.remove(currentString);
                    if (currentString.length() % partitions == 0) {
                        int range = currentString.length() / partitions;
                        String[] splitCurrentString = splitToNChar(currentString, range);
                        for (int i = splitCurrentString.length - 1; i >= 0; i--) {
                            list.add(index, splitCurrentString[i]);
                        }
                    }
                    break;
            }
            command = sc.nextLine();
        }

        for (String s : list) {
            System.out.print(s + " ");
        }

        sc.close();
    }

    public static String[] splitToNChar(String text, int size) {
        List<String> parts = new ArrayList<>();

        int length = text.length();
        for (int i = 0; i < length; i += size) {
            parts.add(text.substring(i, Math.min(length, i + size)));
        }
        return parts.toArray(new String[0]);
    }

}