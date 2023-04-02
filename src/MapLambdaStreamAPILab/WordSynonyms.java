package MapLambdaStreamAPILab;

import java.util.*;

public class WordSynonyms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> dictionary = new LinkedHashMap<>();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();
            dictionary.putIfAbsent(word, new ArrayList<>());
            dictionary.get(word).add(synonym);
            /*if (!dictionary.containsKey(word)) {
                dictionary.put(word, new ArrayList<>());
                dictionary.get(word).add(synonym);
            } else {
                dictionary.get(word).add(synonym);
            }*/
        }

        for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }

        sc.close();
    }

}
