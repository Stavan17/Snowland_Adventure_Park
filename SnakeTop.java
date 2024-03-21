import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeTop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeTop extends Enemy
{
   public int speed =1;
    private void move() 
    { 
        if (getObjectsInRange(20, Nyaa.class).isEmpty())
        {
           if (getX() == 882) speed = -1;
           if (getX() == 735) speed = 1;
           move(speed);
        }             
    }
    
    public void OverSnakeTop()
    {
        Actor SnakeTop = this.getOneIntersectingObject(Pinguin.class);
        if( SnakeTop != null)
        {
           World myWorld = getWorld();
           GameOver gameover = new GameOver();
           myWorld.addObject(gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
           myWorld.removeObject(SnakeTop);
           Retry4 retry4 = new Retry4();
           myWorld.addObject(retry4,727,541);
        } 
    }
    
    public SnakeTop()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /4, image.getHeight() /4);
        setImage(image);
    }
    
    /**
     * Act - do whatever the SnakeTop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        OverSnakeTop();// Add your action code here.
    }    
}
