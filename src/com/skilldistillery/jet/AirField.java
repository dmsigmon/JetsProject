package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	private double fastestSpeed = 0.0;
	private Jet fastestJet;
	private double longestRange = 0;
	private Jet longestRangeJet;
	private int numOfJets;
	private List<Jet> jets = new ArrayList<>();

	
	public void listFleet() {
		for (Jet jet : jets) {
			System.out.println(jet.toString());
		}
	}
	
	public void deleteModel(Scanner kb) {
		showModels();
		System.out.println("type the model you wish to delete");
		String deleteModel = kb.next();
		for (Jet jet : jets) {
			if(jet.getModel().contains(deleteModel)){
				jets.remove(jet);
				break;
			}
		}
	}
	
	public void showModels() {
		for (Jet jet : jets) {
			System.out.println(jet.getModel());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public AirField() {
		super();
		readTheFile("firstFiveJets");
	}
	
	public void removeJet(int i) {
		
		
	}

	public void flyAllJets() {
		for (Jet jet : jets) {
			jet.fly();
		}
	}

	public void loadCargoJets() {
		for (Jet jet : jets) {
			if (jet instanceof CargoCarrier) {
				jet.loadCargo();
			}
		}
	}

	public void viewFastestJet() {
		for (Jet jet : jets) {
			if ( jet.getSpeed() > fastestSpeed) {
				fastestSpeed = jet.getSpeed();
				fastestJet = jet;
			}
		}
		System.out.println(fastestJet);
	}

	public void viewLongestRange() {
		for (Jet jet : jets) {
			if (longestRange < jet.getRange()) {
				longestRange = jet.getRange();
				longestRangeJet = jet;
			}
		}
		System.out.println(longestRangeJet);
	}

	private void readTheFile(String firstFiveJets) {
		try {
			FileReader fr = new FileReader(firstFiveJets);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] splitLine = line.split(",");
				if (splitLine[0].contains("FJ")) {
					Jet fighterJet = new FighterJet(splitLine[0], Double.parseDouble(splitLine[1]),
							Integer.parseInt(splitLine[2]), Long.parseLong(splitLine[3]),
							Integer.parseInt(splitLine[4]));
					jets.add(fighterJet);
					numOfJets++;
				} else if (splitLine[0].contains("CP")) {
					Jet cargoJet = new CargoJet(splitLine[0], Double.parseDouble(splitLine[1]),
							Integer.parseInt(splitLine[2]), Long.parseLong(splitLine[3]),
							Integer.parseInt(splitLine[4]));
					jets.add(cargoJet);
					numOfJets++;
				} else if (splitLine[0].contains("PP")) {
					Jet PassengerJet = new PassengerJet(splitLine[0], Double.parseDouble(splitLine[1]),
							Integer.parseInt(splitLine[2]), Long.parseLong(splitLine[3]),
							Integer.parseInt(splitLine[4]));
					jets.add(PassengerJet);
					numOfJets++;
				}
			}
			// System.out.println(jets);
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void addJet(Jet jet) {
		jets.add(jet);
	}

	public int getNumOfJets() {
		return numOfJets;
	}

	public void setNumOfJets(int numOfJets) {
		this.numOfJets = numOfJets;
	}

	public List<Jet> getJets() {
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}

	public int size() {
		return jets.size();
	}

}
