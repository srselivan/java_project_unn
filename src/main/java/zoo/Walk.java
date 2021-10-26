package zoo;

import animal.Animal;

public class Walk implements Izoo{
    @Override
    public String action(Zoo zoo) {
        String strOut = "";
        for (Animal var : zoo.getCell()){
            if (var == null) strOut += "cell is empty";
            else strOut += var.toString();
            strOut += "\n";
        }
        return strOut;
    }

    @Override
    public String action(String name, Zoo zoo) throws Exception {
        throw new Exception("not available");
    }
}
