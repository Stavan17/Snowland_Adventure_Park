import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Igloo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Igloo extends Snow
{
    public Igloo()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /5, image.getHeight() /5);
        setImage(image);
    }
    /**
     * Act - do whatever the Igloo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
