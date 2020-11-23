
/**
 * Write a description of class Door here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Door
{
   private boolean isOpened = false;
   private String location = null;
   
   public Door(String name, boolean status){
       //variable name is a local variable
       this.isOpened = status;
       this.location = name;
       
       
       
       
    }
   
   public void open(){
       
       this.isOpened = true;
       
       
       
   }
   public void closed(){
     this.isOpened = false;
     
       
    }
   public String getName(){
       return this.location;
       
       
    }
   public boolean getsStatus(){
       
       return this.isOpened;
       
       
       
       
    }
    public void setName(String newName){
        this.location = newName;
        
        
    }
    
    
   
}
