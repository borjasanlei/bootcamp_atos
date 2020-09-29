package observatory;

public class Planet extends AstronomicalObjectDIY {

	public Planet(String name, Double elevation, Double azimuth) {
		super(name, elevation, azimuth);
		// TODO Auto-generated constructor stub
	}
	
	
	String planetColor;
		
	public String getType() {
		return planetColor;
	}

	public void setType(String type) {
		this.planetColor = type;
	}

}

	
