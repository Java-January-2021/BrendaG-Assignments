import java.util.ArrayList;

public class AnimalTester {
	//Entry Point Method
	public static void main(String[] args) {
		Animal dog = new Animal("buster", "dog", "brown");
		Animal pig = new Animal("Porky", "pig", "pink");
		
		System.out.println("Spring Tool Suite Rocks!!!!!!!!");
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(dog);
		animals.add(pig);
		
		for(Animal a : animals) {
			System.out.println(a.getSpecies());
		}
	}
}
