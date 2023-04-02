package ObjectAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student {

        private String firstName;

        public String getFirstName() {
            return this.firstName;
        }

        private String lastName;

        public String getLastName() {
            return this.lastName;
        }

        private int age;

        public int getAge() {
            return this.age;
        }

        private String homeTown;

        public String getHomeTown() {
            return this.homeTown;
        }

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String studentInformation = sc.nextLine();

        while (!studentInformation.equals("end")) {
            String[] studentInformationArray = studentInformation.split("\\s+");
            studentList.add(new Student(studentInformationArray[0], studentInformationArray[1], Integer.parseInt(studentInformationArray[2]), studentInformationArray[3]));
            studentInformation = sc.nextLine();
        }

        String city = sc.nextLine();

        for (Student student : studentList) {
            if (student.getHomeTown().equals(city)) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + " is " + student.getAge() + " years old");
            }
        }

        sc.close();
    }

}
