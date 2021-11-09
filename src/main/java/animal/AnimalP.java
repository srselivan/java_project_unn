package animal;

abstract class AnimalP extends Animal{

    public AnimalP(String name, String voice) {
        super(name, AnimalTypes.Predator, voice);
    }

}
