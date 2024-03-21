import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nyaa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nyaa extends Ending
{
    private int direction = 2;
    private void move() 
    { 
        // checking edges  
        if ((direction < 0 && getX() == 0) || (direction > 0 && getX() == getWorld().getWidth()-1)) direction = -direction;  
        // movement 
        move(direction);            
    }
    
    public void OverNyaa()
    {
        Actor Nyaa = this.getOneIntersectingObject(Pinguin.class);
        if( Nyaa != null)
        {
          this.getWorld().removeObject(Nyaa);
          World Fall = getWorld();
          Complete complete = new Complete();
          Back back = new Back();
          Next5 next5 = new Next5();
          Fall.addObject(next5,727,541);
          Fall.addObject(complete,Fall.getWidth()/2, Fall.getHeight()/2);
          Fall.addObject(back,74,48);
        }
    }
    
    public void EndGame()
    {
       if (getWorld().getObjects(Fish.class).isEmpty())
       {
           OverNyaa();
       } 
    }
    
    public Nyaa()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /3, image.getHeight() /3);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Nyaa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        EndGame();// Add your action code here.
    }    
}
