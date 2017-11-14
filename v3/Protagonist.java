/*
Team Unbroken (Angela Tom, Jackie Li, Bing Li)
APCS1 pd02
HW28 -- Ye Olde Role Playing Game
2017-11-08
*/

//extends allow subclass Protagonist to have all attributes in Superclass Character
public class Protagonist extends Character{

    // Instance vars
    protected String name;    
    
    public static void main(String[] args) {
    }

    // Constructor that creates the protagonist and initializes the attributes
    public Protagonist( String myName) {
	name  = myName;
	health = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }

    // Returns the name attribute
    // Pre: null
    // Post: string
    public String getName() {
	return name;
    }

    //  Calculates the damage to the monster
    // Pre: Monster
    // Post: int damage
    public int attack(Monster enemy) {
	int damage = (int)((strength * attackRating) - enemy.getDefense());
	enemy.lowerHP(damage);
	return damage;
    }

    // Prepares the Protagonist to perform a special attack by decreasing defense and increasing attack
    // Pre: null
    // Post: void
    public void specialize() {
	defense -= (int)(Math.random() * 3);
	attackRating += (int)(Math.random() * 3);
    }

    // Prepares the Protagonist to perform a normal attack by resetting defense and attack attributes
    // Pre: null
    // Post: void
    public void normalize() {
	defense = 40;
	attackRating = 0.4;
    }
}
