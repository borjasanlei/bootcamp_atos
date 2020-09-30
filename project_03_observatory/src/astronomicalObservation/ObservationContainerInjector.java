package astronomicalObservation;

public class ObservationContainerInjector implements ObservationServiceInjector {

	@Override
	public Observer getObserver() {
		// TODO Auto-generated method stub
		return new ObservationApp(new PlanetService());
	}

}

