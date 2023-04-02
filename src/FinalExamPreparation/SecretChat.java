package FinalExamPreparation;

import java.util.Scanner;

public class SecretChat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String command = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
        while (!command.equals("Reveal")) {
            String[] commandArray = command.split(":\\|:");
            switch (commandArray[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandArray[1]);
                    sb.insert(index, " ");
                    System.out.println(sb);
                    break;
                case "Reverse":
                    String substring = commandArray[1];
                    if (sb.toString().contains(substring)) {
                        int firstIndex = sb.indexOf(substring);
                        int endIndex = firstIndex + substring.length();
                        sb.delete(firstIndex, endIndex);
                        sb.append(new StringBuilder(substring).reverse());
                        System.out.println(sb);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substr = commandArray[1];
                    String replacement = commandArray[2];
                    String wtf = sb.toString();
                    wtf = wtf.replace(substr, replacement);
                    sb.replace(0, sb.length(), wtf);
                    System.out.println(sb);
                    break;
            }
            command = sc.nextLine();
        }

        System.out.println("You have a new text message: " + sb);

        sc.close();
    }

}