package zoo;

import animal.Animal;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Cage> cages = new ArrayList<>();

    public void addCage(){
        cages.add(new Cage());
    }

    public ArrayList<Cage> getCages() throws Exception {
        if(cages.isEmpty())
            throw new Exception("zoo is empty");
        return cages;
    }
}
