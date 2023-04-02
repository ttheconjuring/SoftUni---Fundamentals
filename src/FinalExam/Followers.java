package FinalExam;

import java.util.*;

public class Followers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        Map<String, List<Integer>> usernameLikesCommentsMap = new LinkedHashMap<>();

        String username;

        while (!command.equals("Log out")) {
            String[] commandArray = command.split(": ");
            switch (commandArray[0]) {
                case "New follower":
                    username = commandArray[1];
                    if (!usernameLikesCommentsMap.containsKey(username)) {
                        usernameLikesCommentsMap.putIfAbsent(username, new ArrayList<>());
                        usernameLikesCommentsMap.get(username).add(0);
                        usernameLikesCommentsMap.get(username).add(0);
                    }
                    break;
                case "Like":
                    username = commandArray[1];
                    int count = Integer.parseInt(commandArray[2]);
                    if (!usernameLikesCommentsMap.containsKey(username)) {
                        usernameLikesCommentsMap.putIfAbsent(username, new ArrayList<>());
                        usernameLikesCommentsMap.get(username).add(count);
                        usernameLikesCommentsMap.get(username).add(0);
                    } else {
                        usernameLikesCommentsMap.get(username).set(0, usernameLikesCommentsMap.get(username).get(0) + count);
                    }
                    break;
                case "Comment":
                    username = commandArray[1];
                    if (!usernameLikesCommentsMap.containsKey(username)) {
                        usernameLikesCommentsMap.putIfAbsent(username, new ArrayList<>());
                        usernameLikesCommentsMap.get(username).add(0);
                        usernameLikesCommentsMap.get(username).add(1);
                    } else {
                        usernameLikesCommentsMap.get(username).set(1, usernameLikesCommentsMap.get(username).get(1) + 1);
                    }
                    break;
                case "Blocked":
                    username = commandArray[1];
                    if (usernameLikesCommentsMap.containsKey(username)) {
                        usernameLikesCommentsMap.remove(username);
                    } else {
                        System.out.println(username + " doesn't exist.");
                    }
                    break;
            }
            command = sc.nextLine();
        }

        System.out.println(usernameLikesCommentsMap.size() + " followers");
        for (Map.Entry<String, List<Integer>> stringListEntry : usernameLikesCommentsMap.entrySet()) {
            System.out.println(stringListEntry.getKey() + ": " + (stringListEntry.getValue().get(0) + stringListEntry.getValue().get(1)));
        }

        sc.close();
    }

}
