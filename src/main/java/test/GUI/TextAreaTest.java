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

        JPanel panel = new JPanel();

        JButton button = new JButton("Click me");
        button.addActionListener(this::actionPerformed);

        text = new JTextArea(10, 20);
        text.setLineWrap(true);

        JScrollPane scrollPane = new JScrollPane(text);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panel.add(scrollPane);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setSize(350, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ev) {
        text.append("button clicked \n");
    }
}
