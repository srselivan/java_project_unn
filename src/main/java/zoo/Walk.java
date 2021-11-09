package zoo;

import animal.AnimalTypes;

import java.util.ArrayList;

public class Walk implements Izoo{
    @Override
    public String walk(Zoo zoo){
        String strOut = "";
        try {
            for(Cage cage : zoo.getCages()){
                try {
                    strOut += cage.getAnimal().show();
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

    @Override
    public ArrayList<String> types(Zoo z) throws Exception{
        throw new Exception("not available");
    }
}
