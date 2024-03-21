import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Retry1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry1 extends NextLevel
{
    public Retry1()
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
           MyWorld myworld = new MyWorld();
           Greenfoot.setWorld(myworld);
           Points.counterpinguin=0;
        }
    }
    /**
     * Act - do whatever the Retry1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Start();// Add your action code here.
    }    
}
