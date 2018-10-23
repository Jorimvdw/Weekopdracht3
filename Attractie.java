package Kermis;

public abstract class Attractie {	
	String naam;
	double prijs;
	int oppervlakte;
	double omzet;
	int verkochteKaartjes;
	
		
	Attractie (String naam, double prijs) {
		this.naam = naam;
		this.prijs = prijs;
	}

	public void draaien() {
		System.out.println("De attractie " + naam + " draait.");
		omzet += prijs;
		verkochteKaartjes++;
		Kassa.totaleOmzet += prijs;
		Kassa.totaalVerkochteKaartjes++;
	}
}
