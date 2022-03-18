import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanWorld extends World
{
    private static final int WIDTH_WALL = 28;
    private static final int HEIGHT_WALL = 28;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PacmanWorld()
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
        Wall wall = new Wall();

        for(int x = 50; x <= 550; x+= WIDTH_WALL)
        {
            wall = new Wall();
            addObject(wall, x, 30);

            wall = new Wall();
            addObject(wall, x, 350);
        }

        for(int y = 58; y <=200 ; y+= HEIGHT_WALL)
        {
            wall = new Wall();
            addObject(wall, 50, y);

            wall = new Wall();
            addObject(wall, 526, y);
        }

        SmallBall smallBall = new SmallBall();
        addObject(smallBall,265,165);
        Cherry cherry = new Cherry();
        addObject(cherry,478,72);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,455,242);
        Banana banana = new Banana();
        addObject(banana,126,255);
        BigBall bigBall = new BigBall();
        addObject(bigBall,263,107);
        smallBall.setLocation(200,160);
        BigBall bigBall2 = new BigBall();
        addObject(bigBall2,340,109);
        BigBall bigBall3 = new BigBall();
        addObject(bigBall3,379,272);
        BigBall bigBall4 = new BigBall();
        addObject(bigBall4,274,215);
        BigBall bigBall5 = new BigBall();
        addObject(bigBall5,91,200);
        bigBall5.setLocation(120,214);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,520,277);
        Strawberry strawberry2 = new Strawberry();
        addObject(strawberry2,265,275);
        banana.setLocation(55,263);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,145,230);
        smallBall.setLocation(185,154);
        bigBall5.setLocation(105,248);
        smallBall2.setLocation(139,239);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,474,136);
        SmallBall smallBall4 = new SmallBall();
        addObject(smallBall4,340,170);
        SmallBall smallBall5 = new SmallBall();
        addObject(smallBall5,223,206);
        SmallBall smallBall6 = new SmallBall();
        addObject(smallBall6,410,187);
        
        Ballon ballon = new Ballon();
        addObject(ballon,191,280);
        
        PacmanHud hud = new PacmanHud();
        addObject(hud, 0, 0);
        
        Pacman pacman = new Pacman(hud);
        addObject(pacman, 110, 90);
    }
}
