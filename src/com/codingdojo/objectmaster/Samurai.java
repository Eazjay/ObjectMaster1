package com.codingdojo.objectmaster;

public class Samurai extends Human{
	
	public void attackNinja() {
		System.out.println("Samurai attacked Ninja!");
	}
	public void attackWizard() {
		System.out.println("Samurai attacked Wizard!");
	}
	public void attackedByWizard() {
		System.out.println("Samurai attacked by Wizard!");
		super.attackedByHuman();
	}
	public void attackedByNinja() {
		System.out.println("Samurai attacked by Ninja!");
		super.attackedByHuman();
	}
}
