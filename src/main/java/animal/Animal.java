package animal;

public class Animal {
    AnimalName name;
    AnimalClass _class;
    AnimalType type;
    AnimalVoice voice;

    public Animal(String name) {
        this.name = new AnimalName(name);
        _class = new AnimalClass(name);
        type = new AnimalType(name);
        voice = new AnimalVoice(name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + name.toString() +
                ", _class=" + _class.toString() +
                ", type=" + type.toString() +
                ", voice=" + voice.toString() +
                '}';
    }

    public AnimalName getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }
}
