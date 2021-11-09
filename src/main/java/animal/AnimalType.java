package animal;

import java.util.HashMap;

public class AnimalType extends AnimalName{
    private final AnimalTypes type;

    private final HashMap<String, AnimalTypes> types = new HashMap<>();

    private void initMap(){
        types.put("name1", AnimalTypes.Herbivorous);
        types.put("name2", AnimalTypes.Predator);
    }

    public AnimalType(String name) {
        super(name);
        initMap();
        type = types.get(name);
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
