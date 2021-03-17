package com.codingdojo.objectmasterpartone;

public class Samurai extends Human {
	public int health = 200;
	private int amountOfSamurai;
	
	public int getHealth() {
		return this.health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void displayHealth() {
		System.out.println("Samurai health: " + this.health);
	}

	public void deathBlow(Human otherHuman) {
		otherHuman.setHealth(otherHuman.getHealth() - otherHuman.getHealth());
		this.health /= 2;
	}

	public void meditate() {
		this.health += (this.health / 2);
	}

	public void howMany() {
		System.out.println(amountOfSamurai);
	}
}
