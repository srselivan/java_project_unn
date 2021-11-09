package zoo;

import animal.Animal;
import animal.AnimalTypes;

public class SeeAnimal implements Izoo{
    @Override
    public String walk(Zoo zoo) throws Exception {
        throw new Exception("not available");
    }

    @Override
    public String seeAnimal(String name, Zoo zoo){
        try {
            for (Cage cage : zoo.getCages()){
                if( cage.getAnimal().getName().toString() == name ) return cage.getAnimal().toString();
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return "animal not found";
    }

    @Override
    public int countT(Zoo z, AnimalTypes type) throws Exception {
        throw new Exception("not available");
    }

}
