package FinalExamPreparation;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String locationsOnTheMap = sc.nextLine();

        String validatingRegex = "([=/])[A-Z][A-Za-z]{2,}\\1";
        Pattern validatingPattern = Pattern.compile(validatingRegex);
        Matcher validatingMatcher = validatingPattern.matcher(locationsOnTheMap);

        List<String> validDestinationsList = new ArrayList<>();

        int travelPoints = 0;
        while (validatingMatcher.find()) {
            String validDestination = validatingMatcher.group().substring(1, validatingMatcher.group().length() - 1);
            validDestinationsList.add(validDestination);
            int lengthOfTheDestination = validDestination.length();
            travelPoints += lengthOfTheDestination;
        }

        System.out.println("Destinations: " + String.join(", ", validDestinationsList));
        System.out.println("Travel Points: " + travelPoints);

        sc.close();
    }

}
