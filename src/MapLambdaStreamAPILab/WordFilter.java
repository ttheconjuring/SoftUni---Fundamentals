package MapLambdaStreamAPILab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = Arrays.stream(sc.nextLine().split("\\s+")).filter(s -> s.length() % 2 == 0).toArray(String[]::new);
        System.out.println(String.join(System.lineSeparator(), array));

        sc.close();
    }

}
