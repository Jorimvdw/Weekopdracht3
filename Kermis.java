package Kermis;
import java.util.Scanner;

public class Kermis {
	Scanner scanner = new Scanner(System.in);
	Botsautos botsautos = new Botsautos("Botsauto's", 2.50);
	Spin spin = new Spin("Spin", 2.25, 5);
	Spiegelpaleis spiegelpaleis = new Spiegelpaleis("Spiegelpaleis", 2.75);
	Spookhuis spookhuis = new Spookhuis("Spookhuis", 3.20);
	Hawaii hawaii = new Hawaii("Hawaii", 2.90, 10);
	Ladderklimmen ladderklimmen = new Ladderklimmen("Ladderklimmen", 5.00);
	
	

	
	
	public void welkom () {
		boolean doorspelen = true;
		while (doorspelen) {
			System.out.println("Welkom op de kermis, in welke attractie zou je willen?\n");
			System.out.println("1 voor de botsauto's \n2 voor de spin \n3 voor het spiegelpaleis "
						  + "\n4 voor het spookhuis \n5 voor de hawaii \n6 voor ladderklimmen");
			
			String invoer = scanner.nextLine();
			
			if (invoer.charAt(0) == 'o') {
				Kassa.toonTotaleOmzet();			
			} else if (invoer.charAt(0) == 'k') { 
				Kassa.toonTotaalVerkochteKaartjes();
			} else {
				switch(invoer) {
					case "1":
						botsautos.draaien();
						break;
					case "2":
						spin.draaien();
						break;
					case "3":
						spiegelpaleis.draaien();
						break;
					case "4":
						spookhuis.draaien();
					break;
					case "5":
						hawaii.draaien();
						break;
					case "6":
						ladderklimmen.draaien();
						break;
				}
			}
		}		
	}
}
	
