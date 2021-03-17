package com.codingdojo.objectmasterpartone;

public class Human {
	private int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStrength() {
		System.out.println(this.strength);
		return this.strength;
	}
	
	
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getIntelligence() {
		System.out.println(this.intelligence);
		return this.intelligence;
	}
	
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getStealth() {
		System.out.println(this.stealth);
		return this.stealth;
	}
	public int getHealth() {
		System.out.println(this.health);
		return this.health;
	}
	
	public void attack(Human anotherHuman) {
		anotherHuman.health -= this.strength;
	}
	
	public Human() {
		this.strength = 3;
		this.intelligence = 3;
		this.stealth = 3;
	}
	
	public Human(int strength, int intelligence, int stealth) {
		this.strength = strength;
		this.intelligence = intelligence;
		this.stealth = stealth;
	}
}
