package MapLambdaStreamAPIExercise;

import java.util.*;

public class Orders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, Double> productPriceMap = new LinkedHashMap<>();
        Map<String, Integer> productQuantityMap = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] inputArray = input.split("\\s+");
            String product = inputArray[0];
            double price = Double.parseDouble(inputArray[1]);
            int quantity = Integer.parseInt(inputArray[2]);
            if (!productPriceMap.containsKey(product)) {
                productPriceMap.put(product, price);
                productQuantityMap.put(product, quantity);
            } else {
                if (price != productPriceMap.get(product)) {
                    productQuantityMap.put(product, productQuantityMap.get(product) + quantity);
                    productPriceMap.put(product, price);
                } else {
                    productQuantityMap.put(product, productQuantityMap.get(product) + quantity);
                }
            }
            input = sc.nextLine();
        }

        for (Map.Entry<String, Double> stringDoubleEntry : productPriceMap.entrySet()) {
            System.out.println(stringDoubleEntry.getKey() + " -> " + String.format("%.2f", stringDoubleEntry.getValue() * productQuantityMap.get(stringDoubleEntry.getKey())));
        }


        sc.close();
    }

}
