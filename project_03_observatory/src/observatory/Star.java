package observatory;

public class Star extends AstronomicalObjectDIY {

	public Star(String name, Double elevation, Double azimuth) {
		super(name, elevation, azimuth);
		// TODO Auto-generated constructor stub
	}

	
	String starType;
	
	public String getType() {
		return starType;
	}

	public void setType(String type) {
		this.starType = type;
	}
	

}
