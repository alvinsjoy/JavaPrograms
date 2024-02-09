import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class swingToken extends JFrame implements ActionListener{
    JTextField text;
    JButton b;
    public swingToken(){
        setTitle("String tokenizer");
        text = new JTextField("");
        text.setBounds(20, 30, 30, 150);
        b = new JButton("Write");
        setLayout(new BorderLayout());
        add(text, BorderLayout.NORTH);
        add(b, BorderLayout.SOUTH);
        b.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Action performed event triggered");
        String s = text.getText();
        System.out.println("Text: " +s);
        StringTokenizer str = new StringTokenizer(s," ");
        try{
            File f = new File("files/stringToken.txt");
            f.createNewFile();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        try{
            FileWriter fr = new FileWriter("files/stringToken.txt");
            while(str.hasMoreTokens()){
                fr.write(str.nextToken() + "\n");
            }
            text.setText("Files Written");
            fr.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void main(String args[]){
        new swingToken();
    }
}
