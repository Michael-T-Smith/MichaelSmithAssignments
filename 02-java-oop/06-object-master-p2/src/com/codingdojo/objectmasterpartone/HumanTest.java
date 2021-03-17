package com.codingdojo.objectmasterpartone;

public class HumanTest {
	public static void main(String[] args) {
		Wizard merlin = new Wizard();
		Ninja ryu = new Ninja();
		Samurai genjin = new Samurai();
		merlin.displayHealth();
		ryu.displayHealth();
		genjin.displayHealth();
		
		merlin.fireball(ryu);
		ryu.displayHealth();
		merlin.heal(ryu);
		ryu.displayHealth();
		ryu.steal(merlin);
		merlin.displayHealth();
		ryu.displayHealth();
		genjin.displayHealth();
		genjin.deathBlow(merlin);
		merlin.displayHealth();
		genjin.displayHealth();
		genjin.meditate();
		genjin.displayHealth();
	

	}
}
