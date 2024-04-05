package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1;
	
	public Ronin(String nom, String boissonfavorite, int nbargent) {
		super(nom, boissonfavorite, nbargent);
	}
	
	public void donner(Commercant beneficiaire) {
		int donnation = (int) (getNbargent() * 0.10); 
		parler(beneficiaire.getNom() + " prend ces " + donnation + " sous");
		beneficiaire.recevoir(donnation);
		perdreArgent(donnation);
	}
	
}
