package ListMoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int size1 = list1.size();
        int size2 = list2.size();
        List<Integer> list3 = new ArrayList<>();

        if (size1 > size2) {
            for (int i = 0; i < size2; i++) {
                list3.add(list1.get(i));
                list3.add(list2.get(size2 - 1 - i));
            }
            List<Integer> list4 = new ArrayList<>();
            int last = list1.get(size1 - 1);
            int lastButOne = list1.get(size1 - 2);
            int top = 0;
            int bot = 0;
            if (last > lastButOne) {
                top = last;
                bot = lastButOne;
            } else {
                top = lastButOne;
                bot = last;
            }
            for (int i = 0; i < list3.size(); i++) {
                if (list3.get(i) > bot && list3.get(i) < top) {
                    list4.add(list3.get(i));
                }
            }
            Collections.sort(list4);
            for (Integer integer : list4) {
                System.out.print(integer + " ");
            }
        } else {
            for (int i = 0; i < size1; i++) {
                list3.add(list1.get(i));
                list3.add(list2.get(size2 - 1 - i));
            }
            List<Integer> list4 = new ArrayList<>();
            int first = list2.get(0);
            int second = list2.get(1);
            int top = 0;
            int bot = 0;
            if (first > second) {
                top = first;
                bot = second;
            } else {
                top = second;
                bot = first;
            }
            for (int i = 0; i < list3.size(); i++) {
                if (list3.get(i) > bot && list3.get(i) < top) {
                    list4.add(list3.get(i));
                }
            }
            Collections.sort(list4);
            for (Integer integer : list4) {
                System.out.print(integer + " ");
            }
        }

        sc.close();
    }

}
