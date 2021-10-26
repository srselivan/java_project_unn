package animal;

public class AnimalName {
    protected String name;

    public AnimalName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
