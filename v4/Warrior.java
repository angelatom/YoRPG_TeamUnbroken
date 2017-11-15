/*
Team Unbroken -- Angela Tom, Jackie Li, Bing Li
APCS1 pd02
HW31 -- Ye Olde Role Playing Game, Expanded
2017-11-13
*/

// Subclass warrior will inherit from superclass Protagonist
public class Warrior extends Protagonist {
	
    // Constructor that creates warrior and initializes the attributes
    public Warrior() {
	name = "Warrior";
	strength += 70;
	defense += 10;
	health -= 25;
	attackRating += .3;
    }

      // Prepares the Warrior to perform a special attack by decreasing defense and increasing strength
    // Pre: null
    // Post: void
    public void specialize() {
	defense -= (int)(Math.random() * 2);
	strength += (int)(Math.random() * 3);
    }

    // Prepares the Warrior to perform a normal attack by resetting defense and attack rating attributes
    // Pre: null
    // Post: void
    public void normalize() {
	defense = 50;
	attackRating = 0.6;
    }

    // About method that returns a string description
    // Pre: null
    // Post: String
    public String about() {
	return "The warrior is an old, faithful class that can be relied on due to its great power in strength";
    }
}
