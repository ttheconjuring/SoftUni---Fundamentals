package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, Map<String, String>> pieceComposerKeyMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] inputArray = input.split("\\|");
            String piece = inputArray[0];
            String composer = inputArray[1];
            String key = inputArray[2];
            pieceComposerKeyMap.putIfAbsent(piece, new LinkedHashMap<>());
            pieceComposerKeyMap.get(piece).putIfAbsent(composer, key);
        }

        String command = sc.nextLine();

        while (!command.equals("Stop")) {
            String[] commandArray = command.split("\\|");
            switch (commandArray[0]) {
                case "Add":
                    String piece = commandArray[1];
                    if (!pieceComposerKeyMap.containsKey(piece)) {
                        String composer = commandArray[2];
                        String key = commandArray[3];
                        pieceComposerKeyMap.putIfAbsent(piece, new LinkedHashMap<>());
                        pieceComposerKeyMap.get(piece).putIfAbsent(composer, key);
                        System.out.println(piece + " by " + composer + " in " + key + " added to the collection!");
                    } else {
                        System.out.println(piece + " is already in the collection!");
                    }
                    break;
                case "Remove":
                    String existingPiece = commandArray[1];
                    if (pieceComposerKeyMap.containsKey(existingPiece)) {
                        pieceComposerKeyMap.remove(existingPiece);
                        System.out.println("Successfully removed " + existingPiece + "!");
                    } else {
                        System.out.println("Invalid operation! " + existingPiece + " does not exist in the collection.");
                    }
                    break;
                case "ChangeKey":
                    String alreadyAddedPiece = commandArray[1];
                    if (pieceComposerKeyMap.containsKey(alreadyAddedPiece)) {
                        String newKey = commandArray[2];
                        Map<String, String> wtf = pieceComposerKeyMap.get(alreadyAddedPiece);
                        String existingComposer = "";
                        for (Map.Entry<String, String> stringStringEntry : wtf.entrySet()) {
                            existingComposer = stringStringEntry.getKey();
                        }
                        pieceComposerKeyMap.get(alreadyAddedPiece).put(existingComposer, newKey);
                        System.out.println("Changed the key of " + alreadyAddedPiece + " to " + newKey + "!");
                    } else {
                        System.out.println("Invalid operation! " + alreadyAddedPiece + " does not exist in the collection.");
                    }
                    break;
            }
            command = sc.nextLine();
        }

        for (Map.Entry<String, Map<String, String>> stringMapEntry : pieceComposerKeyMap.entrySet()) {
            String composer = "";
            String key = "";
            for (Map.Entry<String, String> stringStringEntry : stringMapEntry.getValue().entrySet()) {
                composer = stringStringEntry.getKey();
                key = stringStringEntry.getValue();
            }
            System.out.println(stringMapEntry.getKey() + " -> Composer: " + composer + ", Key: " + key);
        }

        sc.close();
    }

}
