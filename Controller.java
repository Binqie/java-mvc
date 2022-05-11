import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CopyOnWriteArrayList;

public class Controller implements ActionListener{
    JTextField tf1;
    JTextField tf2;
    JTextArea tf3;
    JRadioButton button1;
    JRadioButton button2;
    JRadioButton button3;
    Controller(JRadioButton newButton1,JRadioButton newButton2,JRadioButton newButton3,JTextField tf1, JTextField tf2, JTextArea tf3){
        this.button1=newButton1;
        this.button2=newButton2;
        this.button3=newButton3;
        this.tf1=tf1;
        this.tf2=tf2;
        this.tf3=tf3;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand()=="Go!"){
            if(button1.isSelected()){
                int xStart=Integer.parseInt(tf1.getText());
                int xEnd=Integer.parseInt(tf2.getText());
                int findMax=Model.FindMax(xStart,xEnd);
                tf3.setText(Integer.toString(findMax));

            }
            else if(button2.isSelected()){
                int xStart=Integer.parseInt(tf1.getText());
                int xEnd=Integer.parseInt(tf2.getText());
                tf3.setText(Model.Root(xStart,xEnd));
            }
            else if(button3.isSelected()){
                int xStart=Integer.parseInt(tf1.getText());
                int xEnd=Integer.parseInt(tf2.getText());
                tf3.setText(Model.Points(xStart, xEnd));
            }
        }
        else if(e.getActionCommand()=="Draw function"){
            int xStart=Integer.parseInt(tf1.getText());
            int xEnd=Integer.parseInt(tf2.getText());
            ViewGraphicsWindow myWindow= new ViewGraphicsWindow(xStart,xEnd);
        }
    }
}
