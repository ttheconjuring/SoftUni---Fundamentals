package FinalExamPreparation;

import java.util.Scanner;

public class PasswordReset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String command = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
        while (!command.equals("Done")) {
            String[] commandArray = command.split("\\s+");
            switch (commandArray[0]) {
                case "TakeOdd":
                    for (int i = 0; i < sb.length(); i += 2) {
                        sb.deleteCharAt(i);
                        i--;
                    }
                    System.out.println(sb);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commandArray[1]);
                    int length = Integer.parseInt(commandArray[2]);
                    String trash = sb.substring(index, index + length);
                    int startIndexOfOccurrence = sb.indexOf(trash);
                    int endIndexOfOccurrence = startIndexOfOccurrence + length;
                    sb.delete(startIndexOfOccurrence, endIndexOfOccurrence);
                    System.out.println(sb);
                    break;
                case "Substitute":
                    String substring = commandArray[1];
                    String substitute = commandArray[2];
                    String password = sb.toString();
                    if (password.contains(substring)) {
                        password = password.replace(substring, substitute);
                        sb.replace(0, sb.length(), password);
                        System.out.println(sb);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = sc.nextLine();
        }

        System.out.println("Your password is: " + sb);

        sc.close();
    }

}
