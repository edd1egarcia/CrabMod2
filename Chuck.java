import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Chuck is the main protagonist who is stuck in the underworld!!! 
 * 
 * @author: Eddie Garcia
 * @version: 9/9/21
 */
public class Chuck extends Actor
{
    //Changes Chuck's size
    public Chuck()
    {
        getImage().scale(65,45);
    }
    private int actNumber = 0;
    
    //This method repeats the following actions
    public void act()
    {
        if(actNumber == 0)
        {
            Greenfoot.playSound("backgroundsound.wav");
        }
        checkKeyPress();
        onCollision();
        actNumber++;
    }
    
    //Checks for user key presses so user can turn crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("w"))
        {
           setLocation(getX(),getY()-2); 
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+2,getY());
        }
    }
    
    //Checks for collisions with other objects
    private void onCollision()
    {
        if(isTouching(Cupcake.class))
        {
            Greenfoot.setWorld(new winScreen());
            Greenfoot.playSound("win.wav");
        }
        if(isTouching(Demon.class))
        {
            Greenfoot.setWorld(new Death());
            Greenfoot.playSound("deathSound.wav");
        }
    }
}
