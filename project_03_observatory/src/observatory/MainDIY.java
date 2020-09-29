package observatory;

public class MainDIY {

	public static void main(String[] args) {
		
		AstronomicalObjectContainerDIY new_object = new AstronomicalObjectContainerDIY("M32", 21.4, -2.9);

		System.out.println("Looking at " + new_object.name);
		System.out.println("Coordinates: " + new_object.elevation + " ELEVATION " + new_object.azimuth + " AZIMUTH");
		System.out.println(new_object.investigate());
		System.out.println("This " + new_object.getClass().getSuperclass().getSimpleName() + " looks awesome!");
		System.out.println("Amazing discovery!");
		
	}

}
