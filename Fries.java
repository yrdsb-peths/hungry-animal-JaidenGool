import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food that the Elephant cannot eat
 * 
 * @author Jaiden Gool 
 * @version 05-20-24
 */
public class Fries extends Actor
{
    public void act()
    {
        double diffScore = MyWorld.diffScore;

        setLocation(getX(), getY() +  (int) diffScore);
        
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Elephant.class))
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
