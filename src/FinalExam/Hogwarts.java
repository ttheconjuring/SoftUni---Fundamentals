package FinalExam;

import java.util.Scanner;

public class Hogwarts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String spell = sc.nextLine();

        StringBuilder result = new StringBuilder(spell);

        String command = sc.nextLine();

        while (!command.equals("Abracadabra")) {
            String[] commandArray = command.split(" ");
            switch (commandArray[0]) {
                case "Abjuration":
                    result.replace(0, result.length(), result.toString().toUpperCase());
                    System.out.println(result);
                    break;
                case "Necromancy":
                    result.replace(0, result.length(), result.toString().toLowerCase());
                    System.out.println(result);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(commandArray[1]);
                    if (index >= 0 && index < result.length()) {
                        result.deleteCharAt(index);
                        char letter = commandArray[2].charAt(0);
                        result.insert(index, letter);
                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String firstSubstring = commandArray[1];
                    String secondSubstring = commandArray[2];
                    if (result.toString().contains(firstSubstring)) {
                        result.replace(0, result.length(), result.toString().replace(firstSubstring, secondSubstring));
                        System.out.println(result);
                    }
                    break;
                case "Alteration":
                    String substring = commandArray[1];
                    if (result.toString().contains(substring)) {
                        int firstIndex = result.indexOf(substring);
                        int lastIndex = firstIndex + substring.length();
                        result.delete(firstIndex, lastIndex);
                        System.out.println(result);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
            }
            command = sc.nextLine();
        }

        sc.close();
    }

}

