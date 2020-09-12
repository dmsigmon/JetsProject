package com.skilldistillery.jet;

public class CargoPlane extends Jet implements CargoCarrier {
	private int lbsOfCargo;

	public CargoPlane(String model, double speed, int range, long price, int lbsOfCargo) {
		super(model, speed, range, price);
		this.lbsOfCargo = lbsOfCargo;
	}

	public CargoPlane(int lbsOfCargo) {
		super();
		this.lbsOfCargo = lbsOfCargo;
	}

	public int getLbsOfCargo() {
		return lbsOfCargo;
	}

	public void setLbsOfCargo(int lbsOfCargo) {
		this.lbsOfCargo = lbsOfCargo;
	}

	@Override
	public void fly() {
		String displayJet = toString();
		System.out.println(displayJet);
		System.out
				.println("This " + getModel() + " can fly for " + getRange() + " miles going " + getSpeed() + " mph!");
		System.out.println("That is about " + (double) getRange() / getSpeed() + " hours!");
		System.out.println("I fly slow but for long distances");
	}

	@Override
	public void loadCargo() {
	}
	
}