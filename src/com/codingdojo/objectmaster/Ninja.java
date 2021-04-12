package com.codingdojo.objectmaster;

public class Ninja extends Human{
	
	public void attackedByWizard() {
		System.out.println("Ninja attacked by Wizard!");
		super.attackedByHuman();
	}
	public void attackedBySamurai() {
		System.out.println("Ninja attacked by Samurai!");
		super.attackedByHuman();
	}
	public void attackWizard() {
		System.out.println("Ninja attacked Wizard!");
	}
	public void attackSamurai() {
		System.out.println("Ninja attacked Samurai!");
	}
}
