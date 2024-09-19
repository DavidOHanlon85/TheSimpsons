/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise02_TheSimpsons {
	
	// Instant Variables
	
	private String name;
	private String catchphrase;
	
	// Getters and Setters
	
	/**
	 * This method returns the name
	 * @return - name
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * This method sets the name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the catchphrase
	 */
	public String getCatchphrase() {
		return catchphrase;
	}

	/**
	 * @param catchphrase - the catchphrase to set
	 */
	public void setCatchphrase(String catchphrase) {
		this.catchphrase = catchphrase;
	}
	
	// Methods
	
	/**
	 * This method prints the characters catchphrase to console
	 */
	
	public void sayCatchPhrase(){
		System.out.print(getName());
		System.out.print(" says ");
		System.out.print(getCatchphrase());
	}
	
	/**
	 * This method also prints the characters catchphrase to console
	 */
	
	public void sayCatchPhrase2(){
		System.out.print(this.name + " says " + this.catchphrase);
	}

	// To String Method
	
	/**
	 * This method converts each object to string
	 */
	@Override
	public String toString() {
		return "Exercise02_TheSimpsons [name=" + name + ", catchphrase=" + catchphrase + "]";
	}
	
	
	
	
}
