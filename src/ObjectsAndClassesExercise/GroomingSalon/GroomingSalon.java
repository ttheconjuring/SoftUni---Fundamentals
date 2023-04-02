package ObjectsAndClassesExercise.GroomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

    private final List<Pet> data;
    private final int capacity;

    public int getCapacity() {
        return this.capacity;
    }

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (this.data.size() < this.capacity) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet pet : this.data) {
            if (pet.getName().equals(name)) {
                this.data.remove(pet);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (Pet pet : this.data) {
            if (pet.getName().equals(name)) {
                if (pet.getOwner().equals(owner)) {
                    return pet;
                }
            }
        }
        return null;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        String str = "The grooming salon has the following clients:\n";
        for (Pet pet : this.data) {
            str += (pet.getName() + " " + pet.getOwner() + "\n");
        }
        return str;
    }

}
