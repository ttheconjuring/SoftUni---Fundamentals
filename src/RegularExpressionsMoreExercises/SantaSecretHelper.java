package RegularExpressionsMoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantaSecretHelper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key = Integer.parseInt(sc.nextLine());

        List<String> goodKidsList = new ArrayList<>();

        String regex = "[^@\\-!:>]*@(?<name>[A-Za-z]+)[^@\\-!:>]*!(?<status>[GN])![^@\\-!:>]*";
        Pattern pattern = Pattern.compile(regex);

        String encryptedMessage = sc.nextLine();
        while (!encryptedMessage.equals("end")) {
            String decryptedMessage = decrypt(encryptedMessage, key);
            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find()) {
                String childStatus = matcher.group("status");
                if (childStatus.equals("G")) {
                    String childName = matcher.group("name");
                    goodKidsList.add(childName);
                }
            }
            encryptedMessage = sc.nextLine();
        }

        for (String kid : goodKidsList) {
            System.out.println(kid);
        }

        sc.close();
    }

    private static String decrypt(String encryptedMessage, int key) {
        StringBuilder decryptedMessage = new StringBuilder();
        int n = encryptedMessage.length();
        for (int i = 0; i < n; i++) {
            decryptedMessage.append((char)(encryptedMessage.charAt(i) - key));
        }
        return decryptedMessage.toString();
    }

}
