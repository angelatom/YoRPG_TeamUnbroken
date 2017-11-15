/*
Team Unbroken -- Angela Tom, Bing Li, Jackie Li
APCS1 pd2
HW31 -- Ye Olde Role Playing Game Expanded
2017-11-08
*/


public class Plague extends Monster {

    //default constructor
    public Plague() {
	name = "Plague Doctor";
	health = 200;
	strength = (int)((Math.random() * 65) + 20);
	defense = 20;
	attackRating = 1;
    }

    //pre:void
    //post:String
    //return the description of the monster Plague
    public static String about() {
	return "Beware of the legendary Plauge Doctor! This type of monster has extremely high HP (200) and increased strength in attack (20 more than regular monster).";
    }
}
