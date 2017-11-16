/*
Team Unbroken -- Angela Tom, Bing Li, Jackie Li
APCS1 pd2
HW28 -- Ye Olde Role Playing Game
2017-11-08
*/


//extends allow subclass Monster to have all attributes in Superclass Character
public abstract class Monster extends Character{

    //created instance variables containing attributes of monster
    protected String name;

    //default constructor --> initializing all attribues
    public Monster() {
	name = "Smegle";
	health = 150;
	strength = (int)((Math.random() * 45) + 20);
	defense = 20;
	attackRating = 1;
    }

    public abstract String about();

    
}
