import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(900, 600, 1);
        score = 0;
        prepare();
    }   

    private void showScore()
    {
        showText("Score: " + score, 80, 25);
    }
    
    public void addScore(int points)
    {
        score = score + 20; 
        showScore();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pinguin pinguin = new Pinguin(); /** Right **/
        addObject(pinguin,43,220);
        pinguin.setLocation(56,482);

        Land1 land1 = new Land1(); /** winterland **/
        addObject(land1,521,564);
        land1.setLocation(510,557);
        SnowCap3 snowcap3 = new SnowCap3();
        addObject(snowcap3,725,348);
        snowcap3.setLocation(790,358);
        Pole pole = new Pole();
        addObject(pole,594,386);
        removeObject(pole);
        Pole pole2 = new Pole();
        addObject(pole2,735,263);
        pole2.setLocation(738,306);
        SnowCap1 snowcap1 = new SnowCap1();
        addObject(snowcap1,248,417);
        snowcap1.setLocation(187,449);
        SnowCap2 snowcap2 = new SnowCap2();
        addObject(snowcap2,364,364);
        removeObject(snowcap2);
        SnowCap2 snowcap22 = new SnowCap2();
        addObject(snowcap22,311,407);
        snowcap22.setLocation(370,381);
        SnowCap3 snowcap32 = new SnowCap3();
        addObject(snowcap32,306,225);
        snowcap32.setLocation(198,305);
        snowcap32.setLocation(214,313);
        snowcap32.setLocation(198,312);
        SnowCap1 snowcap12 = new SnowCap1();
        addObject(snowcap12,414,245);
        snowcap12.setLocation(442,252);
        snowcap22.setLocation(378,385);
        SnowCap3 snowcap33 = new SnowCap3();
        addObject(snowcap33,623,185);
        snowcap33.setLocation(666,200);
        snowcap33.setLocation(667,200);
        snowcap33.setLocation(679,200);
        SnowCap3 snowcap34 = new SnowCap3();
        addObject(snowcap34,168,108);
        snowcap34.setLocation(82,127);
        SnowCap1 snowcap13 = new SnowCap1();
        addObject(snowcap13,318,193);
        snowcap13.setLocation(273,179);
        Pole pole3 = new Pole();
        addObject(pole3,242,103);
        pole3.setLocation(151,79);
        Pole pole4 = new Pole();
        addObject(pole4,500,198);
        pole4.setLocation(440,208);
        Pole pole5 = new Pole();
        addObject(pole5,579,488);
        pole5.setLocation(402,494);
        snowcap22.setLocation(403,391);
        Bear bear = new Bear();
        addObject(bear,521,363);
        bear.setLocation(624,128);
        bear.setLocation(545,459);
        bear.setLocation(541,463);
        land1.setLocation(510,557);
        land1.setLocation(510,557);
        land1.setLocation(510,557);
        land1.setLocation(507,586);
        land1.setLocation(507,586);
        land1.setLocation(507,586);
        land1.setLocation(507,586);
        land1.setLocation(507,586);
        land1.setLocation(507,586);
        land1.setLocation(507,586);
        land1.setLocation(507,586);
        land1.setLocation(507,586);
        land1.setLocation(506,598);
        Fish fish = new Fish();
        addObject(fish,104,54);
        fish.setLocation(82,76);
        Fish fish2 = new Fish();
        addObject(fish2,606,263);
        fish2.setLocation(277,138);
        Fish fish3 = new Fish();
        addObject(fish3,510,194);
        fish3.setLocation(421,209);
        Fish fish4 = new Fish();
        addObject(fish4,636,128);
        fish4.setLocation(397,352);
        Fish fish5 = new Fish();
        addObject(fish5,353,476);
        fish5.setLocation(346,490);
        Fish fish6 = new Fish();
        addObject(fish6,669,502);
        fish6.setLocation(679,488);
        fish6.setLocation(681,493);
        fish5.setLocation(346,499);
        fish6.setLocation(681,500);
        fish4.setLocation(398,357);
        fish3.setLocation(425,218);
        fish2.setLocation(273,143);
        fish.setLocation(82,88);
        fish.setLocation(82,84);
        SnowCap1 snowcap14 = new SnowCap1();
        addObject(snowcap14,640,461);
        snowcap14.setLocation(640,455);
        snowcap14.setLocation(639,448);
        snowcap14.setLocation(621,447);
        snowcap14.setLocation(620,451);
        bear.setLocation(539,482);
        bear.setLocation(539,485);
        Stealth stealth = new Stealth();
        addObject(stealth,827,313);
        stealth.setLocation(820,306);
        stealth.setLocation(813,305);
        stealth.setLocation(833,309);
        GameOver gameover = new GameOver();
        addObject(gameover,479,302);
        gameover.setLocation(465,300);
        removeObject(gameover);
        BearTop beartop = new BearTop();
        addObject(beartop,648,271);
        beartop.setLocation(598,142);
        beartop.setLocation(598,139);
        Pole pole6 = new Pole();
        addObject(pole6,777,127);
        pole6.setLocation(773,153);
        pole6.setLocation(578,155);
        pole6.setLocation(590,157);
        pole6.setLocation(590,154);
        beartop.setLocation(599,140);
        beartop.setLocation(122,253);
        Stealth stealth2 = new Stealth();
        addObject(stealth2,282,275);
        stealth2.setLocation(276,263);
        stealth2.setLocation(289,268);
        removeObject(stealth2);
        Igloo igloo = new Igloo();
        addObject(igloo,827,365);
        igloo.setLocation(819,302);
        snowcap14.setLocation(555,450);
        removeObject(pole3);
        removeObject(snowcap34);
        SnowCap3 snowcap35 = new SnowCap3();
        addObject(snowcap35,57,157);
        snowcap35.setLocation(52,126);
        Pole pole7 = new Pole();
        addObject(pole7,236,113);
        pole7.setLocation(129,73);
    }
    
}
