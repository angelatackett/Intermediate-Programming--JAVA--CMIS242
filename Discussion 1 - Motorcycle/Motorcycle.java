/**
 * Motorcycle class creates a motorcycle object with speed and gear attributes.
 * An array holds the various gear options and for the sake of this program
 * fluctuations of speed (mph) will trigger gear changes.
 * 
 * @author angela tackett 18MAR23
 *
 */
public class Motorcycle {

	// create instance variables
	private String gear;
	private double speed;
	private String[] gears;

	/**
	 * Constructor for MotorcycleGears class, initializes gear N & speed to 0
	 * mph.
	 */
	public Motorcycle() {

		gears = new String[6]; // create a new array with size 5
		gears[0] = "1"; // first gear
		gears[1] = "N"; // neutral
		gears[2] = "2"; // second gear
		gears[3] = "3"; // third gear
		gears[4] = "4"; // fourth gear
		gears[5] = "5"; // fifth gear

		speed = 0;
		gear = "N";
	}

	/**
	 * getter and setter methods for gear and speed attributes.
	 * 
	 * @return the current gear and speed of motorcycle
	 */
	public String getGear() {
		if (speed == 0) {
			gear = gears[1];
		} else if (speed >= 0 && speed <= 20) {
			gear = gears[0];
		} else if (speed > 20 && speed <= 30) {
			gear = gears[2];
		} else if (speed > 30 && speed <= 40) {
			gear = gears[3];
		} else if (speed > 40 && speed <= 50) {
			gear = gears[4];
		} else if (speed > 50) {
			gear = gears[5];
		}
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

}
