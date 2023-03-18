/**
 * MotoSettings class demonstrates the functionality of the Motorcycle class.
 * 
 * @author angela tackett
 */

 public class MotoSettings {
	/**
	 * Main method creates a Motorcycle object, provides the initial speed and
	 * gear upon power up. The program progressively sets increased speeds and
	 * displays the new speed and gear attributed to that speed range.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a new Motorcycle object
		Motorcycle m1 = new Motorcycle();

		// Print the initial speed & gear
		System.out.println("\tMotorcycle \n\nInitial readings upon power up:");
		System.out.print("Initial speed: " + m1.getSpeed() + "\nInitial gear: "
				+ m1.getGear());
		System.out.println();

		// Set speed of car
		m1.setSpeed(15);

		// Display newly set speed and associated gear
		System.out.print("\nSpeed after setting to 15 mph: " + m1.getSpeed()
				+ "\nGear: " + m1.getGear());
		System.out.println();

		// Set speed of car
		m1.setSpeed(25);

		// Display newly set speed and associated gear
		System.out.print("\nSpeed after setting to 25 mph: " + m1.getSpeed()
				+ "\nGear: " + m1.getGear());
		System.out.println();

		// Set speed of car
		m1.setSpeed(35);

		// Display newly set speed and associated gear
		System.out.print("\nSpeed after setting to 35 mph: " + m1.getSpeed()
				+ "\nGear: " + m1.getGear());
		System.out.println();

		// Set speed of car
		m1.setSpeed(45);

		// Display newly set speed and associated gear
		System.out.print("\nSpeed after setting to 45 mph: " + m1.getSpeed()
				+ "\nGear: " + m1.getGear());
		System.out.println();

		// Set speed of car
		m1.setSpeed(75);

		// Display newly set speed and associated gear
		System.out.print("\nSpeed after setting to 75 mph: " + m1.getSpeed()
				+ "\nGear: " + m1.getGear());
		System.out.println();
	}

}
