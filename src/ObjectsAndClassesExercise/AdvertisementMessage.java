package ObjectsAndClassesExercise;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {

    public static void main(String[] args) {

        String[] phrase = {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};
        String[] event = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %s %s - %s%n", phrase[random.nextInt(phrase.length)], event[random.nextInt(event.length)], author[random.nextInt(author.length)], city[random.nextInt(city.length)]);
        }

        sc.close();
    }

}
