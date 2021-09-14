import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Demon patrols the areas for a cupcake, and if they catch Chuck, the
 * game is over
 * @author: Eddie Garcia 
 * @version: 9/13/21
 */
public class Demon extends Actor
{
    //Changes EDP's size, and makes him turn vertically
    public Demon()
    {
        getImage().scale(80,60);
        turn(90);
    }
       public void act()
    {
        move(5);
        turnAtEdge();
    }
    
    //Turns the Demon at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(180);
        }
    }
}
