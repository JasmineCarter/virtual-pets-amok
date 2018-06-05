package shelterAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class ShelterTest {
	
	private Shelter myShelter;
	private Dog tanner;
	private Cat sophie;
	private RoboDog cooper;
	private RoboCat lily;

	@Before
	public void setUp() {
		
		myShelter = new Shelter();
		tanner = new Dog("Tanner", 10, 10, 10, 10, 10, 10, "loves to walk"); 
		sophie = new Cat("Sophie", 10, 10, 10, 10, 10, 10, "soft and cuddly"); 
		cooper = new RoboDog("Cooper", 10, 10, 10, 10, "squeaky"); 
		lily = new RoboCat("Lily", 10, 10, 10,10, "very high maintenance"); 
	}
	
	@Test 
	public void shouldBeAbleToAcceptANewPetIntoShelter() {
		myShelter.accept(sophie);
		Pet foundCat = myShelter.findPet(sophie.getName()); 
		assertThat(foundCat, is(sophie));
		
		
	}
	
	@Test
	public void shouldBeAbleToAcceptTwoNewPetsIntoShelter() {
		myShelter.accept(sophie);
		myShelter.accept(cooper);
		Pet foundCat = myShelter.findPet(sophie.getName()); 
		Pet foundRoboDog = myShelter.findPet(cooper.getName()); 
		assertThat(foundCat, is(sophie)); 
		assertThat(foundRoboDog, is(cooper)); 
	}

	@Test 
	public void shouldBeAbleToAcceptACollectionOfPetsIntoShelter() {
		myShelter.accept(sophie); 
		myShelter.accept(cooper); 
		Collection<Pet> acceptedPets = myShelter.getAllPets(); 
		
	}
	
	@Test
	public void shouldBeAbleToAdoptAPetFromShelter() {
		myShelter.accept(sophie);
		myShelter.accept(cooper);
		myShelter.adopt(tanner); 
		Collection<Pet> acceptedPets= myShelter.getAllPets(); 
		assertThat(acceptedPets, containsInAnyOrder(sophie)); 
	}
}
