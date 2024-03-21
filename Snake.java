import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Enemy
{
    private int direction = 2;
    private void move() 
    { 
        // checking edges  
        if ((direction < 0 && getX() == 0) || (direction > 0 && getX() == getWorld().getWidth()-1)) direction = -direction;  
        // movement 
        move(direction);            
    }
    
    public void OverSnake()
    {
        Actor Snake = this.getOneIntersectingObject(Pinguin.class);
        if( Snake != null)
        {
           World myWorld = getWorld();
           GameOver gameover = new GameOver();
           myWorld.addObject(gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
           myWorld.removeObject(Snake);
           Retry4 retry4 = new Retry4();
           myWorld.addObject(retry4,727,541);
        } 
    }
    
    public Snake()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /4, image.getHeight() /4);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        OverSnake();// Add your action code here.
    }    
}
