/*
Team Unbroken -- Angela Tom, Jackie Li, Bing Li
APCS1 pd02
HW31 -- Ye Olde Role Playing Game, Expanded
2017-11-13
*/

// Subclass mage will inherit from superclass Protagonist
public class Mage extends Protagonist {

    // Constructor that creates mage and initializes the attributes
    public Mage(String mage) {
	super();
	strength -= 10;
	defense -= 10;
	health += 200;
	attackRating += .2;
    }

    // About method that returns a string description
    // Pre: null
    // Post: String
    public static String about() {
	return "The mage uses its magicical powers for a huge health boost." 
    }
}
