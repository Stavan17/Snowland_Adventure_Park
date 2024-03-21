import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeTopper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeTopper extends Enemy
{
    public int speed =1;
    private void move() 
    { 
        if (getObjectsInRange(20, Nyaa.class).isEmpty())
        {
           if (getX() == 626) speed = -1;
           if (getX() == 500) speed = 1;
           move(speed);
        }             
    }
    
    public void OverSnakeTopper()
    {
        Actor SnakeTopper = this.getOneIntersectingObject(Pinguin.class);
        if( SnakeTopper != null)
        {
           World myWorld = getWorld();
           GameOver gameover = new GameOver();
           myWorld.addObject(gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
           myWorld.removeObject(SnakeTopper);
           Retry4 retry4 = new Retry4();
           myWorld.addObject(retry4,727,541);
        } 
    }
    
    public SnakeTopper()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /4, image.getHeight() /4);
        setImage(image);
    }
    
    /**
     * Act - do whatever the SnakeTopper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        OverSnakeTopper();// Add your action code here.
    }    
}
