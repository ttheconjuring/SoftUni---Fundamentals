package MiddleExam;

import java.util.Scanner;

public class FriendListMaintenance {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String friends = sc.nextLine();
        String[] friendList = friends.split(", ");
        int n = friendList.length;

        String command = sc.nextLine();

        int index;

        while (!command.equals("Report")) {
            String[] commandArray = command.split("\\s+");
            switch (commandArray[0]) {
                case "Blacklist":
                    String name = commandArray[1];
                    boolean isFound = false;
                    for (int i = 0; i < n; i++) {
                        if (friendList[i].equals(name)) {
                            isFound = true;
                            friendList[i] = "Blacklisted";
                            System.out.println(name + " was blacklisted.");
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println(name + " was not found.");
                    }
                    break;
                case "Error":
                    index = Integer.parseInt(commandArray[1]);
                    if (index >= 0 && index < n) {
                        if (!friendList[index].equals("Blacklisted")) {
                            if (!friendList[index].equals("Lost")) {
                                String lostName = friendList[index];
                                friendList[index] = "Lost";
                                System.out.println(lostName + " was lost due to an error.");
                            }
                        }
                    }
                    break;
                case "Change":
                    index = Integer.parseInt(commandArray[1]);
                    if (index >= 0 && index < n) {
                        String newName = commandArray[2];
                        String currentName = friendList[index];
                        friendList[index] = newName;
                        System.out.println(currentName + " changed his username to " + newName + ".");
                    }
                    break;
            }
            command = sc.nextLine();
        }

        int blacklisted = 0;
        int lost = 0;
        for (int i = 0; i < n; i++) {
            if (friendList[i].equals("Blacklisted")) {
                blacklisted++;
            } else if (friendList[i].equals("Lost")) {
                lost++;
            }
        }

        System.out.println("Blacklisted names: " + blacklisted);
        System.out.println("Lost names: " + lost);
        System.out.println(String.join(" ", friendList));

        sc.close();
    }

}
