package zoo;

import animal.Animal;

public class Cage {
    Animal animal = null;

    public void addAnimal(Animal animal) throws Exception {
        if (animal == null)
            throw new Exception("cage is full");
        this.animal = animal;
    }

    public Animal getAnimal() throws Exception {
        if (animal == null)
            throw new Exception("cage is empty");
        return animal;
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
