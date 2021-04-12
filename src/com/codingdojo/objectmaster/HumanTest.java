package com.codingdojo.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		
		w.attackedByNinja();
		w.attackedBySamurai();
		w.attackNinja();
		w.attackSamurai();
		w.displayHealth();
		
		
		Ninja n = new Ninja();
		
		n.attackedBySamurai();
		n.attackedByWizard();
		n.attackSamurai();
		n.attackWizard();
		n.displayHealth();
		
		Samurai s = new Samurai();
		
		s.attackedByNinja();
		s.attackedByWizard();
		s.attackNinja();
		s.attackWizard();
		s.displayHealth();
	}
}
