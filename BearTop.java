import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BearTop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BearTop extends Enemy
{
    public int speed =1;
    
    private void patrolArea()
    {
        if (getObjectsInRange(200, Igloo.class).isEmpty())
        {
           if (getX() == 122) speed = 1;
           if (getX() == 289) speed = -1;
           move(speed);
        }
    }
    
    public void OverBearTop()
    {
        Actor BearTop = this.getOneIntersectingObject(Pinguin.class);
        if( BearTop != null)
        {
           World myWorld = getWorld();
           GameOver gameover = new GameOver();
           myWorld.addObject(gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
           myWorld.removeObject(BearTop);
           Retry1 retry1 = new Retry1();
           myWorld.addObject(retry1,727,541);
        } 
    }
    
    public BearTop()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /15, image.getHeight() /15);
        setImage(image);
    }
    
    /**
     * Act - do whatever the BearTop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        patrolArea();
        OverBearTop();
    }    
}
