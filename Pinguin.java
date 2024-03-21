import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pinguin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pinguin extends Actor
{
    private final int gravity = 1;
    private int speed;
    int score=0;
    GreenfootSound eating = new GreenfootSound("Eat.mp3");
    public void JUMP ()
    {
        speed = 0;
    }
        
    public void act() 
    {
       fall();
       walk(); 
       checkCollision();
       Point();
    }
    public void Point()
    {
        getWorld().showText("Point: "+Points.counterpinguin,826,48);
    }
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
    
    public void jump()
    {
        speed = -10;
    }
    
    public void walk()
    {
        int y= getY();
        int x= getX();
        if(Greenfoot.isKeyDown("RIGHT")) 
         {
             x+=3;
         }
        if(Greenfoot.isKeyDown("LEFT")) 
         {
             x-=3;
         }
        if(Greenfoot.isKeyDown("UP") && isTouchLand()) jump();
        setLocation(x, y);
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
        if (getOneObjectAtOffset(imageWidth/1, imageHeight/2,Land2.class)!=null ||
            getOneObjectAtOffset(imageWidth/-1, imageHeight/2,Land2.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/1, imageHeight/2,Land3.class)!=null ||
            getOneObjectAtOffset(imageWidth/-1, imageHeight/2,Land3.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/1, imageHeight/2,Land4.class)!=null ||
            getOneObjectAtOffset(imageWidth/-1, imageHeight/2,Land4.class) !=null)
            TouchLand=true;
            
        if (getOneObjectAtOffset(imageWidth/5, imageHeight/5,Bush1.class)!=null ||
            getOneObjectAtOffset(imageWidth/-5, imageHeight/5,Bush1.class) !=null)
            TouchLand=true;
        
        if (getOneObjectAtOffset(imageWidth/9, imageHeight/9,Bushh1.class)!=null ||
            getOneObjectAtOffset(imageWidth/-9, imageHeight/9,Bushh1.class) !=null)
            TouchLand=true;
        
        if (getOneObjectAtOffset(imageWidth/9, imageHeight/9,Bushhh2.class)!=null ||
            getOneObjectAtOffset(imageWidth/-9, imageHeight/9,Bushhh2.class) !=null)
            TouchLand=true;
            return TouchLand;
    }
    
    private void checkCollision()
    {
         if (isTouching(Fish.class)) 
        {
            removeTouching(Fish.class);
            Points.counterpinguin+=10;
            eating.play();
            //MyWorld myworld = (MyWorld)getWorld();
            //myworld.addScore(20);
        }
    }
}
