package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int nbargent) {
		super(nom, "thé" , nbargent);
	}

	public int seFaireExtorquer() {
		int a = getNbargent();
		perdreArgent(getNbargent());
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return a;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler( argent + " sous ! je te remercie généreux donateur!");
	}

	
}
