package zoo;

public class Bzoo {
    static public Izoo build(Actions act) throws Exception {
        if (act == Actions.walk) return new Walk();
        if (act == Actions.see_animal) return new SeeAnimal();

        throw new Exception("not find action");
    }
}
