package MapLambdaStreamAPIExercise;

import java.util.*;

public class CompanyUsers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> companyEmployeeIDMap = new LinkedHashMap<>();

        String input = sc.nextLine();

        while (!input.equals("End")) {
            String[] inputArray = input.split(" -> ");
            String company = inputArray[0];
            String employeeID = inputArray[1];
            companyEmployeeIDMap.putIfAbsent(company, new ArrayList<>());
            if (!companyEmployeeIDMap.get(company).contains(employeeID)) {
                companyEmployeeIDMap.get(company).add(employeeID);
            }
            input = sc.nextLine();
        }

        for (Map.Entry<String, List<String>> stringListEntry : companyEmployeeIDMap.entrySet()) {
            System.out.println(stringListEntry.getKey());
            for (String employeeID : stringListEntry.getValue()) {
                System.out.printf("-- %s%n", employeeID);
            }
        }

        sc.close();
    }

}
