package zoo;

import animal.AnimalTypes;

public interface Izoo {
    String walk(Zoo zoo) throws Exception;
    String seeAnimal(String name, Zoo zoo) throws Exception;
    int countT(Zoo z, AnimalTypes type) throws Exception;
}
