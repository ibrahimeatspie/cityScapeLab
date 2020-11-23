import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.Arc2D;
import java.awt.GradientPaint;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private Cloud testCloud;
    private Buildings testBuilding;
    private Buildings testBuilding2;
    private Buildings testBuilding3;
    private Buildings testBuilding4;
    private Buildings testBuilding5;
    private Moon outerMoon;
    int xVal = 0;
    Color sunsetOrange = new Color(253, 94, 83);
    Color shandy = new Color(255, 227, 115);
    Color darkBlue = new Color(0,0,153);
    Color lightBlue = new Color(51,255,255);
    GradientPaint sunGradient = new GradientPaint(100,0,sunsetOrange,100,300,shandy);
    GradientPaint oceanGradient = new GradientPaint(500, 500,lightBlue,500,1000,darkBlue);
    
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent(){
     testCloud = new Cloud(600,100,400,100);
     outerMoon = new Moon(sunGradient,oceanGradient,50);
     testBuilding = new Buildings(200,220,400);
     testBuilding2 = new Buildings(425,100,300);
     testBuilding3 = new Buildings(530,200,450);
     testBuilding4 = new Buildings(760,115,250);
     testBuilding5 = new Buildings(50,135,350);
     
     //centerMoon = new Moon(sandyBrown, 150);
     //innerMoon = new Moon(shandy, 175);

     
     
     
        
    }
    
    
    
    
    
    
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing operations
     *
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        outerMoon.draw(g2);
        testBuilding.draw(g2);
        testBuilding2.draw(g2);
        testBuilding3.draw(g2);
        testBuilding4.draw(g2);
        testBuilding5.draw(g2);
        testCloud.draw(g2);
        //centerMoon.draw(g2);
        //innerMoon.draw(g2);
        
        // invoke the draw method on each object in your Cityscape
        // ...
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        if (xVal <=0){
            xVal=600;
        }
        testCloud.changeX(xVal=xVal-25);
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }


}
