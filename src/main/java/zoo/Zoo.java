package zoo;

import animal.Animal;

public class Zoo {
    private final int ANIMAL_COUNT = 4;
    private Animal[] cell = new Animal[ANIMAL_COUNT];

    public void addAnimal(Animal animal, int num){
        if (cell[num] == null)
            cell[num] = animal;
    }

    public Animal[] getCell() {
        return cell;
    }
}
