import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class ViewWindow extends JFrame{
    ViewWindow(){
        super("Arasinav");
        this.setSize(700,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        JLabel label1 = new JLabel("x start:");
        label1.setBounds(30, 20, 100, 30);
        this.add(label1);

        JTextField tf1 = new JTextField();
        tf1.setBounds(90,20, 150,30);
        this.add(tf1);

        JLabel label2 = new JLabel("x end:");
        label2.setBounds(30, 50, 100, 30);
        this.add(label2);

        JTextField tf2 = new JTextField();
        tf2.setBounds(90,50, 150,30);
        this.add(tf2);

        JTextArea tf3 = new JTextArea("Text Area");
        tf3.setBounds(90,250, 200,200);
        this.add(tf3);

        JRadioButton rButton1=new JRadioButton("Find max");
        rButton1.setBounds(300,10,100,30);
        this.add(rButton1);

        JRadioButton rButton2=new JRadioButton("Find root");
        rButton2.setBounds(300,40,100,30);
        this.add(rButton2);

        JRadioButton rButton3=new JRadioButton("Print points");
        rButton3.setBounds(300,70,100,30);
        this.add(rButton3);

        JButton button1 = new JButton("Go!");
        button1.setBounds(110, 150, 160, 30);
        button1.addActionListener(new Controller(rButton1,rButton2,rButton3,tf1,tf2,tf3));
        this.add(button1);

        JButton button2 = new JButton("Draw function");
        button2.setBounds(110, 200, 160, 30);
        button2.addActionListener(new Controller(rButton1,rButton2,rButton3,tf1,tf2,tf3));
        this.add(button2);

        JLabel label3 = new JLabel("Result:");
        label3.setBounds(30, 250, 100, 30);
        this.add(label3);


        setVisible(true);
    }
}
