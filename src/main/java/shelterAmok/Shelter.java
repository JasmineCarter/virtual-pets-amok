package shelterAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class Shelter {
	
	Map<String, Pet> pets = new HashMap<>();

	public void accept(Cat anyPet) {
		pets.put(anyPet.getName(), anyPet); 
	}

	public Pet findPet(String name) {
		return pets.get(name);
	}


	public void accept(RoboDog cooper) {
		// TODO Auto-generated method stub
		
	}

	public Collection<Pet> getAllPets() {
		return pets.values();
	}

	public void adopt(Dog anyDog) {
		pets.remove(anyPet.getName()); 
	}

	
	

	
	

}
