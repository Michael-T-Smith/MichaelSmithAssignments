
public class Bat extends Mammal {
	
	public void fly() {
		System.out.println("Wooosh");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		this.energyLevel += 50;
	}
	
	public void attackTown() {
		System.out.println("OH GOD HELP IM ON FIRE!!!");
		this.energyLevel -= 100;
	}
}
