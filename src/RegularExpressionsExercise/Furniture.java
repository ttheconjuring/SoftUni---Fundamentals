    package RegularExpressionsExercise;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    public class Furniture {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);

            List<String> furnitures = new ArrayList<>();
            double totalPrice = 0;

            String input = sc.nextLine();

            while (!input.equals("Purchase")) {
                Matcher matcher = pattern.matcher(input);
                if (matcher.find()) {
                    String furniture = matcher.group("furniture");
                    furnitures.add(furniture);
                    double price = Double.parseDouble(matcher.group("price"));
                    int quantity = Integer.parseInt(matcher.group("quantity"));
                    totalPrice += (price * quantity);
                }
                input = sc.nextLine();
            }

            System.out.println("Bought furniture:");
            // System.out.println(String.join(System.lineSeparator(), furnitures));
            for(String str : furnitures) {
                System.out.println(str);
            }
            System.out.printf("Total money spend: %.2f", totalPrice);

            sc.close();
        }

    }