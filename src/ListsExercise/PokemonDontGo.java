package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int sumOfAllRemovedElements = 0;

        while (list.size() > 0) {
            int index = Integer.parseInt(sc.nextLine());
            if (index < 0) {
                int removedElement = list.get(0);
                sumOfAllRemovedElements += removedElement;
                list.set(0, list.get(list.size() - 1));
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) <= removedElement) {
                        list.set(i, (list.get(i) + removedElement));
                    } else {
                        list.set(i, (list.get(i) - removedElement));
                    }
                }
            } else if (index > list.size() - 1) {
                int removedElement = list.get(list.size() - 1);
                sumOfAllRemovedElements += removedElement;
                list.set(list.size() - 1, list.get(0));
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) <= removedElement) {
                        list.set(i, (list.get(i) + removedElement));
                    } else {
                        list.set(i, (list.get(i) - removedElement));
                    }
                }
            } else {
                int removedElement = list.get(index);
                sumOfAllRemovedElements += removedElement;
                list.remove(index);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) <= removedElement) {
                        list.set(i, (list.get(i) + removedElement));
                    } else {
                        list.set(i, (list.get(i) - removedElement));
                    }
                }
            }
        }

        System.out.println(sumOfAllRemovedElements);

        sc.close();
    }

}
