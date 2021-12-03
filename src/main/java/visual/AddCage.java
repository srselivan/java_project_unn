package visual;

import zoo.Zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCage implements ActionListener {
    private Zoo z;

    public AddCage(Zoo z) {
        this.z = z;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        z.addCage();
        new ErrorFrame("Клетка добавлена");
    }
}
