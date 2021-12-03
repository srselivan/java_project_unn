package animal;

abstract class Animal implements IAnimal{
    String name;
    AnimalTypes type;
    String voice;

    public Animal(String name, AnimalTypes type, String voice) {
        this.name = name;
        this.type = type;
        this.voice = voice;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public AnimalTypes getType() {
        return type;
    }

    @Override
    public String getVoice() {
        return voice;
    }

    @Override
    public String show() {
        return name + ", type: " + type + ", voice: '" + voice + "'";
    }
}
