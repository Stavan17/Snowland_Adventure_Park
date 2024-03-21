import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spring here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spring extends World
{
    public int score;
    /**
     * Constructor for objects of class Spring.
     * 
     */
    public Spring()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
        score = 0;
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
        Land2 land2 = new Land2();
        addObject(land2,507,567);
        land2.setLocation(497,560);

        Trunk trunk = new Trunk();
        addObject(trunk,306,344);
        trunk.setLocation(175,396);
        Trunk trunk2 = new Trunk();
        addObject(trunk2,400,409);
        trunk2.setLocation(373,398);
        Trunk trunk3 = new Trunk();
        addObject(trunk3,758,370);
        trunk3.setLocation(676,395);
        Bush1 bush1 = new Bush1();
        addObject(bush1,353,382);
        bush1.setLocation(205,432);
        Bush1 bush12 = new Bush1();
        addObject(bush12,883,488);
        bush12.setLocation(102,382);
        bush12.setLocation(88,376);
        Bush1 bush13 = new Bush1();
        addObject(bush13,308,350);
        bush13.setLocation(268,361);
        Bush1 bush14 = new Bush1();
        addObject(bush14,219,208);
        bush14.setLocation(126,305);
        bush14.setLocation(158,299);
        bush12.setLocation(82,368);
        bush13.setLocation(275,362);
        bush14.setLocation(177,290);
        Bush1 bush15 = new Bush1();
        addObject(bush15,574,246);
        bush15.setLocation(260,258);
        bush15.setLocation(228,260);
        Bush1 bush16 = new Bush1();
        addObject(bush16,604,387);
        bush16.setLocation(446,387);
        Bush1 bush17 = new Bush1();
        addObject(bush17,597,265);
        bush17.setLocation(423,300);
        bush13.setLocation(283,369);
        bush14.setLocation(177,289);
        bush15.setLocation(256,258);
        bush15.setLocation(265,259);
        bush14.setLocation(193,288);
        bush15.setLocation(272,255);
        bush15.setLocation(246,244);
        Bush1 bush18 = new Bush1();
        addObject(bush18,773,391);
        bush18.setLocation(621,364);
        Bush1 bush19 = new Bush1();
        addObject(bush19,848,442);
        bush19.setLocation(688,294);
        Bush1 bush110 = new Bush1();
        addObject(bush110,773,439);
        bush110.setLocation(744,410);
        Pinguin pinguin = new Pinguin();
        addObject(pinguin,72,461);
        trunk.setLocation(175,411);
        trunk2.setLocation(373,410);
        trunk3.setLocation(675,413);
        trunk3.setLocation(679,413);
        bush1.setLocation(211,453);
        bush13.setLocation(286,389);
        bush12.setLocation(86,388);
        bush14.setLocation(194,324);
        bush14.setLocation(193,322);
        bush15.setLocation(256,272);
        bush16.setLocation(456,386);
        bush17.setLocation(423,318);
        bush17.setLocation(407,311);
        bush16.setLocation(478,381);
        bush17.setLocation(407,320);
        bush110.setLocation(752,410);
        bush19.setLocation(721,305);
        bush12.setLocation(78,364);
        bush14.setLocation(193,284);
        bush15.setLocation(346,151);
        bush14.setLocation(211,299);
        bush15.setLocation(360,242);
        bush13.setLocation(302,379);
        bush1.setLocation(222,461);
        bush13.setLocation(321,377);
        bush14.setLocation(220,282);
        bush12.setLocation(72,383);
        bush12.setLocation(78,372);
        bush14.setLocation(236,305);
        bush17.setLocation(464,296);
        bush13.setLocation(361,381);
        bush17.setLocation(452,310);
        bush16.setLocation(464,411);
        bush15.setLocation(376,189);
        Trunk trunk4 = new Trunk();
        addObject(trunk4,532,341);
        trunk4.setLocation(402,284);
        trunk4.setLocation(403,281);
        bush15.setLocation(502,194);
        trunk4.setLocation(413,289);
        removeObject(bush13);
        removeObject(bush17);
        removeObject(bush16);
        removeObject(bush15);
        Bush1 bush111 = new Bush1();
        addObject(bush111,465,440);
        bush111.setLocation(449,387);
        Bush1 bush112 = new Bush1();
        addObject(bush112,400,366);
        bush112.setLocation(299,380);
        bush14.setLocation(212,294);
        trunk4.setLocation(422,295);
        Bush1 bush113 = new Bush1();
        addObject(bush113,583,230);
        bush113.setLocation(508,278);
        Bush1 bush114 = new Bush1();
        addObject(bush114,388,105);
        bush114.setLocation(371,208);
        bush19.setLocation(750,297);
        bush110.setLocation(762,430);
        bush19.setLocation(758,281);
        bush19.setLocation(743,287);
        bush14.setLocation(243,293);
        bush114.setLocation(343,207);
        trunk2.setLocation(373,417);
        trunk2.setLocation(376,380);
        bush112.setLocation(311,371);
        removeObject(bush112);
        bush111.setLocation(458,369);
        trunk4.setLocation(424,276);
        bush113.setLocation(521,249);
        bush114.setLocation(370,187);
        bush18.setLocation(591,368);
        bush19.setLocation(740,297);
        bush111.setLocation(442,371);
        removeObject(pinguin);
        Pinguin pinguin2 = new Pinguin();
        addObject(pinguin2,66,483);
        bush113.setLocation(528,239);
        bush113.setLocation(520,252);
        bush114.setLocation(354,185);
        bush113.setLocation(538,239);
        BushN bushn = new BushN();
        addObject(bushn,431,275);
        bushn.setLocation(157,351);
        BushN bushn2 = new BushN();
        addObject(bushn2,481,359);
        bushn2.setLocation(378,332);
        BushN bushn3 = new BushN();
        addObject(bushn3,608,274);
        bushn3.setLocation(491,233);
        BushN bushn4 = new BushN();
        addObject(bushn4,641,407);
        bushn4.setLocation(669,351);
        BushN bushn5 = new BushN();
        addObject(bushn5,710,437);
        bushn5.setLocation(716,445);
        BushN bushn6 = new BushN();
        addObject(bushn6,419,189);
        bushn6.setLocation(383,162);
        Fish fish7 = new Fish();
        addObject(fish7,324,394);
        fish7.setLocation(252,427);
        Fish fish8 = new Fish();
        addObject(fish8,351,321);
        fish8.setLocation(56,346);
        Fish fish9 = new Fish();
        addObject(fish9,482,322);
        fish9.setLocation(465,348);
        Fish fish10 = new Fish();
        addObject(fish10,591,314);
        fish10.setLocation(571,345);
        fish10.setLocation(571,343);
        Fish fish11 = new Fish();
        addObject(fish11,721,225);
        fish11.setLocation(769,265);
        Fish fish12 = new Fish();
        addObject(fish12,547,482);
        fish12.setLocation(430,481);
        Fish fish13 = new Fish();
        addObject(fish13,530,151);
        fish13.setLocation(316,158);
        Balloon balloon = new Balloon();
        addObject(balloon,640,290);
        balloon.setLocation(845,50);

        balloon.setLocation(843,231);
        balloon.setLocation(851,54);

        bush19.setLocation(742,299);
        bush19.setLocation(737,292);

        balloon.setLocation(865,104);
        Monkey monkey = new Monkey();
        addObject(monkey,629,456);
        monkey.setLocation(118,482);
        bush1.setLocation(221,454);
        monkey.setLocation(581,447);
        monkey.setLocation(215,482);
        removeObject(monkey);
        Monkey monkey2 = new Monkey();
        addObject(monkey2,572,427);
        monkey2.setLocation(299,482);
        Monkey monkey3 = new Monkey();
        addObject(monkey3,697,449);
        monkey3.setLocation(695,489);
        monkey3.setLocation(686,483);
        bush1.setLocation(221,460);
        bush1.setLocation(221,463);

        bush12.setLocation(66,374);
        MonkeyTop monkeytop = new MonkeyTop();
        addObject(monkeytop,625,343);
        monkeytop.setLocation(452,335);
    }
}
