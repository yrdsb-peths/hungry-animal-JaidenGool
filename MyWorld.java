import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World the hero lives in
 * 
 * @author Jaiden Gool
 * @version April 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    // Difficulty score (level)
    public static double diffScore = 1;
    public static boolean gameOverCheck = false;
    Label scoreLabel;
    Label diffLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 250);
        
        //Create a label
        scoreLabel = new Label("Score: 0", 45);
        addObject(scoreLabel, 90, 30);
        
        //Difficulty label
        diffLabel = new Label("Level: " + (int)diffScore, 45);
        addObject(diffLabel, 510, 30);
        
        createApple();
        
        diffScore = 1;
        gameOverCheck = false;
    }
    
    //Game over - called when game ends and draw game over
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game over", 100);
        addObject(gameOverLabel, 300, 200);
        gameOverCheck = true;
    }
    
    //Increase score
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue("Score: " + score);
    }
    
    public void increaseDifficulty()
    {
        diffScore += 0.1;
        diffLabel.setValue("Level: " + (int)diffScore);
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 25;
        addObject(apple, x, 25);
    }
    
    public void createFries()
    {
        if(score % 4 == 0)
        {
            Fries fries = new Fries();
            int x = Greenfoot.getRandomNumber(600);
            int y = 25;
            addObject(fries, x, y);
        }
    }
    
}
