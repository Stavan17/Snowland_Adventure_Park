import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Next4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next4 extends NextLevel
{
    public Next4()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /2, image.getHeight() /2);
        setImage(image);
    }
    
    public void Start()
    {
       if(Greenfoot.isKeyDown("ENTER"))
        {
           this.getWorld().removeObject(this);
           Fall fall = new Fall();
           Greenfoot.setWorld(fall);
        }
       if(Greenfoot.isKeyDown("backspace"))
        {
           Winter winter = new Winter();
           Greenfoot.setWorld(winter);
        }
    }
    /**
     * Act - do whatever the Next3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Start();// Add your action code here.
    }     
}
