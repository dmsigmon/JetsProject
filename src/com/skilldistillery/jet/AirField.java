package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private int numOfJets;
	private List<Jet> jets = new ArrayList<>();

	public AirField() {
		super();
		readTheFile("firstFiveJets");
	}
	

	private void readTheFile(String firstFiveJets) {
		System.out.println("inside readfile method");
		try {
			FileReader fr = new FileReader(firstFiveJets);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] splitLine = line.split(",");
				//for (int i = 0; i < splitLine.length; i++) {
					if (splitLine[0].contains("FJ")) {
						Jet fighterJet = new FighterJet(splitLine[0], Double.parseDouble(splitLine[1]),
								Integer.parseInt(splitLine[2]), Long.parseLong(splitLine[3]),
								Integer.parseInt(splitLine[4]));
						jets.add(fighterJet);
						numOfJets ++;
					} else if (splitLine[0].contains("CP")) {
						Jet cargoJet = new CargoPlane(splitLine[0], Double.parseDouble(splitLine[1]),
								Integer.parseInt(splitLine[2]), Long.parseLong(splitLine[3]),
								Integer.parseInt(splitLine[4]));
						jets.add(cargoJet);
						numOfJets ++;
					} else if (splitLine[0].contains("PP")) {
						Jet PassengerJet = new PassengerJet(splitLine[0], Double.parseDouble(splitLine[1]),
								Integer.parseInt(splitLine[2]), Long.parseLong(splitLine[3]),
								Integer.parseInt(splitLine[4]));
						jets.add(PassengerJet);
						numOfJets ++;
					}
				//}
			}
			System.out.println(jets);
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
}
