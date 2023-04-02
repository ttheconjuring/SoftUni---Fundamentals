package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pathArray = sc.nextLine().split("\\\\");
        String[] fileNameAndExtensionArray = pathArray[pathArray.length - 1].split("\\.");
        System.out.println("File name: " + fileNameAndExtensionArray[0]);
        System.out.println("File extension: " + fileNameAndExtensionArray[1]);

        sc.close();
    }

}
