package zoo;

import animal.AnimalTypes;
import java.util.ArrayList;

public interface Izoo {
    String walk(Zoo zoo) throws Exception;
    String seeAnimal(String name, Zoo zoo) throws Exception;
    int countT(Zoo z, AnimalTypes type) throws Exception;
    ArrayList<String> types(Zoo z) throws Exception;
}
