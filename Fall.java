import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fall extends World
{

    /**
     * Constructor for objects of class Fall.
     * 
     */
    public Fall()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Land4 land4 = new Land4();
        addObject(land4,455,564);
        land4.setLocation(455,562);
        land4.setLocation(450,554);
        land4.setLocation(448,560);
        Trunk trunk = new Trunk();
        addObject(trunk,488,296);
        trunk.setLocation(182,420);
        Trunk trunk2 = new Trunk();
        addObject(trunk2,486,339);
        trunk2.setLocation(391,444);
        Trunk trunk3 = new Trunk();
        addObject(trunk3,781,432);
        trunk3.setLocation(780,421);
        Trunk trunk4 = new Trunk();
        addObject(trunk4,712,222);
        trunk4.setLocation(690,282);
        Trunk trunk5 = new Trunk();
        addObject(trunk5,335,232);
        trunk5.setLocation(396,266);
        Bushhh2 bushhh2 = new Bushhh2();
        addObject(bushhh2,632,374);
        bushhh2.setLocation(699,389);
        Bushhh2 bushhh22 = new Bushhh2();
        addObject(bushhh22,706,339);
        bushhh22.setLocation(822,414);
        Bushhh2 bushhh23 = new Bushhh2();
        addObject(bushhh23,827,257);
        bushhh23.setLocation(859,303);
        Bushhh2 bushhh24 = new Bushhh2();
        addObject(bushhh24,658,209);
        bushhh24.setLocation(675,244);
        Bushhh2 bushhh25 = new Bushhh2();
        addObject(bushhh25,798,206);
        bushhh25.setLocation(835,174);
        bushhh25.setLocation(830,195);
        removeObject(bushhh25);
        Bushhh2 bushhh26 = new Bushhh2();
        addObject(bushhh26,753,239);
        bushhh26.setLocation(592,270);
        Bushhh2 bushhh27 = new Bushhh2();
        addObject(bushhh27,383,230);
        bushhh27.setLocation(423,256);
        Bushhh2 bushhh28 = new Bushhh2();
        addObject(bushhh28,331,360);
        bushhh28.setLocation(346,446);
        Bushhh2 bushhh29 = new Bushhh2();
        addObject(bushhh29,508,373);
        bushhh29.setLocation(468,401);
        Bushhh2 bushhh210 = new Bushhh2();
        addObject(bushhh210,142,384);
        bushhh210.setLocation(91,387);
        Bushhh2 bushhh211 = new Bushhh2();
        addObject(bushhh211,244,349);
        bushhh211.setLocation(216,374);
        bushhh28.setLocation(341,474);
        Bushhh2 bushhh212 = new Bushhh2();
        addObject(bushhh212,446,364);
        bushhh212.setLocation(388,356);
        bushhh211.setLocation(215,389);
        bushhh29.setLocation(487,420);
        bushhh212.setLocation(391,363);
        bushhh29.setLocation(475,440);
        bushhh212.setLocation(377,353);
        bushhh27.setLocation(455,249);
        Bushhh2 bushhh213 = new Bushhh2();
        addObject(bushhh213,214,283);
        bushhh213.setLocation(169,301);
        Bushhh2 bushhh214 = new Bushhh2();
        addObject(bushhh214,370,155);
        bushhh214.setLocation(305,182);
        bushhh27.setLocation(465,258);
        Bushhh2 bushhh215 = new Bushhh2();
        addObject(bushhh215,522,127);
        bushhh215.setLocation(481,153);
        bushhh215.setLocation(484,151);
        Bushhh3 bushhh3 = new Bushhh3();
        addObject(bushhh3,420,381);
        bushhh3.setLocation(728,400);
        Bushhh3 bushhh32 = new Bushhh3();
        addObject(bushhh32,777,271);
        bushhh32.setLocation(793,318);
        bushhh32.setLocation(802,305);
        Bushhh3 bushhh33 = new Bushhh3();
        addObject(bushhh33,674,274);
        bushhh33.setLocation(656,270);
        bushhh23.setLocation(869,320);
        bushhh23.setLocation(863,308);
        Bushhh3 bushhh34 = new Bushhh3();
        addObject(bushhh34,748,210);
        bushhh34.setLocation(444,150);
        Bushhh3 bushhh35 = new Bushhh3();
        addObject(bushhh35,438,229);
        bushhh35.setLocation(312,206);
        Bushhh3 bushhh36 = new Bushhh3();
        addObject(bushhh36,436,299);
        bushhh36.setLocation(411,272);
        bushhh27.setLocation(476,266);
        Bushhh3 bushhh37 = new Bushhh3();
        addObject(bushhh37,400,375);
        bushhh37.setLocation(416,355);
        Bushhh3 bushhh38 = new Bushhh3();
        addObject(bushhh38,614,392);
        bushhh38.setLocation(365,480);
        Bushhh3 bushhh39 = new Bushhh3();
        addObject(bushhh39,677,485);
        bushhh29.setLocation(493,421);
        bushhh39.setLocation(142,390);
        bushhh39.setLocation(122,409);
        Bushhh3 bushhh310 = new Bushhh3();
        addObject(bushhh310,281,326);
        bushhh310.setLocation(205,305);
        Pinguin pinguin = new Pinguin();
        addObject(pinguin,279,400);
        pinguin.setLocation(79,495);
        bushhh29.setLocation(488,432);
        bushhh310.setLocation(227,317);
        bushhh213.setLocation(131,285);
        bushhh310.setLocation(196,297);
        bushhh27.setLocation(510,254);
        bushhh215.setLocation(499,144);
        bushhh34.setLocation(441,153);
        bushhh211.setLocation(180,388);
        bushhh27.setLocation(524,264);
        bushhh36.setLocation(432,255);
        bushhh310.setLocation(210,301);
        bushhh310.setLocation(194,303);
        bushhh213.setLocation(172,277);
        bushhh310.setLocation(223,302);
        bushhh310.setLocation(238,299);
        bushhh213.setLocation(160,303);
        bushhh310.setLocation(231,300);
        bushhh29.setLocation(498,425);
        bushhh212.setLocation(390,333);
        bushhh37.setLocation(409,340);
        bushhh29.setLocation(483,409);
        bushhh37.setLocation(419,338);
        bushhh212.setLocation(314,319);
        bushhh212.setLocation(320,333);
        bushhh37.setLocation(392,330);
        bushhh212.setLocation(332,335);
        removeObject(bushhh213);
        bushhh310.setLocation(193,311);
        bushhh27.setLocation(520,279);
        bushhh33.setLocation(661,274);
        bushhh26.setLocation(602,253);
        bushhh24.setLocation(704,240);
        bushhh215.setLocation(491,149);
        bushhh215.setLocation(444,149);
        bushhh34.setLocation(428,153);
        bushhh215.setLocation(449,152);
        bushhh24.setLocation(762,192);
        bushhh33.setLocation(625,266);
        bushhh24.setLocation(820,155);
        Bushhh3 bushhh311 = new Bushhh3();
        addObject(bushhh311,638,134);
        bushhh311.setLocation(735,162);
        bushhh24.setLocation(820,162);
        bushhh23.setLocation(814,302);
        bushhh32.setLocation(811,325);
        bushhh23.setLocation(826,292);
        bushhh32.setLocation(813,308);
        bushhh32.setLocation(813,307);
        bushhh32.setLocation(818,311);
        bushhh32.setLocation(814,311);
        bushhh32.setLocation(824,303);
        bushhh32.setLocation(828,341);
        bushhh23.setLocation(789,278);
        bushhh23.setLocation(798,284);
        bushhh23.setLocation(800,279);
        bushhh32.setLocation(819,305);
        bushhh24.setLocation(769,158);
        bushhh32.setLocation(824,312);
        bushhh23.setLocation(813,315);
        bushhh32.setLocation(824,316);
        bushhh32.setLocation(830,333);
        bushhh23.setLocation(779,306);
        bushhh32.setLocation(835,316);
        bushhh22.setLocation(823,440);
        Fish fish = new Fish();
        addObject(fish,699,274);
        fish.setLocation(782,118);
        Fish fish2 = new Fish();
        addObject(fish2,465,105);
        fish2.setLocation(426,118);
        Fish fish3 = new Fish();
        addObject(fish3,232,257);
        fish3.setLocation(78,354);
        Fish fish4 = new Fish();
        addObject(fish4,356,250);
        fish4.setLocation(847,398);
        fish4.setLocation(846,408);
        Fish fish5 = new Fish();
        addObject(fish5,808,352);
        fish5.setLocation(501,376);
        Fish fish6 = new Fish();
        addObject(fish6,471,225);
        fish6.setLocation(840,284);
        Fish fish7 = new Fish();
        addObject(fish7,388,282);
        fish7.setLocation(279,145);

        addObject(bushhh3,772,429);
        bushhh3.setLocation(742,453);
        bushhh2.setLocation(692,412);
        bushhh3.setLocation(648,394);
        trunk3.setLocation(753,417);
        bushhh22.setLocation(810,454);
        fish4.setLocation(831,426);
        Bushhh3 bushhh312 = new Bushhh3();
        addObject(bushhh312,715,452);
        bushhh312.setLocation(753,453);
        Snake snake = new Snake();
        addObject(snake,632,518);
        snake.setLocation(347,499);
        snake.setLocation(528,498);
        pinguin.setLocation(189,496);
        pinguin.setLocation(241,498);
        pinguin.setLocation(209,496);
        Snake snake2 = new Snake();
        addObject(snake2,748,456);
        snake2.setLocation(840,492);
        Snake snake3 = new Snake();
        addObject(snake3,146,454);
        snake3.setLocation(116,493);
        snake3.setLocation(41,493);
        snake.setLocation(447,495);
        snake.setLocation(450,503);
        snake2.setLocation(840,503);
        snake3.setLocation(40,503);
        bushhh29.setLocation(502,410);
        bushhh212.setLocation(346,335);
        SnakeTop snaketop = new SnakeTop();
        addObject(snaketop,691,253);
        snaketop.setLocation(882,274);
        fish6.setLocation(760,279);
        snaketop.setLocation(882,273);
        Nyaa nyaa = new Nyaa();
        addObject(nyaa,319,157);
        nyaa.setLocation(129,116);
        nyaa.setLocation(35,115);
        Fish fish8 = new Fish();
        addObject(fish8,590,440);
        fish8.setLocation(590,517);
        SnakeTopper snaketopper = new SnakeTopper();
        addObject(snaketopper,639,344);
        snaketopper.setLocation(479,238);
        snaketopper.setLocation(626,242);
        nyaa.setLocation(42,55);
        bushhh35.setLocation(313,207);
        bushhh214.setLocation(324,210);
        fish7.setLocation(312,171);
        bushhh35.setLocation(318,243);
        bushhh214.setLocation(325,231);
        bushhh35.setLocation(249,220);
        fish7.setLocation(320,190);
        bushhh214.setLocation(325,217);
        bushhh214.setLocation(324,224);
        bushhh214.setLocation(319,201);
        bushhh27.setLocation(501,266);
        fish7.setLocation(317,174);
        bushhh214.setLocation(326,203);
        bushhh215.setLocation(475,135);
        fish2.setLocation(465,103);
    }
}
