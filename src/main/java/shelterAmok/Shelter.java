package shelterAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {

	Map<String, Pet> pets = new HashMap<>();

	public void accept(Pet anyPet) {
		pets.put(anyPet.getName(), anyPet);
	}

	public Pet findPet(String name) {
		return pets.get(name);
	}

	public Collection<Pet> getAllPets() {
		return pets.values();
	}

	public void adopt(Pet anyPet) {
		pets.remove(anyPet.getName());
	}

	public void feedOrganic() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();
			}
		}

	}

	public void waterOrganic() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet)pet).water(); 
			}
		}
		
	}

	public void oilRobotic() {
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				((RoboticPet)pet).increaseOilLevel(); 
			}
		}
		
	}

	
}
