package shelterAmok;

public abstract class RoboticPet extends Pet {

	protected int oilLevel;

	public int getOilLevel() {
		return oilLevel;
	}

	public void reduceOilLevel() {
		oilLevel -= 5;
	}

	public void increaseOilLevel() {
		oilLevel += 5;
	}

	@Override
	public void play() {
		boredom -= 5;
		this.reduceOilLevel(); 
	}
	
	public void tick() {
		oilLevel -= 5; 
	}
	public void displayStats()
	{
		System.out.println("Name: " + name + " Oil Level : " + oilLevel + " " + " Boredom: " + 
		boredom + " " + " Health: " + health + " " + " Happiness: " + happiness);
	}
}