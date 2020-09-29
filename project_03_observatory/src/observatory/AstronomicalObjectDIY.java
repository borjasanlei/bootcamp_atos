package observatory;

public abstract class AstronomicalObjectDIY {
	// Variables
	
	String name;
	Double elevation;
	Double azimuth;
	
	
	// Constructor
	public AstronomicalObjectDIY(String name, Double elevation, Double azimuth) {
		
		super();
		this.name = name;
		this.elevation = elevation;
		this.azimuth = azimuth;
	}

	// method
	public String investigate() {
		return "Investigating this object...";
		
	}
	
	
	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getElevation() {
		return elevation;
	}

	public void setElevation(Double elevation) {
		this.elevation = elevation;
	}

	public Double getAzimuth() {
		return azimuth;
	}

	public void setAzimuth(Double azimuth) {
		this.azimuth = azimuth;
	}
	
	
	
	
}


