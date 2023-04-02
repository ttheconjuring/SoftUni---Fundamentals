package MapLambdaStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, String> usernameLicensePlateNumberMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] commandArray = sc.nextLine().split("\\s+");
            String command = commandArray[0];
            String username = commandArray[1];
            switch (command) {
                case "register":
                    String licensePlateNumber = commandArray[2];
                    if (!usernameLicensePlateNumberMap.containsKey(username)) {
                        usernameLicensePlateNumberMap.put(username, licensePlateNumber);
                        System.out.println(username + " registered " + licensePlateNumber + " successfully");
                    } else {
                        System.out.println("ERROR: already registered with plate number " + licensePlateNumber);
                    }
                    break;
                case "unregister":
                    if (!usernameLicensePlateNumberMap.containsKey(username)) {
                        System.out.println("ERROR: user " + username + " not found");
                    } else {
                        usernameLicensePlateNumberMap.remove(username);
                        System.out.println(username + " unregistered successfully");
                    }
                    break;
            }
        }

        for (Map.Entry<String, String> stringStringEntry : usernameLicensePlateNumberMap.entrySet()) {
            System.out.println(stringStringEntry.getKey() + " => " + stringStringEntry.getValue());
        }

        sc.close();
    }

}
