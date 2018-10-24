package Kermis;
import java.util.Scanner;
	
public class Kermis {
	static Attractie[]attracties = { new Botsautos("Botsauto's", 2.50), new Spin("Spin", 2.25, 5), 
									 new Spiegelpaleis("Spiegelpaleis", 2.75), new Spookhuis("Spookhuis", 3.20), 
									 new Hawaii("Hawaii", 2.90, 10), new Ladderklimmen("Ladderklimmen", 5.00)};   
	
	Scanner scanner = new Scanner(System.in);
	BelastingInspecteur belastingInspecteur = new BelastingInspecteur();
		
	public void welkom () {
		boolean doorspelen = true;
		while (doorspelen) {			
			System.out.println("Welkom op de kermis, in welke attractie zou je willen?\n");
			System.out.println("1 voor de botsauto's \n2 voor de spin \n3 voor het spiegelpaleis "
						  + "\n4 voor het spookhuis \n5 voor de hawaii \n6 voor ladderklimmen");
						
			String invoer = scanner.nextLine();
			
			if (invoer.charAt(0) == 'o') {
				System.out.println(Kassa.toonTotaleOmzet());			
			} else if (invoer.charAt(0) == 'k') { 
				System.out.println(Kassa.toonTotaalVerkochteKaartjes());
			} else {
				int intvoer = Integer.parseInt(invoer)-1; 
					if (intvoer < 7) {
						attracties[intvoer].draaien(attracties[intvoer]);
						belastingInspecteur.belastingInnen();
				}				
			}
			
		}		
	}
}
	
