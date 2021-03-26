
public class Mammal {
	public int energyLevel;
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public int getEnergyLevel() {
		return this.energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("The animals energy level is " + this.energyLevel);
		return this.energyLevel;
	}
	
	
}
