package Kermis;

public abstract class RisicoRijkeAttractie extends Attractie {
	int draaiLimiet;
	boolean kapot = false; 
	
	RisicoRijkeAttractie(String naam, double prijs, int draaiLimiet) {
		super(naam, prijs);
		this.draaiLimiet = draaiLimiet;
	}
	
	public void draaien(Attractie attractie) throws MoetGekeurdWorden {
			if (!kapot) {
				System.out.println("De attractie " + attractie.naam + " draait.\n");
				omzet += prijs;
				verkochteKaartjes++;
				if (verkochteKaartjes % draaiLimiet == 0) {
					kapot = true;					
				}		
			} else {
				throw new MoetGekeurdWorden();
			}
			
	}
}

class MoetGekeurdWorden extends Exception {

}