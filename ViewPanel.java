import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class ViewPanel extends JPanel{
    int min,max;
    ViewPanel(int min, int max){
        super();
        this.setBounds(0,0,600,600);

        this.min=min;
        this.max=max;
        this.setSize(600,600);
    }
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        drawPlot(g2);
        drawFunction(g2);
    }
    private void drawPlot(Graphics2D g2){
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(4f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));
        g2.drawLine(0,0,0,600);
        g2.drawLine(0,600,600,600);
        g2.drawLine(600,600,600,0);
        g2.drawLine(600,0,0,0);

        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(2f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND));

        g2.drawLine(0,300,600,300);
        g2.drawLine(300,0,300,600);

        int i=0;
        int j=-50;
        int width=50;
        while(i<=600 && j<=50){
            g2.setColor(Color.gray);
            g2.setStroke(new BasicStroke(1f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND));

            g2.drawLine(0,i+width,600,i+width);
            g2.drawString(""+j*(-1),300+10,i+width);

            g2.drawLine(i+width,0,i+width,600);
            g2.drawString(""+j,i+width,300+10);

            j=j+10;
            i=i+50;
        }
    }
    private void drawFunction(Graphics2D g2){
        g2.setColor(Color.red);
        Path2D p = new Path2D.Double();
        p.moveTo(0, 600);
        p.quadTo(150, 150, 300, 300);
        p.moveTo(300, 300);
        p.quadTo(450, 450, 600, 0);

        g2.draw(p);
    }
}
