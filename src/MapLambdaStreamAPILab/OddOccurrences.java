package MapLambdaStreamAPILab;

import java.util.*;

public class OddOccurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");
        int n = words.length;

        for (int i = 0; i < n; i++) {
            words[i] = words[i].toLowerCase();
        }

        Map<String, Integer> wordCounterMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            wordCounterMap.putIfAbsent(words[i], 0);
            wordCounterMap.put(words[i], wordCounterMap.get(words[i]) + 1);
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCounterMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                list.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", list));

        sc.close();
    }

}
