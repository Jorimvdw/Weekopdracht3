package Kermis;
import java.util.Scanner;
	
public class Kermis {
	static Attractie[]attracties = { new Botsautos("Botsauto's", 2.50), new Spin("Spin", 2.25, 5), 
									 new Spiegelpaleis("Spiegelpaleis", 2.75), new Spookhuis("Spookhuis", 3.20), 
									 new Hawaii("Hawaii", 2.90, 10), new Ladderklimmen("Ladderklimmen", 5.00)};   
	
	Scanner scanner = new Scanner(System.in);
	BelastingInspecteur belastingInspecteur = new BelastingInspecteur();
	boolean doorspelen = true;
	
	public void welkom () {
		System.out.println("De kermis is opgebouwd en alle risicovolle attracties zijn gekeurd.");
		System.out.println("===================================================================");
		System.out.println("Welkom op de kermis!\n");			
								
		while (doorspelen) {
			invoerMenu();	
		}			
	}
			
		public void invoerMenu() {
			System.out.println("In welke attractie zou je willen?\n");
			System.out.println("1 voor de botsauto's \n2 voor de spin \n3 voor het spiegelpaleis "
					  + "\n4 voor het spookhuis \n5 voor de hawaii \n6 voor ladderklimmen");
			System.out.println("\nVoor de totale omzet, kies 'o' \nVoor het totaal aantal verkochte kaartjes, kies 'k'\nKies 'q' om de kermis te verlaten");
					
			String invoer = scanner.nextLine();
				 	
				if (invoer.charAt(0) == 'o') {
					System.out.println(Kassa.toonTotaleOmzet());			
				} else if (invoer.charAt(0) == 'k') { 
					System.out.println(Kassa.toonTotaalVerkochteKaartjes());
				} else if (invoer.charAt(0) == 'q') {
					System.out.println("Bedankt voor je bezoek");
					doorspelen = false;
				} else if (invoer.charAt(0) == '1' || invoer.charAt(0) == '2' || invoer.charAt(0) == '3'
						|| invoer.charAt(0) == '4' || invoer.charAt(0) == '5' || invoer.charAt(0) == '6') {
					int intvoer = Integer.parseInt(invoer)-1; 
					
					try {
						attracties[intvoer].draaien(attracties[intvoer]);
					} catch (MoetGekeurdWorden mgw) {
						System.out.println("Deze attractie moet eerst gekeurd worden, voordat hij mag draaien.\n"
								+ "Druk op 'm' om een monteur langs te sturen");
						String invoer2 = scanner.nextLine();
						if (invoer2.charAt(0) == 'm') {
							System.out.println("De monteur is langsgeweest");
							new Monteur().attractieControle((RisicoRijkeAttractie)attracties[intvoer]);
						}
					}					
					belastingInspecteur.belastingInnen();
				  }								
		}
}

	
