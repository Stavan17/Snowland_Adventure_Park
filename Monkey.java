import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monkey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monkey extends Enemy
{
    private int direction = 2;
    private void move() 
    { 
        // checking edges  
        if ((direction < 0 && getX() == 0) || (direction > 0 && getX() == getWorld().getWidth()-1)) direction = -direction;  
        // movement 
        move(direction);            
    }
    
    public void OverMonkey()
    {
        Actor Monkey = this.getOneIntersectingObject(Pinguin.class);
        if( Monkey != null)
        {
           World myWorld = getWorld();
           GameOver gameover = new GameOver();
           myWorld.addObject(gameover,myWorld.getWidth()/2, myWorld.getHeight()/2);
           myWorld.removeObject(Monkey);
           Retry2 retry2 = new Retry2();
           myWorld.addObject(retry2,727,541);
        } 
    }
    
    public Monkey()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /10, image.getHeight() /10);
        setImage(image);
    }
    /**
     * Act - do whatever the Monkey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        OverMonkey();// Add your action code here.
    }    
}
