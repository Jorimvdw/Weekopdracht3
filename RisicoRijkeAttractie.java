package Kermis;

public abstract class RisicoRijkeAttractie extends Attractie {
	int draaiLimiet;
	
	RisicoRijkeAttractie(String naam, double prijs, int draaiLimiet) {
		super(naam, prijs);
		this.draaiLimiet = draaiLimiet;
		opstellingsKeuring();
	}

	public void opstellingsKeuring() {
		System.out.println("De " + naam + " is gekeurd en klaar voor gebruik");
	}
	
	public void draaien() {
			System.out.println("De attractie " + naam + " draait.");
			omzet += prijs;
			verkochteKaartjes++;
		//	Kassa.totaleOmzet += prijs;
		//	Kassa.totaalVerkochteKaartjes++;
			if (verkochteKaartjes % draaiLimiet == 0) {
				opstellingsKeuring();
			}
		
		
	}
}


