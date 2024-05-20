import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for the hero
 * 
 * @author Jaiden Gool 
 * @version April 2024
 */
public class Apple extends Actor
{
    public boolean gameOverCheck;
    public Apple()
    {
        this.gameOverCheck = gameOverCheck;
    }
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(gameOverCheck == false)
        {
            double diffScore = MyWorld.diffScore;

            setLocation(getX(), getY() +  (int) diffScore);
            
            MyWorld world = (MyWorld) getWorld();
            if(getY() >= world.getHeight())
            {
                world.gameOver();
                world.removeObject(this);
            }
        }
    }
}
