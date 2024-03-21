import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WolfTop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WolfTop extends Enemy
{
    public int speed =1;
    private void move() 
    { 
        if (getObjectsInRange(20, Bird.class).isEmpty())
        {
           if (getX() == 637) speed = -1;
           if (getX() == 500) speed = 1;
           move(speed);
        }             
    }
    
    public void OverWolf()
    {
        Actor WolfTop = this.getOneIntersectingObject(Pinguin.class);
        if( WolfTop != null)
        {
           World myWorld = getWorld();
           GameOver gameover = new GameOver();
           myWorld.addObject(gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
           myWorld.removeObject(WolfTop);
           Retry3 retry3 = new Retry3();
           myWorld.addObject(retry3,727,541);
        } 
    }
    
    public WolfTop()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /10, image.getHeight() /10);
        setImage(image);
    }
    
    /**
     * Act - do whatever the WolfTop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        OverWolf();// Add your action code here.
    }    
}
