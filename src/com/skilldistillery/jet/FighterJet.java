package com.skilldistillery.jet;

public class FighterJet extends Jet implements CombatReady {
	private int numOfGuns;

	public FighterJet() {

	}

	public void fight() {
		System.out.println("fighting the enemy");
	}

	public FighterJet(String model, double speed, int range, long price, int numOfGuns) {
		super(model, speed, range, price);
		this.numOfGuns = numOfGuns;
	}

	public int getNumOfGuns() {
		return numOfGuns;
	}

	public void setNumOfGuns(int numOfGuns) {
		this.numOfGuns = numOfGuns;
	}

	@Override
	public void fly() {
		String displayJet = toString();
		System.out.println(displayJet);
		System.out.println("This " + getModel() + " can fly for " + getRange() + " miles going " + getSpeed() + " mph!");
		System.out.println("That is about " + (double) getRange() / getSpeed() + " hours!");
		System.out.println("I fly fast but not for long");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FighterJet [numOfGuns=");
		builder.append(numOfGuns);
		builder.append(", getSpeedinMach()=");
		builder.append(getSpeedinMach());
		builder.append(", getModel()=");
		builder.append(getModel());
		builder.append(", getSpeed()=");
		builder.append(getSpeed());
		builder.append(", getRange()=");
		builder.append(getRange());
		builder.append(", getPrice()=");
		builder.append(getPrice());
		builder.append("]");
		return builder.toString();
	}
}
