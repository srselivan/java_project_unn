package visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextLayout;

public class ErrorFrame extends JFrame {
    public ErrorFrame(String error) throws HeadlessException {
        setSize(200, 200);
        setLocation(650, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        Label message = new Label(error);
        message.setSize(190, 40);
        message.setLocation(5, 40);
        message.setVisible(true);
        add(message);

        MyButton btn = new MyButton(75, 100, "OK");
        btn.setSize(50,30);
        add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
