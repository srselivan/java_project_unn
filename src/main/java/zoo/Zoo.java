package zoo;

import animal.Animal;

public class Zoo {
    private final int MAX_ANIMAL_COUNT = 4;
    private Animal[] cell = new Animal[MAX_ANIMAL_COUNT];

    public void addAnimal(Animal animal, int num) throws Exception {
        if (num < 0 || num > MAX_ANIMAL_COUNT) throw new Exception("incorrect num");
        if (cell[num] == null)
            cell[num] = animal;
    }

    public Animal[] getCell() {
        return cell;
    }
}
