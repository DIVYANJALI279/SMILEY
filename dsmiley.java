import java.applet.*;  
import java.awt.*;
import java.awt.event.*; 

public class c extends Applet implements ActionListener {
    int a=0,b=0,c=0,f=0,x=0,y=0;
    Button u = new Button("Up");
    Button d = new Button("Down");
    Button l = new Button("Right");
    Button r = new Button("Left");
    
    public void init() {
        add(u);
        u.addActionListener(this);
        add(d);
        d.addActionListener(this);
        add(l);
        l.addActionListener(this);
        add(r);
        r.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == u) {
           y=y-1;
           a++;
        }
        else if (e.getSource() == d) {
            y=y+1;
            b++;
        }
        else if (e.getSource() == l) {
            x=x+1;
            c++;
        }
        else if (e.getSource() == r) {
            x=x-1;
            f++;
        }
        repaint();
    }

    public void paint(Graphics g){
        if(x>=0||y>=0){
            setBackground(Color.YELLOW);
            g.setColor(Color.MAGENTA);
            g.fillOval(500+x, 500+y, 100, 100);
            g.setColor(Color.BLACK);
            g.fillOval(520+x, 520+y, 20, 20);
            g.fillOval(560+x, 520+y, 20, 20);
            g.setColor(Color.BLACK);
            g.drawArc(525+x, 560+y, 50, 20, 180, 180);
        }
    }
}  
/* 
<applet code="c.class" width="1000" height="1000"> 
</applet> 
*/