//Team Unbroken -- Angela Tom, Bing Li, Jackie Li
//APCS1 pd2
//HW28 -- Ye Olde Role Playing Game
//2017-11-08


public class Monster{

    //created instance variables containing attributes of monster
    private String name;
    private int health;
    private int strength;
    private int defense;
    private double attackRating;

    //default constructor --> initializing all attribues
    public Monster() {
	name = "Smegle";
	health = 150;
	strength = (int)((Math.random() * 45) + 20);
	defense = 20;
	attackRating = 1;
    }

    //return boolean indicating living or dead
    // health > 0 --> living
    // otherwise --> dead
    public boolean isAlive() {
	return (health > 0);
    }

    //accessor: returns value of defense attribute
    public int getDefense() {
	return defense;
    }

    //accessor: returns value of name attribute
    public String getName() {
	return name;
    }

    //mutator: decrease life attribute by damage (the arg)
    public void lowerHP(int damage) {
	health -= damage;
    }

    //take Protagonist as a parameter
    //calculates damage: damage = (strength * attack_rate) - warrior defense
    //warrior is an instance of Protagonist
    //return damage as an int
    public int attack(Protagonist warrior) {
	int damage = (int)((strength * attackRating) - warrior.getDefense());
	warrior.lowerHP(damage);
	return damage;
    }
    
}
