/*
Team Unbroken -- Angela Tom, Jackie Li, Bing Li
APCS1 pd02
HW31 -- Ye Olde Role Playing Game, Expanded
2017-11-13
*/

// Subclass rogue will inherit from superclass Protagonist
public class Rogue extends Protagonist {

	private String name;
	
    // Constructor that creates warrior and initializes the attributes
    public Rogue() {
	name = "Rogue";
	strength += 25;
	defense += 25;
	health += 25;
	attackRating += .15;
    }

    // About method that returns a string description
    // Pre: null
    // Post: String
    public static String about() {
	return "The rogue is a classic with a low, modest boost in every aspect"; 
    }
}
