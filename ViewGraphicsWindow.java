import javax.swing.*;
public class ViewGraphicsWindow extends JFrame{
    ViewGraphicsWindow(int min, int max){
        super("Graphics window");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,750);
        this.setLayout(null);
        this.setVisible(true);

        JLabel label=new JLabel("f(x)=x*x*x+3");
        label.setBounds(10, 10, 100, 30);
        this.add(label);

        ViewPanel myPanel=new ViewPanel(min, max);
        myPanel.setBounds(10,50,600,600);
        myPanel.setLayout(null);
        this.add(myPanel);

    }
}
