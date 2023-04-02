package ObjectsAndClassesExercise.OrderByAge;

public class Person {

    private String name;

    private String ID;

    private int age;

    public int getAge() {
        return this.age;
    }

    public Person(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public void print() {
        System.out.printf("%s with ID: %s is %d years old.%n", this.name, this.ID, this.age);
    }

}
