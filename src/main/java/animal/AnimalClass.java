package animal;

import java.util.HashMap;

public class AnimalClass extends AnimalName{
    private AnimalClasses _class;

    private enum AnimalClasses{
        CLASS1,
        CLASS2
    }

    private final HashMap<String, AnimalClasses> classes = new HashMap<>();

    private void initMap(){
        classes.put("name1", AnimalClasses.CLASS1);
        classes.put("name2", AnimalClasses.CLASS2);
    }

    public AnimalClass(String name) {
        super(name);
        initMap();
        _class = classes.get(name);
    }

    @Override
    public String toString() {
        return _class.toString();
    }
}
