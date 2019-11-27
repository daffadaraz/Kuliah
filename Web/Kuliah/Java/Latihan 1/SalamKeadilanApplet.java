import java.applet.*;
import java.awt.*;

public class SalamKeadilanApplet extends Applet{
    public void paint(Graphics g){
        Font font = new Font("Courier", Font.BOLD , 20);
        g.setFont(font);
        g.drawString ("Hello World", 25, 50);
    }
    public static void main(String[] args){
        
    }
}