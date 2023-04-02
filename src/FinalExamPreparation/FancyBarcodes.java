package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String regex = "@#+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            Matcher matcher = pattern.matcher(sc.nextLine());
            if (matcher.find()) {
                String barcode = matcher.group("barcode");
                StringBuilder productGroup = new StringBuilder();
                for (Character currentCharacter : barcode.toCharArray()) {
                    if (Character.isDigit(currentCharacter)) {
                        productGroup.append(currentCharacter);
                    }
                }
                if (productGroup.toString().isEmpty()) {
                    productGroup.append("00");
                }
                System.out.println("Product group: " + productGroup);
            } else {
                System.out.println("Invalid barcode");
            }
        }

        sc.close();
    }

}
