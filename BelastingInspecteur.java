package Kermis;
import java.util.Random;

public class BelastingInspecteur {
	Random random = new Random();
	int wanneerLangs = random.nextInt(15)+1;
	double geindeBelasting;
	
	void belastingInnen() {
		
		if (wanneerLangs == Kassa.toonTotaalVerkochteKaartjes()) {
			System.out.println("De belastinginspecteur is langsgeweest");
			for (int a = 0 ; a < Kermis.attracties.length ; a++) {
				if (Kermis.attracties[a] instanceof GokAttractie) {					
					System.out.println("Hij haalt kansspelbelasting op bij de attractie: " + Kermis.attracties[a].naam);
					geindeBelasting += Kermis.attracties[a].gereserveerdeOmzet;	
					Kermis.attracties[a].omzet -= Kermis.attracties[a].gereserveerdeOmzet;
					Kermis.attracties[a].gereserveerdeOmzet = 0.00;					
				}
			}
			System.out.println("In totaal neemt hij " + geindeBelasting + " mee");
			Kassa.aantalBezoekenBelastingInspecteur++;
			geindeBelasting = 0.00;
		}
		
		if (Kassa.toonTotaalVerkochteKaartjes() % 15 == 0) {
			wanneerLangs = random.nextInt(15)+1 + (Kassa.aantalBezoekenBelastingInspecteur*15);	
		}
		
	}	
}
