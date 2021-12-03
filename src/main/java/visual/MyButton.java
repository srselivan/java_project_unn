package visual;

import java.awt.*;

public class MyButton extends Button {
    public MyButton(int x, int y, String label) throws HeadlessException {
        setSize(180, 30);
        setLocation(x, y);
        setLabel(label);
        setVisible(true);
    }
}
