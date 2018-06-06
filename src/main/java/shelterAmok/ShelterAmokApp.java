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
		
		System.out.println("Welcome to All Paws Matter");
		System.out.println("");
		System.out.println("Here is a list of our furry organic pets: ");
		
		System.out.println("");
		System.out.println("Here is a list of our shiny robotic pets: ");
		
		System.out.println("");
		System.out.println();

	}

}
