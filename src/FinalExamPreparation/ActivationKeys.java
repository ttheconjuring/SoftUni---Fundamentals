package FinalExamPreparation;

import java.util.Scanner;

public class ActivationKeys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rawActivationKey = sc.nextLine();

        String command = sc.nextLine();

        int startIndex;
        int endIndex;

        StringBuilder sb = new StringBuilder(rawActivationKey);
        while (!command.equals("Generate")) {
            String[] commandArray = command.split(">>>");
            switch (commandArray[0]) {
                case "Contains":
                    String substring = commandArray[1];
                    if (sb.toString().contains(substring)) {
                        System.out.println(sb + " contains " + substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String givenCase = commandArray[1];
                    startIndex = Integer.parseInt(commandArray[2]);
                    endIndex = Integer.parseInt(commandArray[3]);
                    switch (givenCase) {
                        case "Upper":
                            sb.replace(startIndex, endIndex, sb.substring(startIndex, endIndex).toUpperCase());
                            break;
                        case "Lower":
                            sb.replace(startIndex, endIndex, sb.substring(startIndex, endIndex).toLowerCase());
                            break;
                    }
                    System.out.println(sb);
                    break;
                case "Slice":
                    startIndex = Integer.parseInt(commandArray[1]);
                    endIndex = Integer.parseInt(commandArray[2]);
                    sb.delete(startIndex, endIndex);
                    System.out.println(sb);
                    break;
            }
            command = sc.nextLine();
        }

        System.out.println("Your activation key is: " + sb);

        sc.close();
    }

}
