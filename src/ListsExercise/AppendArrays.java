package ListsExercise;

import java.util.*;

public class AppendArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        List<Integer> list = new ArrayList<>();
        String[] lists = input.trim().split("\\|");
        int countLists = lists.length;
        List<String> stringSubList = new ArrayList<>();
        for (int i = 0; i < countLists; i++) {
            if (!lists[i].isBlank()) {
                stringSubList.add(lists[i]);
            }
        }
        for (int i = 0; i < stringSubList.size(); i++) {
            String[] subList = stringSubList.get(i).trim().split("\\s+");
            int n = subList.length;
            int[] intSubList = new int[n];
            for (int j = 0; j < n; j++) {
                intSubList[j] = Integer.parseInt(subList[j]);
            }
            List<Integer> integerSubList = new ArrayList<>(intSubList.length);
            for (Integer integer : intSubList) {
                integerSubList.add(integer);
            }
            list.addAll(0, integerSubList);
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        sc.close();
    }

}
