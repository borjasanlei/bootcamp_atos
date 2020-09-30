package astronomicalObservation;

public class ObservationContainerInjector {

	public Observer getObserver() {
		// TODO Auto-generated method stub
		return new ObservationApp(new PlanetService());
	}

}

