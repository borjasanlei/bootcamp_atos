package astronomicalObservation;

public class StarService implements ObservationService {

	@Override
	public void investigateObject(String name, Double coordinate1, Double coordinate2) {
		System.out.println(String.format("Investigating a star... looking at %f, %f coordinates...", coordinate1, coordinate2));
	}

}
