/*
  Team Unbroken (Angela Tom, Jackie Li, Bing Li)
  APCS1 pd02
  HW28 -- Ye Olde Role Playing Game
  2017-11-08
*/

//extends allow subclass Protagonist to have all attributes in Superclass Character
public abstract class Protagonist extends Character{

    // Instance vars
    protected String name;    
    
    public static void main(String[] args) {
    }

    public Protagonist( ) {
	name  = "Gender Neutral Pat";
	health = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
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


    public abstract  String about();

    public abstract void specialize();
 
    public abstract void normalize();

    

    

}
