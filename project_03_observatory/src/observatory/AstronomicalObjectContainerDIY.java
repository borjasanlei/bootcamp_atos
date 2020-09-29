package observatory;
/*
 * This container is created to manage the calls to the classes from the Main class. Thus,
 * the objects needed by the Main class will be SERVED by this container, instead of changing 
 * the code on the Main class.
 */


public class AstronomicalObjectContainerDIY extends Galaxy {
	
	
	public AstronomicalObjectContainerDIY(String name, Double elevation, Double azimuth) {
		super(name, elevation, azimuth);
		// TODO Auto-generated constructor stub
	}
	

}
