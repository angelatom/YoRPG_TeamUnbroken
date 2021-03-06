/*
Team Unbroken -- Angela Tom, Jackie Li, Bing Li
APCS1 pd02
HW31 -- Ye Olde Role Playing Game, Expanded
2017-11-13
*/

// Subclass warrior will inherit from superclass Protagonist
public class Warrior extends Protagonist {

	private String name;
	
    // Constructor that creates warrior and initializes the attributes
    public Warrior() {
	name = "Warrior";
	strength += 70;
	defense += 10;
	health -= 25;
	attackRating += .3;
    }

    // About method that returns a string description
    // Pre: null
    // Post: String
    public static String about() {
	return "The warrior is an old, faithful class that can be relied on due to its great power in strength";
    }
}
