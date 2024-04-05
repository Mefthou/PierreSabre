package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kobumacha",54);
		prof.direBonjour();
		prof.acheter("boison",12);
		prof.perdreAgent(12);
		prof.boire();
		prof.acheter("jeu",2);
		prof.perdreAgent(2);
		prof.acheter("kimono",50);
	}

}
