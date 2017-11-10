public class Character{
    //Instance vars
    public int health;    
    public int strength;    
    public int defense;    
    public double attackRating;

    // Return boolean indicating living or dead
    // Pre: null
    // Post: boolean
    public boolean isAlive() {
	return (health > 0);
    }

    // Returns the value of defense attribute
    // Pre: null
    // Post: int
    public int getDefense() {
	return defense;
    }

    // Lowers the health attribute by the damage
    // Pre: int   
    // Post: void  
    public void lowerHP(int damage) {
	health -= damage;
    }

    //take Protagonist as a parameter
    //calculates damage: damage = (strength * attack_rate) - warrior defense
    //warrior is an instance of Protagonist
    //return damage as an int
    public int attack(Character both) {
	int damage = (int)((strength * attackRating) - both.getDefense());
	both.lowerHP(damage);
	return damage;
    }
}
