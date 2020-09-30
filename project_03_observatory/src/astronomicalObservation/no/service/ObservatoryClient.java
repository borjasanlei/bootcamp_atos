package astronomicalObservation.no.service;

public class ObservatoryClient {
	
	public static void main(String[] args) {
		
		String name = "Vega";
		Double coordinate1 = 13.56;		
		Double coordinate2 = 77.2;
		
		
		ObservationApp app = new ObservationApp();
		app.investigateObject(name, coordinate1, coordinate2);
		
	}
}
