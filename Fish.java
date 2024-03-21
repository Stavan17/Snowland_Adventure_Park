import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    private final int gravity = 1;
    private int speed;
    
    public void fall()
    {
        setLocation(getX(), getY()+ speed);
        if(isTouchLand())
        {
            speed = 0;
            while (isTouchLand())
            {
                setLocation(getX(), getY()-1);
            }
            setLocation(getX(), getY()+1);
        }
        else speed += gravity;
    }
    
    public boolean isTouchLand()
    {
        boolean TouchLand= false;
        
        if (getY() > getWorld().getHeight()-20)TouchLand=true;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if (getOneObjectAtOffset(imageWidth/4, imageHeight/3,SnowCap1.class)!=null ||
            getOneObjectAtOffset(imageWidth/-4, imageHeight/3,SnowCap1.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/4, imageHeight/3,SnowCap2.class)!=null ||
            getOneObjectAtOffset(imageWidth/-4, imageHeight/3,SnowCap2.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/4, imageHeight/3,SnowCap3.class)!=null ||
            getOneObjectAtOffset(imageWidth/-4, imageHeight/3,SnowCap3.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/1, imageHeight/1,Land1.class)!=null ||
            getOneObjectAtOffset(imageWidth/-1, imageHeight/1,Land1.class) !=null)
            TouchLand=true;
            return TouchLand;
    }
    
    public Fish()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /11, image.getHeight() /11);
        setImage(image);
        
    }
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
}
