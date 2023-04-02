package ListsLab;

import java.util.*;

public class ListOfProducts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<String> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        Collections.sort(list);

        for (int i = 1; i <= list.size(); i++) {
            System.out.printf("%d.%s%n", i, list.get(i - 1));
        }

        sc.close();
    }

}
