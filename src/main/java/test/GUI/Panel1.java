package GUI;

import javax.swing.*;
import java.awt.*;

public class Panel1 {
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.setSize(250, 200);

        JButton button = new JButton("Click me");
        JButton buttonTwo = new JButton("bliss");
        JButton buttonThere = new JButton("Exit");

        panel.add(button);
        panel.add(buttonTwo);
        panel.add(buttonThere);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setVisible(true);
    }
}
