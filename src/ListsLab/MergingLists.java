package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int n = list1.size();
        List<Integer> list2 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int m = list2.size();
        List<Integer> list3 = new ArrayList<>();

        int minSize = Math.min(n, m);

        for (int i = 0; i < minSize; i++) {
            list3.add(list1.get(i));
            list3.add(list2.get(i));
        }

        for (int i = 0; i < n; i++) {
            if (!list3.contains(list1.get(i))) {
                list3.add(list1.get(i));
            }
        }

        for (int i = 0; i < m; i++) {
            if(!list3.contains(list2.get(i))) {
                list3.add(list2.get(i));
            }
        }

        for (Integer integer : list3) {
            System.out.print(integer + " ");
        }

        sc.close();
    }

}
