
import animal.AnimalTypes;
import animal.Wolf;
import animal.Cow;
import zoo.*;

public class Main {
    public static void main(String[] args) {

        Izoo action;
        Zoo z = new Zoo();
        try {
            z.addCage();
            z.addCage();
            z.addCage();
            z.addCage();
            z.getCages().get(0).addAnimal(new Wolf("name"));
            z.getCages().get(2).addAnimal(new Cow("name2"));
            z.getCages().get(3).addAnimal(new Wolf("name3"));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try {
            action = Bzoo.build(Actions.walk);
            System.out.println(action.walk(z));

            action = Bzoo.build(Actions.types);
            System.out.println(action.types(z));

            action = Bzoo.build(Actions.countT);
            System.out.println(action.countT(z, AnimalTypes.Herbivorous));
            System.out.println(action.countT(z, AnimalTypes.Predator));

            action = Bzoo.build(Actions.see_cages);
            System.out.println(action.seeCages(z));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

 /*      try {
            action = Bzoo.build(Actions.see_animal);
            System.out.println(action.seeAnimal("name3", z));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }*/


    }
}
