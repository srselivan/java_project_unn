package zoo;

import animal.AnimalTypes;

import java.util.ArrayList;

public class Types implements Izoo{
    @Override
    public String walk(Zoo zoo) throws Exception {
        throw new Exception("not available");
    }

    @Override
    public String seeAnimal(String name, Zoo zoo) throws Exception {
        throw new Exception("not available");
    }

    @Override
    public int countT(Zoo z, AnimalTypes type) throws Exception {
        throw new Exception("not available");
    }

    @Override
    public ArrayList<String> types(Zoo z) {
        ArrayList<String> uTypes = new ArrayList<>();
        try{
            for (Cage cage : z.getCages()){
                try {
                    if(!uTypes.contains(cage.getAnimal().getType().toString()))
                        uTypes.add(cage.getAnimal().getType().toString());
                } catch (Exception ex){}
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return uTypes;
    }
}
