import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.Arc2D;
import java.awt.GradientPaint;
import java.util.Random;


/**
 * Creates an animated cloud
 * 
 * @Ibrahim Shah
 * @11/22/2020
 */
/**
 * A cloud of specificed X coordinate and Y coordinated, specified width and height
 * 
 */
public class Cloud
{   
    
    private int x;
    private int y;
    private int w;
    private int h;
       /**Constructs a cloud at x coordinated toBeX, y coordinate toBeY, width toBeW, and height toBeH*/

    public Cloud(int toBeX, int toBeY, int toBeW, int toBeH){
        
        x = toBeX;
        y = toBeY;
        w = toBeW;
        h = toBeH;
        
    }
   
   /**
    * @param g2 Graphics module to draw to
    * 
    * 
    */  
   public void draw(Graphics2D g2){
       
       
       Ellipse2D.Double cloud = new Ellipse2D.Double(x,y,w,h);
       g2.setColor(Color.WHITE);
       g2.draw(cloud);
       g2.fill(cloud);
       
       
      
              
            
    
   }
   public void changeX(int valueToChange){
       
       x = valueToChange;
       
       
       
       
    }
      

}
      
    
      
         
         
  