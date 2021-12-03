package visual;

import animal.Cow;
import animal.Wolf;
import zoo.Zoo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Locale;

public class AddAnimal implements ActionListener {
    private String name;
    private String _class;
    private int numCage;
    private Zoo z;

    public AddAnimal(Zoo z) {
        this.z = z;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Label lName = new Label("Имя");
        Label lClass = new Label("Класс");
        Label lNum = new Label("Номер клетки");

        lName.setLocation(50, 20);
        lName.setSize(100, 20);
        lName.setVisible(true);

        lClass.setLocation(50, 80);
        lClass.setSize(100, 20);
        lClass.setVisible(true);

        lNum.setLocation(50, 140);
        lNum.setSize(100, 20);
        lNum.setVisible(true);

        TextField textFieldName = new TextField();
        textFieldName.setSize(200, 20);
        textFieldName.setLocation(50, 40);
        textFieldName.setVisible(true);

        TextField textFieldClass = new TextField();
        textFieldClass.setSize(200, 20);
        textFieldClass.setLocation(50, 100);
        textFieldClass.setVisible(true);

        TextField textFieldNumCage = new TextField();
        textFieldNumCage.setSize(200, 20);
        textFieldNumCage.setLocation(50, 160);
        textFieldNumCage.setVisible(true);

        MyButton btnAccept = new MyButton(60, 190, "Добавить");

        SecondaryFrame addFrame = new SecondaryFrame();
        addFrame.add(btnAccept);
        addFrame.add(textFieldName);
        addFrame.add(textFieldClass);
        addFrame.add(textFieldNumCage);
        addFrame.add(lName);
        addFrame.add(lClass);
        addFrame.add(lNum);

        btnAccept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = textFieldName.getText();
                _class = textFieldClass.getText().toLowerCase(Locale.ROOT);
                numCage = Integer.parseInt(textFieldNumCage.getText());
                try {
                    switch (_class) {
                        case "wolf" -> {
                            z.getCages().get(numCage).addAnimal(new Wolf(name));
                            addFrame.dispose();
                        }
                        case "cow" -> {
                            z.getCages().get(numCage).addAnimal(new Cow(name));
                            addFrame.dispose();
                        }
                        default -> {
                            textFieldClass.setText("");
                            new ErrorFrame("Class incorrect");
                        }
                    }
                } catch (Exception ex) {
                    new ErrorFrame(ex.getMessage());
                }

            }
        });

    }

}
