import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
class Frame extends JFrame implements ActionListener{
    JRadioButton r1, r2, r3;
    JTextField text;
    ButtonGroup bg;
    public Frame(){
        r1 = new JRadioButton("button 1");
        r2 = new JRadioButton("button 2");
        r3 = new JRadioButton("button 3");
        bg = new ButtonGroup();

        text = new JTextField();
        text.setText("0");
        text.setEditable(false);
        text.setPreferredSize(new Dimension(300, 20));
        this.add(text);

        bg.add(r1);
        bg.add(r2);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        this.add(r1);
        this.add(r2);
        this.add(r3);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == r1 && e.getSource() == r2){
            text.setText("3");
        }
    }
}
public class radioButton {
    public static void main(String args[]){
        new Frame();
    }
}
