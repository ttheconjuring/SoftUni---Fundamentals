package ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        int commandsCount = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < commandsCount; i++) {
            String command = sc.nextLine();
            String name = command.split("\\s+")[0];
            if (command.contains("not")) {
                if (names.contains(name)) {
                    names.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            } else {
                if (!names.contains(name)) {
                    names.add(name);
                } else {
                    System.out.println(name + " is already in the list!");
                }
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
 
        sc.close();
    }

}
