import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloon extends Ending
{
    
    public Balloon()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /7, image.getHeight() /7);
        setImage(image);
    }
    
    public void OverBalloon()
    {
        Actor Balloon = this.getOneIntersectingObject(Pinguin.class);
        if( Balloon != null)
        {
          this.getWorld().removeObject(Balloon);
          World Spring = getWorld();
          Complete complete = new Complete();
          Next3 next3 = new Next3();
          Back back = new Back();
          Spring.addObject(complete,Spring.getWidth()/2, Spring.getHeight()/2);
          Spring.addObject(next3,727,541);
          Spring.addObject(back,74,48);
        }
    }
    private int speed = 1;
    public void Move()
    {
        if (getObjectsInRange(200, Land2.class).isEmpty())
        {
           if (getX() == 600) speed = 1;
           if (getX() == 865) speed = -1;
           move(speed);
        }
    }
    
    public void EndGame()
    {
       if (getWorld().getObjects(Fish.class).isEmpty())
       {
           OverBalloon();
       } 
    }
    
    /**
     * Act - do whatever the Balloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        EndGame();// Add your action code here.
        Move();
    }    
}
