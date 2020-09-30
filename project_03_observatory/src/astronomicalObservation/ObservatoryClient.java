package astronomicalObservation;

public class ObservatoryClient {
	
	public static void main(String[] args) {
		
		String name = "Vega";
		Double coordinate1 = 13.56;		
		Double coordinate2 = 77.2;
		
		ObservationServiceInjector injector;
		Observer app;
		
		// Investigate the object
		injector = new ObservationContainerInjector();
		app = injector.getObserver();
		app.processObservation(name, coordinate1, coordinate2);
	}
}
