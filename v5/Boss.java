/*
Team Unbroken -- Angela Tom, Bing Li, Jackie Li
APCS1 pd2
HW31 -- Ye Olde Role Playing Game Expanded
2017-11-08
*/


public class Boss extends Monster {

    //default contructor
    public Boss() {
	name = "Boss";
	health = 200;
	strength = (int)((Math.random() * 45) + 35);
	defense = 30;
	attackRating = 1.3;
    }

    //pre: void
    //post: String
    //return the description of your monster
    public String about() {
	return "Oh no! The final boss is here! It is almost impossble to beat because it has elevated all aspects of its traits.";
    }
}
