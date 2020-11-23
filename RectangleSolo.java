import java.util.Scanner;



public class RectangleSolo
{
    private double height;
    private double width;
    
    public RectangleSolo(double w, double h){
         this.width=w;
         this.height=h;
        
    }
    public double getArea(){
        return width*height;
        
        
    }
    public double getPerimeter(){
     return (2*width)+(2*height);
     
    }
    public double getDiagonalLength(){
        return Math.sqrt((height*height)+(width*width));
        
        
        
        
    }
    public String toString(){
       String returnedString = new String("Height: "+height+", "+"width: "+
       width+", "+"perimiter: "+this.getPerimeter()+", "+"area: "+this.getArea()+", "+"diagonal length: "+this.getDiagonalLength());
       
       return returnedString;
       
       
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter a width: ");
        float toBeWidth = scanner.nextInt();
        System.out.println("Please enter a height: ");
        float toBeHeight = scanner.nextInt();
        RectangleSolo userInputtedRectangle = new RectangleSolo(toBeWidth, toBeHeight);
        System.out.println(userInputtedRectangle.toString());
        
        
        
        
        
        
    }
}
