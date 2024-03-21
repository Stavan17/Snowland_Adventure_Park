import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Retry3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry3 extends NextLevel
{
    public Retry3()
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
           Summer summer = new Summer();
           Greenfoot.setWorld(summer);
           Points.counterpinguin=0;
        }
    }
    /**
     * Act - do whatever the Retry3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Start();// Add your action code here.
    }    
}
