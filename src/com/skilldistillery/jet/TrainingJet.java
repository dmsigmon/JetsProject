package com.skilldistillery.jet;

public class TrainingJet extends Jet {

	public TrainingJet() {
	}

	public TrainingJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TrainingJet [getSpeedinMach()=");
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

	@Override
	public void fly() {
		String displayJet = toString();
		System.out.println(displayJet);
		System.out.println("I fly for training purposes and have nothing special about me");
		System.out.println("This " + getModel() + " can fly for " + getRange() + " miles going " + getSpeed() + " mph!");
		System.out.println("That is about " + (double) getRange() / getSpeed() + " hours!");
	}
	

}
