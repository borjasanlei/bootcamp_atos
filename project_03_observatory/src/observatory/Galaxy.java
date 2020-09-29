package observatory;

public class Galaxy extends AstronomicalObjectDIY {

	public Galaxy(String name, Double elevation, Double azimuth) {
		super(name, elevation, azimuth);
		// TODO Auto-generated constructor stub
	}
	
	
	Boolean hasArms;
		
	public Boolean getType() {
		return hasArms;
	}

	public void setType(Boolean arms) {
		this.hasArms = arms;
	}

}