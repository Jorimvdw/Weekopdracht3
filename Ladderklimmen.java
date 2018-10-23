package Kermis;

public class Ladderklimmen extends Attractie implements GokAttractie {
	double KansSpelBelasting;
	
	Ladderklimmen(String naam, double prijs) {
		super(naam, prijs);
	}

	public void draaien() {
		System.out.println("De attractie " + naam + " draait.");
		omzet += prijs;
		verkochteKaartjes++;
		Kassa.totaleOmzet += prijs;
		Kassa.totaalVerkochteKaartjes++;
		KansSpelBelastingReserveren();
	}
	
	public void KansSpelBelastingReserveren() {
		KansSpelBelasting = omzet * 0.3;
	}

}
