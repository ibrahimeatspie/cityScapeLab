import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.Arc2D;
import java.awt.GradientPaint;


/**
 * Creates a sun-styled moon
 * 
 * @Ibrahim Shah
 * @11/22/2020
 */
/**
 * A sun-styled moon class that creates a sun-styled moon of a certain gradient,as well as a background of a certain gradient
 * 
 */
public class Moon
{
    /*To implement this class input two GradientPaint objects as well as an integer to size the semi-circle sun-styled moon*/
    private GradientPaint paintToSetForSun;
    private GradientPaint paintToSetForSkyline;
    
    
    
    private int xy;
    
    
    
    
    /**Constructs a Moon with a gradient color for the sun as well as the skyline, the moon being an integer size*/
    public Moon(GradientPaint toBePaintForSun, GradientPaint toBePaintForSkyline, int toBeXY)
    {
        this.paintToSetForSun=toBePaintForSun;
        this.paintToSetForSkyline=toBePaintForSkyline;
        this.xy = toBeXY;
        
        
    }
    
    
    
    
   /**
    * @param g2 Graphics module to draw to
    * 
    * 
    */  
     public void draw(Graphics2D g2){
      //Create background
      Rectangle2D.Double backgroundRect = new Rectangle2D.Double(0,0,1000,1000);
      //Create background colors
      Color sandyBrown = new Color(252, 156, 84);
      Color sunsetOrange = new Color(253, 94, 83);
      Color barrier = new Color(64, 64, 64);
      GradientPaint gp = new GradientPaint(100,0,sunsetOrange,100,300,sandyBrown);
      //Create drawing blueprints
      Arc2D.Double moon = new Arc2D.Double(xy,xy,1000-(2*xy),1000-(2*xy),0,180,Arc2D.CHORD);
      Rectangle2D.Double ocean = new Rectangle2D.Double(0,xy+((1000-2*xy)/2),1000,xy+((1000-2*xy)/2));
      //Create small land barrier
      Rectangle2D.Double landBarrier = new Rectangle2D.Double(0,xy+((1000-2*xy)/2),1000,10);
      
      
        


      
      
      //draw
      g2.setPaint(gp);
      g2.draw(backgroundRect);
      g2.fill(backgroundRect);
      
      g2.setPaint(paintToSetForSkyline);
      g2.draw(ocean);
      g2.fill(ocean);
      
      g2.setPaint(paintToSetForSun);
      g2.draw(moon);
      g2.fill(moon);
      
      g2.setPaint(barrier);
      g2.draw(landBarrier);
      g2.fill(landBarrier);
      
      
         
         
    }
}
