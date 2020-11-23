import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;


/**
   A car shape that can be positioned anywhere on the screen.
*/
public class Target
{
   private int xLeft;
   private int yTop;

   /**
      Constructs a car with a given top left corner.
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
   */
   public Target(int initialX, int initialY)
   {
      this.xLeft = initialX;
      this.yTop = initialY;
   }

   /**
      Draws the car.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      Ellipse2D.Double outerCircle = new Ellipse2D.Double(250,250,500,500);
      Ellipse2D.Double innerCircle1 = new Ellipse2D.Double(375,375,250,250);
      
      g2.setColor(Color.BLACK);
      g2.draw(outerCircle);
      g2.fill(outerCircle);
      g2.setColor(Color.WHITE);
      g2.draw(innerCircle1);
      g2.fill(innerCircle1);
      
      
      
      
      
      
      
   }
}
