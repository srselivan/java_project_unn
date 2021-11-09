package zoo;

import animal.Animal;
import animal.AnimalTypes;

public class Walk implements Izoo{
    @Override
    public String walk(Zoo zoo){
        String strOut = "";
        try {
            for(Cage cage : zoo.getCages()){
                try {
                    strOut += cage.getAnimal().toString();
                }
                catch (Exception ex){
                    strOut += ex.getMessage();
                }
                strOut += '\n';
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return strOut;
    }

    @Override
    public String seeAnimal(String name, Zoo zoo) throws Exception {
        throw new Exception("not available");
    }

    @Override
    public int countT(Zoo z, AnimalTypes type) throws Exception {
        throw new Exception("not available");
    }

}
