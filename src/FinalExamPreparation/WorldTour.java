package FinalExamPreparation;

import java.util.Scanner;

public class WorldTour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);

        String command = sc.nextLine();

        while (!command.equals("Travel")) {
            if (command.startsWith("Add Stop:")) {
                String restOfTheCommand = command.substring(9);
                String[] restOfTheCommandArray = restOfTheCommand.split(":");
                int index = Integer.parseInt(restOfTheCommandArray[0]);
                if (index >= 0 && index < sb.length()) {
                    String string = restOfTheCommandArray[1];
                    sb.insert(index, string);
                }
                System.out.println(sb);
            } else if (command.startsWith("Remove Stop:")) {
                String restOfTheCommand = command.substring(12);
                String[] restOfTheCommandArray = restOfTheCommand.split(":");
                int startIndex = Integer.parseInt(restOfTheCommandArray[0]);
                if (startIndex >= 0 && startIndex < sb.length()) {
                    int endIndex = Integer.parseInt(restOfTheCommandArray[1]);
                    if (endIndex >= startIndex) {
                        if (endIndex < sb.length()) {
                            sb.delete(startIndex, endIndex + 1);
                        }
                    }
                }
                System.out.println(sb);
            } else if (command.startsWith("Switch:")) {
                String restOfTheCommand = command.substring(7);
                String[] restOfTheCommandArray = restOfTheCommand.split(":");
                String oldString = restOfTheCommandArray[0];
                String newString = restOfTheCommandArray[1];
                String initialString = sb.toString();
                if (initialString.contains(oldString)) {
                    initialString = initialString.replace(oldString, newString);
                    sb.replace(0, sb.length(), initialString);
                }
                System.out.println(sb);
            }
            command = sc.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + sb);

        sc.close();
    }

}
// 12345678
// elephant
// 01234567
