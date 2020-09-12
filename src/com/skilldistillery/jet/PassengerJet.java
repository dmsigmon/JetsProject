package com.skilldistillery.jet;

public class PassengerJet extends Jet {
	private int numOfPassengers;
	

	public PassengerJet() {
		
	}

	public PassengerJet(String model, double speed, int range, long price, int numOfPassengers) {
		super(model, speed, range, price);
		this.numOfPassengers = numOfPassengers;
	}
	
	@Override
	public void fly() {
		String displayJet = toString();
		System.out.println(displayJet);
		System.out.println("This " + getModel() + " can fly for " + getRange() + " miles going " + getSpeed() + " mph!");
		System.out.println("That is about " + (double)getRange()/getSpeed() + " hours!");
		System.out.println("I fly passengers all over the world");
	}

	public int getNumOfPassengers() {
		return numOfPassengers;
	}

	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}

	public PassengerJet(int numOfPassengers) {
		super();
		this.numOfPassengers = numOfPassengers;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PassengerJet [numOfPassengers=");
		builder.append(numOfPassengers);
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
