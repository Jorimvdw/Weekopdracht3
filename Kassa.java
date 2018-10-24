package Kermis;

public class Kassa {
	static int aantalBezoekenBelastingInspecteur;
	
	public static double toonTotaleOmzet() {
		double totaleOmzet = 0.00;
		for (int a = 0 ; a < Kermis.attracties.length ; a++) {
			totaleOmzet += Kermis.attracties[a].omzet;
		}
		return totaleOmzet;		
	}
	
	public static int toonTotaalVerkochteKaartjes() {
		int totaalVerkochteKaartjes = 0;
		for (int a = 0 ; a < Kermis.attracties.length ; a++) {
			totaalVerkochteKaartjes += Kermis.attracties[a].verkochteKaartjes;
		}
		return totaalVerkochteKaartjes;
	}
	
}

