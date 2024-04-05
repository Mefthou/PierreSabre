package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kobumacha",54);
		prof.direBonjour();
		prof.acheter("boison",12);
		prof.perdreArgent(12);
		prof.boire();
		prof.acheter("jeu",2);
		prof.perdreArgent(2);
		prof.acheter("kimono",50);
		System.out.println("\n");
		Commercant mariano = new Commercant("Mariano", 20);
		mariano.direBonjour();
		mariano.seFaireExtorquer();
		mariano.recevoir(15);
		mariano.boire();
	}

}
