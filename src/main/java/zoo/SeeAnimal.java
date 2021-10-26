package zoo;

import animal.Animal;

public class SeeAnimal implements Izoo{
    @Override
    public String action(Zoo zoo) throws Exception {
        throw new Exception("not available");
    }

    @Override
    public String action(String name, Zoo zoo) {
        for (Animal var : zoo.getCell()){
            if (var != null)
                if (var.getName().toString() == name) return var.toString();
        }
        return "animal not found";
    }
}
