package astronomicalObservation;

public class ObservationApp implements Observer{

	private ObservationService service;
	
	public ObservationApp(ObservationService svc) {
		this.service = svc;
	}

	@Override
	public void processObservation(String name, Double coordinate1, Double coordinate2) {
		System.out.println("This object is called " + name);
		this.service.investigateObject(name, coordinate1, coordinate2);
		System.out.println("Amazing discovery!");
	}
}
