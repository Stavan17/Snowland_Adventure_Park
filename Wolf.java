import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wolf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wolf extends Enemy
{
    private int direction = 2;
    private void move() 
    { 
        // checking edges  
        if ((direction < 0 && getX() == 0) || (direction > 0 && getX() == getWorld().getWidth()-1)) direction = -direction;  
        // movement 
        move(direction);            
    }
    
    public void OverWolf()
    {
        Actor Wolf = this.getOneIntersectingObject(Pinguin.class);
        if( Wolf != null)
        {
           World myWorld = getWorld();
           GameOver gameover = new GameOver();
           myWorld.addObject(gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
           myWorld.removeObject(Wolf);
           Retry3 retry3 = new Retry3();
           myWorld.addObject(retry3,727,541);
        } 
    }
    
    public Wolf()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /10, image.getHeight() /10);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Wolf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        OverWolf();// Add your action code here.
    }    
}
