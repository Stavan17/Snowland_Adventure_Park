import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MonkeyTop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonkeyTop extends Enemy
{
    public int speed =1;
    private void move() 
    { 
        if (getObjectsInRange(20, Balloon.class).isEmpty())
        {
           if (getX() == 452) speed = 1;
           if (getX() == 600) speed = -1;
           move(speed);
        }           
    }
    
    public void OverMonkey()
    {
        Actor MonkeyTop = this.getOneIntersectingObject(Pinguin.class);
        if( MonkeyTop != null)
        {
           World myWorld = getWorld();
           GameOver gameover = new GameOver();
           myWorld.addObject(gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
           myWorld.removeObject(MonkeyTop);
           Retry2 retry2 = new Retry2();
           myWorld.addObject(retry2,727,541);
        } 
    }
    
    public MonkeyTop()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /10, image.getHeight() /10);
        setImage(image);
    }
    /**
     * Act - do whatever the MonkeyTop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        OverMonkey();// Add your action code here.
    }    
}
