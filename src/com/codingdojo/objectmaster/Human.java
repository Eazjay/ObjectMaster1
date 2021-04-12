package com.codingdojo.objectmaster;

public class Human {
	int health = 100;
	int strength = 3;
	int stealth = 3;
	int intelligence = 3;
	
	public void displayHealth() {
		int showHealth = health;
		System.out.println("Health is: " + showHealth);
	}
	public int attackedByHuman() {
		int humanHealth = health -= strength;
		return humanHealth;
	}
}
