package ObjectAndClassesLab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split("\\s+");
        int n = array.length;

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int indexX = random.nextInt(n);
            int indexY = random.nextInt(n);
            String holder = array[indexX];
            array[indexX] = array[indexY];
            array[indexY] = holder;
        }

        System.out.println(String.join(System.lineSeparator(), array));

        sc.close();
    }

}
