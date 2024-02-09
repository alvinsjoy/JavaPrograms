import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class TestSwing extends JFrame implements ActionListener{
    JTextField text;
    JLabel l;
    JButton b, b2, clear;
    public TestSwing() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        l = new JLabel("Hello");
        add(l);
        text = new JTextField();
        text.setText("Click a button");
        add(text);
        setTitle("Hello World");
        b = new JButton("Hello");
        b2 = new JButton("Click");
        clear = new JButton("Clear");
        add(b);
        add(b2);
        add(clear);
        b.addActionListener(this);
        b2.addActionListener(this);
        clear.addActionListener(this);
        setSize(420, 420);
        setVisible(true);
    }
    public static void main(String args[]){
        new TestSwing();
    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        switch(s){
            case "Hello":
                text.setText("Hello pressed");
                break;
            case "Click":
                text.setText("Click pressed");
                break;
            case "Clear":
                text.setText("");
                break;
            default:
                text.setText("Press a button");
                break;
        }
    }
}