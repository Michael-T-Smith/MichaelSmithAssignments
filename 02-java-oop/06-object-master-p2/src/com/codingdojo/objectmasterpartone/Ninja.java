package com.codingdojo.objectmasterpartone;

public class Ninja extends Human {
	private int stealth = 10;
	public int health = 100;

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void displayHealth() {
		System.out.println("Ninja health: " + this.health);
	}

	public void steal(Human otherHuman) {
		otherHuman.setHealth(otherHuman.getHealth() - this.stealth);
		this.health += this.stealth;
	}

	public void runAway() {
		this.health -= 10;
	}
}
