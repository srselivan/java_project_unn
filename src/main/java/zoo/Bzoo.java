package zoo;

public class Bzoo {
    static public Izoo build(Actions act) throws Exception {
        if (act == Actions.walk) return new Walk();
        if (act == Actions.see_animal) return new SeeAnimal();
        if (act == Actions.countT) return new CountT();
        if (act == Actions.types) return new Types();
        if (act == Actions.see_cages) return new SeeCages();

        throw new Exception("not find action");
    }
}
