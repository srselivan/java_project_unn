package zoo;

import animal.AnimalTypes;

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
                if (cage.getAnimal().getType().toString() == type.toString())
                    count++;
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return count;
    }
}
