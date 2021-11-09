package zoo;

public class Bzoo {
    static public Izoo build(Actions act) throws Exception {
        if (act == Actions.walk) return new Walk();
        if (act == Actions.see_animal) return new SeeAnimal();
        if (act == Actions.countT) return new CountT();

        throw new Exception("not find action");
    }
}
