package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextAreaTest {
    JTextArea text;

    public static void main(String[] args) {
        TextAreaTest gui = new TextAreaTest();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(606, 600);
        frame.setVisible(true);
    }
}
