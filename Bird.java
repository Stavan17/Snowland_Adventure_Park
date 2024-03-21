import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Ending
{
    public Bird()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /5, image.getHeight() /5);
        setImage(image);
    }
    public void OverBird()
    {
        Actor Bird = this.getOneIntersectingObject(Pinguin.class);
        if( Bird != null)
        {
          this.getWorld().removeObject(Bird);
          World Summer = getWorld();
          Complete complete = new Complete();
          Next4 next4 = new Next4();
          Back back = new Back();
          Summer.addObject(complete,Summer.getWidth()/2, Summer.getHeight()/2);
          Summer.addObject(next4,727,541);
          Summer.addObject(back,74,48);
        }
    }
    public void EndGame()
    {
       if (getWorld().getObjects(Fish.class).isEmpty())
       {
           OverBird();
       } 
    }
    
    private int speed = 1;
    public void Move()
    {
        if (getObjectsInRange(200, Land3.class).isEmpty())
        {
           if (getX() == 79) speed = 1;
           if (getX() == 255) speed = -1;
           move(speed);
        }
    }
    
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        EndGame();
        Move();// Add your action code here.
    }    
}
