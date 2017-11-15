/*
Team Unbroken -- Angela Tom, Bing Li, Jackie Li
APCS1 pd2
HW31 -- Ye Olde Role Playing Game Expanded
2017-11-08
*/


public class Chimera extends Monster {

    //default constructor
    public Chimera() {
	name = "Chimera";
	health = 150;
	strength = (int)((Math.random() * 85) + 20);
	defense = 20;
	attackRating = 1.5;
    }

    //pre:void
    //post: String
    //return the description of Chimera
    public static String about() {
	return "Chimera had three heads. The torso and main head was that of a lion. Then for some reason there was goat's head sticking out of its back. Then, for a tail, it had a snake — no, not a snake tail, just a snake, with its head as the tip. Also, it breathed fire, because why not? Beware of the Chimera because it has exceptional strength and attack rate.";
    }
}
