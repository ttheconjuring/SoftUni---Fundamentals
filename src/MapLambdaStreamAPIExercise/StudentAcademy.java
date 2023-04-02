package MapLambdaStreamAPIExercise;

import java.util.*;

public class StudentAcademy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<Double>> studentsGradesMap = new LinkedHashMap<>();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String student = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());
            studentsGradesMap.putIfAbsent(student, new ArrayList<>());
            studentsGradesMap.get(student).add(grade);
        }

        Map<String, Double> studentAverageGradeMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> stringListEntry : studentsGradesMap.entrySet()) {
            String student = stringListEntry.getKey();
            List<Double> gradesList = stringListEntry.getValue();
            double sum = 0;
            for (Double aDouble : gradesList) {
                sum += aDouble;
            }
            double averageGrade = sum / gradesList.size();
            if (averageGrade >= 4.50) {
                studentAverageGradeMap.put(student, averageGrade);
            }
        }

        for (Map.Entry<String, Double> stringDoubleEntry : studentAverageGradeMap.entrySet()) {
            System.out.println(stringDoubleEntry.getKey() + " -> " + String.format("%.2f", stringDoubleEntry.getValue()));
        }

        sc.close();
    }

}
