package com.skilldistillery.jet;

import java.util.Scanner;

public class JetsApplication {
	private static AirField aF = new AirField();

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();

		app.launch();

	}

	public void launch() {
		menu();
	}

	public void menu() {
		Scanner kb = new Scanner(System.in);
		boolean flag = true;
		while (flag) {

			System.out.println("Please Select a Menu Option [1-9]");
			System.out.println();
			System.out.println("************************************");
			System.out.println("---------------MENU----------------");
			System.out.println("	1. List Fleet");
			System.out.println("	2. Fly All Jets");
			System.out.println("	3. view Fastest Jet");
			System.out.println("	4. view jet with longest range");
			System.out.println("	5. load all Cargo Jets");
			System.out.println("	6. Dog Fight");
			System.out.println("	7. Add a FighterJet to fleet");
			System.out.println("	8. Remove jet from Fleet");
			System.out.println("	9. Quit");

			int menuSelection = kb.nextInt();
			
			if (menuSelection == 1) {
				aF.listFleet();
				System.out.println();
//			    break;

			} else if (menuSelection == 2) {
				//works
				aF.flyAllJets();
				System.out.println();
//				break;
			} else if (menuSelection == 3) {
				//works
				aF.viewFastestJet();
				System.out.println();

			} else if (menuSelection == 4) {
//				works
				aF.viewLongestRange();
				System.out.println();

			} else if (menuSelection == 5) {
//				works
				aF.loadCargoJets();
				System.out.println();

			} else if (menuSelection == 6) {
//				works
				System.out.println(" its not the size of the dog in the fight but the size of the fight in the dog ");
				System.out.println();
			} else if (menuSelection == 7) {
				Jet newJet = new FighterJet("FJ3", 4000, 2000, 100000000, 3);
				aF.addJet(newJet);
				System.out.println();

			} else if (menuSelection == 8) {
				aF.deleteModel(kb);
				System.out.println();

			} else if (menuSelection == 9) {
				flag = false;
//				break;
			}

		}

		kb.close();
	}
}
