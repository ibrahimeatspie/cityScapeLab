import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
   This component draws two car shapes.
*/
public class TargetComponent extends JComponent
{  
   @Override
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;  // cast to Graphics2D object

      Target target1 = new Target(0, 0); // initialize a new Car object
      
      
      
      // draw cars
      target1.draw(g2);
   }
}
