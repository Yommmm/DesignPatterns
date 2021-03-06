package com.design.structuralPatterns.decoratorPattern.BlindMonk;

public class Skill_Q extends Skill {

	private String skillName;

	public Skill_Q(Hero hero, String skillName) {
		super(hero);
		this.skillName = skillName;
	}

	@Override
	public void learnSkill() {
		System.out.println("学习了技能Q:" + skillName);
		super.learnSkill();
	}
}
