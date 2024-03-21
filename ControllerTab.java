import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControllerTab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControllerTab extends World
{
    GreenfootSound backgroundMusics = new GreenfootSound("Winter.mp3");
    /**
     * Constructor for objects of class ControllerTab.
     * 
     */
    public ControllerTab()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BackHome backhome = new BackHome();
        addObject(backhome,671,389);
        backhome.setLocation(838,548);
        backhome.setLocation(831,63);
    }
}
