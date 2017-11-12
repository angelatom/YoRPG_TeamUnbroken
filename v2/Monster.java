/*
Team Unbroken -- Angela Tom, Bing Li, Jackie Li
APCS1 pd2
HW28 -- Ye Olde Role Playing Game
2017-11-08
*/


//extends allow subclass Monster to have all attributes in Superclass Character
public class Monster extends Character{

    //created instance variables containing attributes of monster
    private String name;

    //default constructor --> initializing all attribues
    public Monster() {
	name = "Smegle";
	health = 150;
	strength = (int)((Math.random() * 45) + 20);
	defense = 20;
	attackRating = 1;
    }

    //accessor: returns value of name attribute
    public String getName() {
	return name;
    }

    
}
