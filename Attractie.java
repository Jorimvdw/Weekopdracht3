package Kermis;

public abstract class Attractie {	
	String naam;
	double prijs;
	int oppervlakte;
	double omzet;
	int verkochteKaartjes;
	double gereserveerdeOmzet;
	
		
	Attractie (String naam, double prijs) {
		this.naam = naam;
		this.prijs = prijs;
	}

	public void draaien(Attractie attractie) throws MoetGekeurdWorden {
		System.out.println("De attractie " + naam + " draait.\n");
		omzet += prijs;
		verkochteKaartjes++;
		if (attractie instanceof GokAttractie) {
			((GokAttractie)attractie).KansSpelBelastingReserveren(attractie);
		}
	}
}

class Botsautos extends Attractie {

	Botsautos(String naam, double prijs) {
		super(naam, prijs);
	}
}

class Spin extends RisicoRijkeAttractie implements GokAttractie {
	
	Spin(String naam, double prijs, int draaiLimiet) {
		super(naam, prijs, draaiLimiet);
	}
}

class Spiegelpaleis extends Attractie {

	Spiegelpaleis(String naam, double prijs) {
		super(naam, prijs);
	}
}

class Spookhuis extends Attractie{

	Spookhuis(String naam, double prijs) {
		super(naam, prijs);		
	}
}

class Hawaii extends RisicoRijkeAttractie {
	Hawaii(String naam, double prijs, int draaiLimiet) {
		super(naam, prijs, draaiLimiet);		
	}
}

class Ladderklimmen extends Attractie implements GokAttractie {
	
	Ladderklimmen(String naam, double prijs) {
		super(naam, prijs);
	}
}


