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
		for (Pet pet : pets.values()) { // all pets
			if (pet instanceof OrganicPet) { // check for organic pets - cast pet so we can feed
				((OrganicPet) pet).feed();
			}
		}

	}

	public void waterOrganic() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).water();
			}
		}

	}

	public void oilRobotic() {
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).increaseOilLevel();
			}
		}

	}

	public void tick() {
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				((OrganicPet) pet).tick();
			} else {
				((RoboticPet) pet).tick();
			}

		}
	}

	public void showAllPets() {
		for (Pet pets : pets.values()) {
			System.out.println("Name: " + pets.getName() + "description: " + pets.getDescription());

		}
	}

	public void displayPetStats() {
		for (Pet pets : pets.values()) {
			pets.displayStats();
		}
	}

	public void organicPetStats() {
		for (Pet pets : pets.values()) {
			if (pets instanceof OrganicPet) {
				pets.displayStats();
			}

		}
	}

	public void roboticPetStats() {
		for (Pet pets : pets.values()) {
			if (pets instanceof RoboticPet) {
				pets.displayStats();
			}
		}
	}

	public void cleanAllDogCages() {
		for (Pet pets : pets.values()) {
			if (pets instanceof Dog) {
				((OrganicPet) pets).clean();

			}
		}
	}

	public void emptyAllLitterBoxes() {
		for (Pet pets : pets.values()) {
			if (pets instanceof Cat) {
				((OrganicPet) pets).clean();
			}
		}
	}

	public void playWithAllPets() {
		for (Pet pets : pets.values()) {
			pets.play();
		}
	}
}
