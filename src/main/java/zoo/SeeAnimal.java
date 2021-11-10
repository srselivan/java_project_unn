package zoo;

import animal.AnimalTypes;

import java.util.ArrayList;

public class SeeAnimal implements Izoo{
    @Override
    public String walk(Zoo zoo) throws Exception {
        throw new Exception("not available");
    }

    @Override
    public String seeAnimal(String name, Zoo zoo){
        try {
            for (Cage cage : zoo.getCages()){
                if( cage.getAnimal().getName() == name ) return cage.getAnimal().show();
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

    @Override
    public ArrayList<String> types(Zoo z) throws Exception{
        throw new Exception("not available");
    }

    @Override
    public String seeCages(Zoo z) throws Exception {
        throw new Exception("not available");
    }
}
