import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controller extends Actor
{
    public Controller()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /7, image.getHeight() /7);
        setImage(image);
    }
    
    public void control()
    {
        if(Greenfoot.mouseClicked(this))
        {
           Greenfoot.setWorld(new ControllerTab());
        }
    }
    
    /**
     * Act - do whatever the Controller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        control();
    }    
}
