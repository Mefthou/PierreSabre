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
	
	public void provoquer(Yakuza adversaire){
		int force = honneur*2;
		if( force >= adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			honneur += 1;
			gagnerArgent(adversaire.nbargent);
			perdreArgent(adversaire.nbargent);
			parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
		}else {
			honneur -= 1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(getNbargent());
			perdreArgent(getNbargent());
		}
	}
}
