import animal.Animal;
import zoo.*;

public class Main {
    public static void main(String[] args) {

        Izoo action;
        Zoo z = new Zoo();
        z.addAnimal(new Animal("name1"),1);
        z.addAnimal(new Animal("name2"),2);

        try {
            action = Bzoo.build(Actions.walk);
            System.out.println(action.action(z));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try {
            action = Bzoo.build(Actions.see_animal);
            System.out.println(action.action("name3", z));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }
}
