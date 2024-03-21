import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winter extends World
{
    GreenfootSound backgroundSummer = new GreenfootSound("Summer.mp3");
    /**
     * Constructor for objects of class Winter.
     * 
     */
    public Winter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        prepare();
    }
    
    public void Start()
    {
       if (Greenfoot.isKeyDown("space")) 
       {
           Greenfoot.setWorld(new MyWorld());
           backgroundSummer.play();
           Points.counterpinguin=0;
       }
    }
    
    public void act()
    {
        Start();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PSpace pspace = new PSpace();
        addObject(pspace,460,555);
        pspace.setLocation(450,568);
        Controller controller = new Controller();
        addObject(controller,332,330);
        controller.setLocation(55,553);
        controller.setLocation(51,562);
        controller.setLocation(53,552);
        controller.setLocation(53,555);
        Next2 next2 = new Next2();
        addObject(next2,770,479);
        next2.setLocation(627,533);
        next2.setLocation(727,541);
        removeObject(next2);

        Adventure adventure = new Adventure();
        addObject(adventure,570,313);
        adventure.setLocation(439,156);
    }
}
