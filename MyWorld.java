import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Chuck is stuck here and has to find the cupcake!!
 * 
 * @author: Eddie Garcia 
 * @version: 9/14/21
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Chuck chuck = new Chuck();
        addObject(chuck,198,192);
        chuck.setLocation(205,228);
        removeObject(chuck);
        addObject(chuck,12,216);
        removeObject(chuck);
        Chuck Chuck = new Chuck();
        addObject(chuck,26,207);
        Demon demon = new Demon();
        addObject(demon,157,208);
        Demon demon2 = new Demon();
        addObject(demon2,312,99);
        Demon demon3 = new Demon();
        addObject(demon3,453,340);
        Cupcake cupcake = new Cupcake();
        addObject(cupcake,560,205);
    }
}
