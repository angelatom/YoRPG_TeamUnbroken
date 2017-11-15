/*
  Team Unbroken -- Angela Tom, Jackie Li, Bing Li
  APCS1 pd02
  HW31 -- Ye Olde Role Playing Game, Expanded
  2017-11-13
*/

// Subclass rogue will inherit from superclass Protagonist
public class Rogue extends Protagonist {
	
    // Constructor that creates warrior and initializes the attributes
    public Rogue() {
	name = "Rogue";
	strength += 25;
	defense += 25;
	health += 25;
	attackRating += .15;
    }

    // Prepares the Rogue to perform a special attack by decreasing defense and increasing attack rating
    // Pre: null
    // Post: void
    public void specialize() {
	defense -= (int)(Math.random() * 4);
	attackRating += (int)(Math.random() * 3);
    }

    // Prepares the Rogue to perform a normal attack by resetting defense and attack attributes
    // Pre: null
    // Post: void
    public void normalize() {
	defense = 65;
	attackRating = 0.55;
    }

    // About method that returns a string description
    // Pre: null
    // Post: String
    public String about() {
	return "The rogue is a classic with a low, modest boost in every aspect"; 
    }
}
