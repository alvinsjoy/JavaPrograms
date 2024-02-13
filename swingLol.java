import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Main extends JFrame implements ActionListener{
    int c = 0;
    JButton b1, b2, b3;
    JPanel p1, p2, p3;
    JTextField tf, ans;
    JCheckBox check;
    JRadioButton r1, r2, r3;
    public Main(){
        b1 = new JButton();
        b1.setText("Submit");
        b1.addActionListener(this);
        b2 = new JButton();
        b2.setText("World");
        b2.addActionListener(this);
        b3 = new JButton();
        b3.setText("Cool");
        b3.addActionListener(this);

        r1 = new JRadioButton();
        r1.setText("Radio Button 1");
        r1.addActionListener(this);

        r2 = new JRadioButton();
        r2.setText("Radio Button 2");
        r2.addActionListener(this);

        r3 = new JRadioButton();
        r3.setText("Radio Button 3");
        r3.addActionListener(this);

        check = new JCheckBox();
        check.setText("Click me");
        
        tf = new JTextField();
        tf.setPreferredSize(new Dimension(250, 40));
        ans = new JTextField();
        ans.setEditable(false);
        ans.setPreferredSize(new Dimension(100, 30));

        p1 = new JPanel();
        p1.setBackground(Color.red);
        p1.setLayout(new FlowLayout());
        p1.setPreferredSize(new Dimension(100, 100));

        p2 = new JPanel();
        p2.setBackground(Color.green);
        p2.setLayout(new FlowLayout());
        p2.setPreferredSize(new Dimension(100, 100));
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        this.setTitle("Swing is cool");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setVisible(true);
        p1.add(b1);
        p1.add(b2);
        p2.add(b3);
        this.add(tf);
        this.add(ans);
        this.add(p1);
        this.add(p2);
        this.add(check);
        this.add(r1);
        this.add(r2);
        this.add(r3);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            boolean select = check.isSelected();
            String text = tf.getText();
            ans.setText(text + " Checkbox: " + select);

        }
        else if(e.getSource() == b2){
            System.out.println("World");
            ans.setText("World clicked");
        }
        else if(e.getSource() == b3){
            System.out.println("Cool");
            ans.setText("Cool clicked");
        }
        else if(e.getSource() == r1){
            ans.setText(r1.getText());
        }
        else if(e.getSource() == r2){
            ans.setText(r2.getText());
        }
        else if(e.getSource() == r3){
            ans.setText(r3.getText());
        }
        else
            System.out.println("Error");
    }
}
class swingLol{
    public static void main(String[] args) {
        new Main();
    }
}