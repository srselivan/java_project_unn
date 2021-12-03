package visual;

import animal.AnimalTypes;
import zoo.Actions;
import zoo.Bzoo;
import zoo.Izoo;
import zoo.Zoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeeAnimals implements ActionListener {
    private Zoo z;

    public SeeAnimals(Zoo z) {
        this.z = z;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Izoo action;

        TextArea textArea = new TextArea();
        textArea.setVisible(true);
        textArea.setSize(270, 200);
        textArea.setLocation(15, 10);

        try {
            action = Bzoo.build(Actions.walk);
            textArea.setText(action.walk(z));
        } catch (Exception ex){
            new ErrorFrame(ex.getMessage());
        }

        MyButton btn = new MyButton(125, 230, "OK");
        btn.setSize(50,30);

        SecondaryFrame seeAnimals = new SecondaryFrame();
        seeAnimals.add(textArea);
        seeAnimals.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seeAnimals.dispose();
            }
        });
    }
}
