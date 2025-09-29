// 1. made public lowercase
public class Cat {
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	// 2. made cat uppercase
	// 3. added this. for the first two variables in the constructor
	// 4. made this.isHungry = true
	public Cat(String name, String breed) {
		this.name = name;
		this.breed = breed;
		this.isHungry = true;
		livesRemaining = 9;
	}

	// 5. changed void to String
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 6. changed void to boolean
	// 7 made getishungry camelcase (getIsHungry)
	public boolean getIsHungry(){
		return isHungry;
	}

	// 8. changed boolean to void
	public void feed() {
		this.isHungry = false;
	}

	// 8.5. added get and set breed
	public String getBreed() {
		return this.breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	// 9. changed return to if statement
	// 10. did .equals() instead of == for this.name
	// 11. added missing requirements for the if statement
	public boolean equals(Cat other) {
		if(this.name.equals(other.name) && this.breed.equals(other.breed) 
		&& this.isHungry == other.isHungry && this.livesRemaining == other.livesRemaining) {
			return true;
		}
		return false;
	}

	// 12. made it return a string instead of print something
	public String toString() {
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining." + "Is " + name + "hungry? " + isHungry;
	}
}