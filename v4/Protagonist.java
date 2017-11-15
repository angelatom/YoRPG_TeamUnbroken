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

    // Constructor for protagonist with no parameters
    public Protagonist( ) {
	name  = "Gender Neutral Pat";
	health = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }

    // Constructor that creates the protagonist and initializes the attributes
    public Protagonist( String myName) {
	this();
	name  = myName;
    }

    // Abstract about method
    // Post: String
    public abstract  String about();

    // Abstract specialize method
    // Post: null
    public abstract void specialize();

    // Abstract normaliza method
    // Post: null
    public abstract void normalize();

    

    

}
