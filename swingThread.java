import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
class Main extends JFrame implements ActionListener{
    JButton button;
    JTextField text, ans;
    public Main(){
        button = new JButton("Print");
        button.addActionListener(this);
        text = new JTextField();
        text.setPreferredSize(new Dimension(100, 20));
        ans = new JTextField();
        ans.setEditable(false);
        ans.setPreferredSize(new Dimension(100, 50));
        this.add(button);
        this.add(text);
        this.add(ans);
        this.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            String s = text.getText();
            int n = Integer.parseInt(s);
            ans.setText("Input: " + n); 
            T1 t1 = new T1(n);
            T2 t2 = new T2(n);
            t1.start();
            try{
                t1.join();
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
            t2.start();
        }
    }
}
class printThread{
    void Print(int n, String str){
        for(int i = 0; i < n; i++){
            System.out.println(str);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
class T1 extends Thread{
    int n;
    T1(int n){
        this.n = n;
    }
    public void run(){
        printThread p = new printThread();
        p.Print(n, "Thrikkakara");
    }
}
class T2 extends Thread{
    int n;
    T2(int n){
        this.n = n;
    }
    public void run(){
        printThread p = new printThread();
        p.Print(n, "Kochi");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
public class swingThread{
    public static void main(String args[]){
        new Main();
    }
}