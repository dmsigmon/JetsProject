package com.skilldistillery.jet;

public class CargoJet extends Jet implements CargoCarrier {
	private int lbsOfCargo;

	public CargoJet(String model, double speed, int range, long price, int lbsOfCargo) {
		super(model, speed, range, price);
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
		System.out.println(getModel() +  " is loading cargo");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CargoPlane [lbsOfCargo=");
		builder.append(lbsOfCargo);
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + lbsOfCargo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CargoJet other = (CargoJet) obj;
		if (lbsOfCargo != other.lbsOfCargo)
			return false;
		return true;
	}
	
	
	
}