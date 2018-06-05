package shelterAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
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
		lily = new RoboCat("Lily", 10, 10, 10, 10, "very high maintenance");
	}

	@Test
	public void shouldBeAbleToAddPet() {
		myShelter.accept(sophie);
		Pet foundPet = myShelter.findPet(sophie.getName());
		assertThat(foundPet, is(sophie));
	}

	@Test
	public void shouldBeAbleToAcceptMultiplePetsIntoShelter() {
		myShelter.accept(sophie);
		myShelter.accept(tanner);
		myShelter.accept(cooper);
		myShelter.accept(lily);
		Pet foundCat = myShelter.findPet(sophie.getName());
		Pet foundDog = myShelter.findPet(tanner.getName());
		Pet foundRoboDog = myShelter.findPet(cooper.getName());
		Pet foundRoboCat = myShelter.findPet(lily.getName());
		assertThat(foundCat, is(sophie));
		assertThat(foundDog, is(tanner));
		assertThat(foundRoboDog, is(cooper));
		assertThat(foundRoboCat, is(lily));

	}

	/*
	 * @Test public void shouldBeAbleToAcceptACollectionOfPetsIntoShelter() {
	 * myShelter.accept(sophie); myShelter.accept(cooper); Collection<Pet>
	 * acceptedPets = myShelter.getAllPets();
	 * 
	 * }
	 */

	@Test
	public void shouldBeAbleToAdoptAPetFromShelter() {
		myShelter.accept(sophie);
		myShelter.accept(cooper);
		myShelter.adopt(cooper);
		Collection<Pet> acceptedPets = myShelter.getAllPets();
		assertThat(acceptedPets, containsInAnyOrder(sophie));
	}

	@Test
	public void shouldBeAbleToAdoptMultiplePetsFromShelter() {
		myShelter.accept(sophie);
		myShelter.accept(cooper);
		myShelter.accept(lily);
		myShelter.accept(tanner);
		myShelter.adopt(tanner);
		myShelter.adopt(lily);
		Collection<Pet> acceptedPets = myShelter.getAllPets();
		assertThat(acceptedPets, containsInAnyOrder(sophie, cooper));
	}

	@Test
	public void shouldBeAbleToFeedAllOrganicPets() {
		myShelter.accept(tanner);
		myShelter.accept(sophie);
		myShelter.feedOrganic();
		int check = tanner.getHunger();
		assertEquals(5, check);
		check = sophie.getHunger();
		assertEquals(5, check);
	}

	@Test
	public void shouldBeAbleToWaterAllOrganicPets() {
		myShelter.accept(tanner);
		myShelter.accept(sophie);
		myShelter.waterOrganic();
		int check = tanner.getThirst();
		assertEquals(5, check);
		check = sophie.getThirst();
		assertEquals(5, check);
	}

	@Test
	public void shouldBeAbleToOilAllRoboticPets() {
		myShelter.accept(cooper);
		myShelter.accept(lily);
		myShelter.oilRobotic();
		int check = cooper.getOilLevel();
		assertEquals(15, check);
		check = lily.getOilLevel();
		assertEquals(15, check);
	}

	@Test
	public void shouldBeAbleToIncreaseHungerThirstBoredomWasteWithTickForOrganicPets() {
		myShelter.accept(tanner);
		myShelter.accept(sophie);
		myShelter.tick();
		int check = tanner.getHunger();
		assertEquals(15, check);
		check = sophie.getThirst();
		assertEquals(15, check);
		check = sophie.getBoredom();
		assertEquals(15, check);
		check = tanner.getWaste();
		assertEquals(15, check);

	}
	@Test
	public void shouldBeAbleToDecreaseOilLevelWithTickInRoboPets() {
		myShelter.accept(lily);
		myShelter.accept(cooper);
		myShelter.tick(); 
		int check = lily.getOilLevel(); 
		assertEquals(5, check); 
		check = cooper.getOilLevel(); 
		assertEquals(5, check); 
	}
}
