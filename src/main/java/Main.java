import animal.Animal;
import zoo.*;

public class Main {
    public static void main(String[] args) {

        Izoo action;
        Zoo z = new Zoo();
        try {
            z.addCage();
            z.addCage();
            z.addCage();
            z.getCages().get(0).addAnimal(new Animal("name1"));
            z.getCages().get(2).addAnimal(new Animal("name2"));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try {
            action = Bzoo.build(Actions.walk);
            System.out.println(action.seeAnimal("name1",z));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

/*        try {
            action = Bzoo.build(Actions.see_animal);
            System.out.println(action.action("name3", z));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }*/


    }
}
