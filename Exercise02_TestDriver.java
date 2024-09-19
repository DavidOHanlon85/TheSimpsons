/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise02_TestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise02_TheSimpsons bart = new Exercise02_TheSimpsons();
		bart.setName("Bart");
		bart.setCatchphrase("Eat my shorts !");

		Exercise02_TheSimpsons homer = new Exercise02_TheSimpsons();
		homer.setName("Homer");
		homer.setCatchphrase("D'Oh !");
		
		Exercise02_TheSimpsons lisa = new Exercise02_TheSimpsons();
		lisa.setName("Lisa");
		lisa.setCatchphrase("I'll be in my room");
		
		Exercise02_TheSimpsons nelson = new Exercise02_TheSimpsons();
		nelson.setName("Nelson");
		nelson.setCatchphrase("HaHa");
		
		// Bart printout
		
		bart.sayCatchPhrase();
		
		System.out.println();
		
		bart.sayCatchPhrase2();
		
		System.out.println();
		
		// Homer printout
		
		homer.sayCatchPhrase();
		
		System.out.println();
		
		// Lisa printout
		
		lisa.sayCatchPhrase();
		
		System.out.println();
		
		// Nelson printout
		
		nelson.sayCatchPhrase();
		
		
	}
	
		public static void printSays() {
			System.out.print(" says ");
		}

}
