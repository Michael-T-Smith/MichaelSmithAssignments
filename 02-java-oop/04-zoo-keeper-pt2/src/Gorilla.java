
public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("The gorilla threw...something.");
		energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("The gorilla loves bananas.");
		if(energyLevel <= 100) {
			System.out.println("the gorillas energy is maxed.");
		} else {
		energyLevel += 10;
		System.out.println("energy increased by 10!");
		}
	}
	public void climb() {
		System.out.println("The gorilla climbed up a tree.");
		energyLevel -= 10;
	}
}
