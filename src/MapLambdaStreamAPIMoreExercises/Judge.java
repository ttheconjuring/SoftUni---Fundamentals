package MapLambdaStreamAPIMoreExercises;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Judge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, Map<String, Integer>> contestUsernamePointsMap = new LinkedHashMap<>();

        while (!input.equals("no more time")) {
            String[] inputArray = input.split(" -> ");
            String username = inputArray[0];
            String contest = inputArray[1];
            int points = Integer.parseInt(inputArray[2]);
            contestUsernamePointsMap.putIfAbsent(contest, new TreeMap<>());
            contestUsernamePointsMap.get(contest).putIfAbsent(username, 0);
            if (contestUsernamePointsMap.get(contest).get(username) < points) {
                contestUsernamePointsMap.get(contest).put(username, points);
            }
            input = sc.nextLine();
        }

        AtomicInteger ai = new AtomicInteger();
        for (Map.Entry<String, Map<String, Integer>> stringMapEntry : contestUsernamePointsMap.entrySet()) {
            ai.set(0);
            System.out.println(stringMapEntry.getKey() + ": " + stringMapEntry.getValue().size() + " participants");
            /* stringMapEntry.getValue().entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                            .thenComparing(Map.Entry.comparingByKey()))
                    .forEach(e -> System.out.println(ai.incrementAndGet() + ". " + e.getKey() + " <::> " + e.getValue())); */
            entriesSortedByValues(contestUsernamePointsMap.get(stringMapEntry.getKey())).forEach(e -> System.out.println(ai.incrementAndGet() + ". " + e.getKey() + " <::> " + e.getValue()));
        }

        Map<String, Integer> usernameTotalPointsMap = new TreeMap<>();
        for (Map.Entry<String, Map<String, Integer>> stringMapEntry : contestUsernamePointsMap.entrySet()) {
            for (Map.Entry<String, Integer> stringIntegerEntry : stringMapEntry.getValue().entrySet()) {
                usernameTotalPointsMap.putIfAbsent(stringIntegerEntry.getKey(), 0);
                usernameTotalPointsMap.put(stringIntegerEntry.getKey(), usernameTotalPointsMap.get(stringIntegerEntry.getKey()) + stringIntegerEntry.getValue());
            }

        }

        System.out.println("Individual standings:");
        ai.set(0);
        entriesSortedByValues(usernameTotalPointsMap).forEach(e -> System.out.println(ai.incrementAndGet() + ". " + e.getKey() + " -> " + e.getValue()));
        /* usernameTotalPointsMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(ai.incrementAndGet() + ". " + e.getKey() + " -> " + e.getValue())); */

        sc.close();
    }

    static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
                new Comparator<Map.Entry<K, V>>() {
                    @Override
                    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                        int res = e2.getValue().compareTo(e1.getValue());
                        return res != 0 ? res : 1; // Special fix to preserve items with equal values
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

}
