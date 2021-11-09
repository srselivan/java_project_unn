package zoo;

import animal.IAnimal;

public class Cage {
    IAnimal animal = null;

    public void addAnimal(IAnimal animal) throws Exception {
        if (this.animal != null)
            throw new Exception("cage is full");
        this.animal = animal;
    }

    public IAnimal getAnimal() throws Exception {
        if (this.animal == null)
            throw new Exception("cage is empty");
        return animal;
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
