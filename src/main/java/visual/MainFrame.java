package visual;

import animal.Cow;
import animal.Wolf;
import zoo.Izoo;
import zoo.Zoo;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {

    public static void main(String[] args) {

        MyButton btn1 = new MyButton(60, 60, "Добавить клетку");
        MyButton btn2 = new MyButton(60, 100, "Посадить в клетку");
        MyButton btn3 = new MyButton(60, 140, "Посмотреть зоопарк");

        JFrame mainFrame = new JFrame();
        mainFrame.setLocation(600, 300);
        mainFrame.setSize(300, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.setLayout(null);
        mainFrame.add(btn1);
        mainFrame.add(btn2);
        mainFrame.add(btn3);

        Zoo zoo = new Zoo();

        ActionListener actionListenerBtn1 = new AddCage(zoo);
        btn1.addActionListener(actionListenerBtn1);

        ActionListener actionListenerBtn2 = new AddAnimal(zoo);
        btn2.addActionListener(actionListenerBtn2);

        ActionListener actionListenerBtn3 = new SeeAnimals(zoo);
        btn3.addActionListener(actionListenerBtn3);

    }
}
