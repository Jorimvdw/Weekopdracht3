package Kermis;

interface GokAttractie {
	
	default void KansSpelBelastingReserveren(Attractie attractie) {
		attractie.gereserveerdeOmzet = attractie.omzet * 0.3;
	}	
}

