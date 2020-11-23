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
 * Creates a sun-styled moon
 * 
 * @Ibrahim Shah
 * @11/22/2020
 */
/**
 * A building with auto-generated flashing windows of a user inputted height, width, and x coordinate
 * 
 */
public class Buildings
{  
   Thread t;
   
   private int h;
   private int w;
   private int x;
   private int y;
   /**Constructs a building at an X coordinate, with a width of toBeWidth and a height of toBeHeight*/

   public Buildings(int toBeX, int toBeWidth,int toBeHeight){
       x = toBeX;
       w = toBeWidth;
       h = toBeHeight;
       y = 500-h;
       
       
   }
   /**
    * @param g2 Graphics module to draw to
    * 
    * 
    */  
   public void draw(Graphics2D g2){
      Rectangle2D.Double building = new Rectangle2D.Double(x,y,w,h);
      
      Color buildingColor = new Color(12,36,51);
      
      
      
      g2.setColor(buildingColor);
      g2.draw(building);
      g2.fill(building);
      System.out.println(x);
      System.out.println(y);
      for (int tempY = 25; tempY+y < 500; tempY+=50){
          
          for (int tempX = 25; tempX+x < x+w-25; tempX+=50){
           Random s = new Random();
           int random = s.nextInt((2)+1);
           if (random == 0){
               g2.setColor(Color.YELLOW);
            }else{
                g2.setColor(Color.BLACK);
                
                
            }
              
              
           Rectangle2D.Double window = new Rectangle2D.Double(x+tempX, y+tempY,25,25);
           g2.draw(window);
           g2.fill(window);
              
            
    
                                                 }
      }
      
    
      
         
         
    } 
      
         
         
    
}