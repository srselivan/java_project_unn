package zoo;

import animal.AnimalTypes;

import java.util.ArrayList;

public class CountT implements Izoo{
    @Override
    public String walk(Zoo zoo) throws Exception {
        throw new Exception("not available");
    }

    @Override
    public String seeAnimal(String name, Zoo zoo) throws Exception {
        throw new Exception("not available");
    }

    @Override
    public int countT(Zoo z, AnimalTypes type) {
        int count = 0;
        try {
            for (Cage cage : z.getCages()){
                try {
                    if (cage.getAnimal().getType().toString() == type.toString())
                        count++;
                } catch (Exception ex){}
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return count;
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
