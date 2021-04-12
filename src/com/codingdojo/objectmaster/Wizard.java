package com.codingdojo.objectmaster;

public class Wizard extends Human{
	
	public void attackNinja() {
		System.out.println("Wizard attacked Ninja!");
	}
	public void attackSamurai() {
		System.out.println("Wizard attacked Samurai!");
	}
	public void attackedByNinja() {
		System.out.println("Wizard attacked by Ninja!");
		super.attackedByHuman();
	}
	public void attackedBySamurai() {
		System.out.println("Wizard attacked by Samurai!");
		super.attackedByHuman();
	}
}
