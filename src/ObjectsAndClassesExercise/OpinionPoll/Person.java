package ObjectsAndClassesExercise.OpinionPoll;

public class Person {

    private String name;

    public String getName() {
        return this.name;
    }

    private int age;

    public int getAge() {
        return this.age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
