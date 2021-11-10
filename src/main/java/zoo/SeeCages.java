package zoo;

import animal.AnimalTypes;

import java.util.ArrayList;

public class SeeCages implements Izoo{
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
    public ArrayList<String> types(Zoo z) throws Exception {
        throw new Exception("not available");
    }

    @Override
    public String seeCages(Zoo z){
        String strOut = "";
        try{
            for(Cage cage : z.getCages()){
                try{
                    strOut += cage.getAnimal().getVoice();
                } catch (Exception ex){
                    strOut += ex.getMessage();
                }
                strOut += "\n";
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return strOut;
    }
}
