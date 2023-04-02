package ObjectsAndClassesExercise.VehicleCatalogue;

public class Vehicle {

    private String type;

    public String getType() {
        return this.type;
    }

    private String model;

    public String getModel() {
        return this.model;
    }

    private String color;

    public String getColor() {
        return this.color;
    }

    private int horsePower;

    public int getHorsePower() {
        return this.horsePower;
    }

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public void print() {
        System.out.println("Type: " + this.type.substring(0, 1).toUpperCase() + this.type.substring(1));
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Horsepower: " + this.horsePower);
    }


}
