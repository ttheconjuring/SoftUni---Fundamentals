package MapLambdaStreamAPIExercise;

import java.util.*;

public class ForceBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        String force_side;
        String force_user;
        boolean forceUserAlreadyExists;
        boolean forceSideAlreadyExists;

        Map<String, List<String>> sideUserMap = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")) {
            String[] commandArray;
            String symbol;
            if (command.contains("|")) {
                commandArray = command.split(" \\| ");
                symbol = "|";
            } else {
                commandArray = command.split(" -> ");
                symbol = "->";
            }
            switch (symbol) {
                case "|":
                    force_side = commandArray[0];
                    force_user = commandArray[1];
                    sideUserMap.putIfAbsent(force_side, new ArrayList<>());
                    forceUserAlreadyExists = false;
                    for (Map.Entry<String, List<String>> stringListEntry : sideUserMap.entrySet()) {
                        if (stringListEntry.getValue().contains(force_user)) {
                            forceUserAlreadyExists = true;
                            break;
                        }
                    }
                    if (!forceUserAlreadyExists) {
                        sideUserMap.get(force_side).add(force_user);
                    }
                    break;
                case "->":
                    force_user = commandArray[0];
                    force_side = commandArray[1];
                    forceUserAlreadyExists = false;
                    String sideToBeRemovedFrom = "";
                    for (Map.Entry<String, List<String>> stringListEntry : sideUserMap.entrySet()) {
                        if (stringListEntry.getValue().contains(force_user)) {
                            sideToBeRemovedFrom = stringListEntry.getKey();
                            forceUserAlreadyExists = true;
                            break;
                        }
                    }
                    forceSideAlreadyExists = false;
                    for (Map.Entry<String, List<String>> stringListEntry : sideUserMap.entrySet()) {
                        if (stringListEntry.getKey().equals(force_side)) {
                            forceSideAlreadyExists = true;
                            break;
                        }
                    }
                    if (forceUserAlreadyExists && forceSideAlreadyExists) {
                        sideUserMap.get(sideToBeRemovedFrom).remove(force_user);
                        sideUserMap.get(force_side).add(force_user);
                    } else if (forceUserAlreadyExists) {
                        sideUserMap.get(sideToBeRemovedFrom).remove(force_user);
                        sideUserMap.put(force_side, new ArrayList<>());
                        sideUserMap.get(force_side).add(force_user);
                    }
                    if (!forceUserAlreadyExists && !forceSideAlreadyExists) {
                        sideUserMap.put(force_side, new ArrayList<>());
                        sideUserMap.get(force_side).add(force_user);
                    } else if (!forceUserAlreadyExists) {
                        sideUserMap.get(force_side).add(force_user);
                    }
                    System.out.println(force_user + " joins the " + force_side + " side!");
                    break;
            }
            command = sc.nextLine();
        }

        for (Map.Entry<String, List<String>> stringListEntry : sideUserMap.entrySet()) {
            if (stringListEntry.getValue().size() > 0) {
                System.out.println("Side: " + stringListEntry.getKey() + ", Members: " + stringListEntry.getValue().size());
                for (String forceUser : stringListEntry.getValue()) {
                    System.out.printf("! %s%n", forceUser);
                }
            }
        }

        sc.close();
    }

}
