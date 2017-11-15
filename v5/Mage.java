/*
  Team Unbroken -- Angela Tom, Jackie Li, Bing Li
  APCS1 pd02
  HW31 -- Ye Olde Role Playing Game, Expanded
  2017-11-13
*/

// Subclass mage will inherit from superclass Protagonist
public class Mage extends Protagonist {
	
    // Constructor that creates mage and initializes the attributes
    public Mage() {
	name = "Mage";
	strength -= 10;
	defense -= 10;
	health += 200;
	attackRating += .2;
    }

    // Prepares the Mage to perform a special attack by decreasing defense and increasing health
    // Pre: null
    // Post: void
    public void specialize() {
	defense -= (int)(Math.random() * 2);
	health += (int)(Math.random() * 3);
    }

    // Prepares the Mage to perform a normal attack by resetting defense and attack attributes
    // Pre: null
    // Post: void
    public void normalize() {
	defense = 30;
	attackRating = 0.5;
    }

    // About method that returns a string description
    // Pre: null
    // Post: String
    public String about() {
	return "The mage uses its magicical powers for a huge health boost."; 
    }
}
