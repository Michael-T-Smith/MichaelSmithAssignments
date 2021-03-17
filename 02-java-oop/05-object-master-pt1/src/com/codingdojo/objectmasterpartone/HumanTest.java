package com.codingdojo.objectmasterpartone;

public class HumanTest {
	public static void main(String[] args) {
		Human ninja = new Human();
		Human samuari = new Human();
		samuari.getHealth();
		ninja.attack(samuari);
		samuari.getHealth();
		
	}
}
