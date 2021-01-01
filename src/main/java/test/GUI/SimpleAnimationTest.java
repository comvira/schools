package GUI;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimationTest {
    int x = 10;
    int y = 10;

    public static void main(String[] args) {
        SimpleAnimationTest gui = new SimpleAnimationTest();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);

        for (int i = 0; i < 430; i++) {
            x++;
            y++;

            drawPanel.repaint();

            try {
                Thread.sleep(64);
            } catch (Exception ex) {

            }
        }
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getWidth());

            g.setColor(Color.green);
            g.fillOval(x, y, 40, 40);
        }
    }
}
