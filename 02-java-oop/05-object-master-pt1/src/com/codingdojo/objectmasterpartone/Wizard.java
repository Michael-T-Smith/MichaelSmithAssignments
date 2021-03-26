package com.codingdojo.objectmasterpartone;

public class Wizard extends Human {
	public int health = 50;
	private int intelligence = 8;

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void displayHealth() {
		System.out.println("Wizard health: "+ this.health);
	}

	public void heal(Human otherHuman) {
		otherHuman.setHealth(otherHuman.getHealth() + intelligence);
	}

	public void fireball(Human otherHuman) {
		 otherHuman.setHealth(otherHuman.getHealth() - (intelligence * 3));
	}
}
