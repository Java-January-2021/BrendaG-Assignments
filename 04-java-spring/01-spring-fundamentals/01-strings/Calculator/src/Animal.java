
public class Animal {
	private String name;
	private String species;
	private String color;
	
	public Animal(String name, String species, String color) {
		this.name = name;
		this.species = species;
		this.color = color;
	}

	public Animal(String name, String species) {
		this.name = name;
		this.species = species;
	}

	public Animal() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
