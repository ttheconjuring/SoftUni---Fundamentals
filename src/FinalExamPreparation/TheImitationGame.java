package FinalExamPreparation;

import java.util.Scanner;

public class TheImitationGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String encryptedMessage = sc.nextLine();

        StringBuilder decryptedMessage = new StringBuilder(encryptedMessage);

        String command = sc.nextLine();

        while (!command.equals("Decode")) {
            String[] commandArray = command.split("\\|");
            switch (commandArray[0]) {
                case "Move":
                    int number = Integer.parseInt(commandArray[1]);
                    if (number > 0 && number < decryptedMessage.length()) {
                        String firstNLetter = decryptedMessage.substring(0, number);
                        decryptedMessage.append(firstNLetter);
                        decryptedMessage.delete(0, number);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandArray[1]);
                    if (index >= 0 && index <= decryptedMessage.length()) {
                        String value = commandArray[2];
                        decryptedMessage.insert(index, value);
                    }
                    break;
                case "ChangeAll":
                    String substring = commandArray[1];
                    String dm = decryptedMessage.toString();
                    if (dm.contains(substring)) {
                        String replacement = commandArray[2];
                        if (replacement.equals(substring)) {
                            break;
                        } else {
                            dm = dm.replace(substring, replacement);
                            decryptedMessage.replace(0, decryptedMessage.length(), dm);
                        }
                    }
                    break;
            }
            command = sc.nextLine();
        }

        System.out.println("The decrypted message is: " + decryptedMessage);

        sc.close();
    }

}


