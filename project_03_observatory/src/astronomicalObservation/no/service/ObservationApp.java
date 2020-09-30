package astronomicalObservation.no.service;

public class ObservationApp {

	private StarObservation star = new StarObservation();
	
	public void investigateObject(String name, Double coordinate1, Double coordinate2) {
		System.out.println("This object is called " + name);
		this.star.investigateStar(coordinate1, coordinate2);
		System.out.println("Amazing discovery!");
	}
}
