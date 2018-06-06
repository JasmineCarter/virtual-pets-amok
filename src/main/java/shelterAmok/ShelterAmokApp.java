package shelterAmok;

import java.util.Scanner;

public class ShelterAmokApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Shelter myShelter = new Shelter(); 
		
		Dog tanner = new Dog("Tanner", 10, 10, 10, 10, 10, 10, "loves to walk");
		Cat sophie = new Cat("Sophie", 10, 10, 10, 10, 10, 10, "soft and cuddly");
		RoboDog cooper = new RoboDog("Cooper", 10, 10, 10, 10, "squeaky");
		RoboCat lily = new RoboCat("Lily", 10, 10, 10, 10, "very high maintenance");
		
		myShelter.accept(tanner); 
		myShelter.accept(sophie);
		myShelter.accept(cooper);
		myShelter.accept(lily);
		
		System.out.println("Welcome to All Paws Matter!");
		System.out.println("");
		System.out.println("Here is a list of our furry organic pets: ");
		System.out.println("");
		myShelter.showAllPets();
		
		String choice = ""; 
		do { 
			System.out.println("How would you like to help our friends today?");
			System.out.println("");
			System.out.println("Type 1 - to accept a pet to the shelter");
			System.out.println("Type 2 - to adopt a pet from the shelter");
			System.out.println("Type 3 - to display stats of all pets");
			System.out.println("Type 4 - choose a pet to play with");
			System.out.println("Type 5 - to take all the dogs for a walk (good luck!)");
			System.out.println("Type 6 - to see your options for the organic pets");
			System.out.println("Type 7 - to oil the robotic pets");
			System.out.println("Type 8 - to exit (hopefully it's with a new pet!");
			
		if(choice.equals("1")) {
			System.out.println("Which type of pet will you be accepting to the shelter?");
			System.out.println("Dog, cat, RoboDog or RoboCat?");
			String pet = input.nextLine(); 
			
		if(pet.equalsIgnoreCase("Dog")) {
				System.out.println("Please enter the name of the dog");
				String name = input.nextLine(); 
				System.out.println("Tell us a little about your pet");
				String description = input.nextLine(); 
				System.out.println();
				myShelter.accept(new Dog("name", 10, 10, 10, 10, 10, 10, "description")); 
				
			
			
			}else if (pet.equalsIgnoreCase("Cat")) {
				System.out.println("Please enter the name of the cat");
				String PetName = input.nextLine(); 
				System.out.println("Tell us a little about your pet");
				String description = input.nextLine(); 
				System.out.println();
				myShelter.accept(new Cat("name", 10, 10, 10, 10, 10, 10, "description"));
				
			}else if (pet.equalsIgnoreCase("RoboDog")) {
				System.out.println("Please enter the name of the RoboDog"); 
				System.out.println("Tell us a little about your pet");
				String description = input.nextLine(); 
				myShelter.accept(new RoboDog("name", 10, 10, 10, 10, "description"));
				
				
				
			}else if(pet.equalsIgnoreCase("RoboCat")) {
					System.out.println("Please enter the name of the RoboCat");
					System.out.println("Tell us a little about your pet");
					String description = input.nextLine(); 
					myShelter.accept(new RoboCat("name", 10, 10, 10, 10, "description"));
				}
				else {
					System.out.println("Thank you!!");
				}

			if (choice.equalsIgnoreCase("2")) {	
				System.out.println("Type the name of the pet you would like to adopt");
				myShelter.showAllPets();
				String name = input.nextLine(); 
				System.out.println("");
				System.out.println("Thank you for choosing" + name + " !");
				myShelter.adopt(myShelter.findPet(name));
			}
			if (choice.equalsIgnoreCase("3")) {
				System.out.println("Here's an update on our pets");
				myShelter.displayPetStats();
			}
			if (choice.equalsIgnoreCase("4")) {
				myShelter.showAllPets();
				System.out.println("Choose a pet to play with");
				String name = input.nextLine(); 
				System.out.println("");
			}
			if (choice.equalsIgnoreCase("5")) {
				myShelter.walkDogs(); 
				System.out.println("You look tired! Thank you!");
			}
			if (choice.equalsIgnoreCase("6")) {
				
				do {
					myShelter.organicPetStats();
					System.out.println("");
					System.out.println("Type A - to feed");
					System.out.println("Type B - to water");
					System.out.println("Type C - to clean dog cages");
					System.out.println("Type D - to empty the cat liter boxes ");
					System.out.println("Type E - to go back to thhe main page ");
					System.out.println("");
					choice = input.nextLine(); 
					
				if (choice.equalsIgnoreCase("A")) {
					myShelter.feedOrganic();
					System.out.println("Thank you! Everyone is full and happy!");
					
		
				}
				else if (choice.equalsIgnoreCase("B")) {
					myShelter.waterOrganic();
					System.out.println("Thank you for watering the pets!");
				}
				else if (choice.equalsIgnoreCase("C")) {
					myShelter.cleanAllDogCages();
					System.out.println("Thanks for helping with my least favorite job!");
					
				}
				else if (choice.equalsIgnoreCase("D")) {
					myShelter.emptyAllLitterBoxes();
					System.out.println("The shelter smells a lot better now! ");
				}
				else {
					System.out.println("Thanks for helping out with the organic animals today!");
				}
				}
				while (!choice.equals("Back to main menu")); 
				
			
	
	
		if (choice.equalsIgnoreCase("7")) {
			 myShelter.oilRobotic();
			 System.out.println("No more squeaky pets!");
	}
	
		if (choice.equalsIgnoreCase("8")){
			System.out.println("Thank you for all of your help today!!! ");
		}
		System.out.println("");
		System.out.println("Our pets stats are currently at : ");
		myShelter.showAllPets();
			
			}
			while(!choice.equals("exit"));

		input.close(); 
		
		}
		}
