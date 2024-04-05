package personnages;

public class Humain {
	
	private String nom;
	private String boissonfavorite;
	protected int nbargent;
	
	public Humain(String nom,String boissonfavorite,int nbargent) {
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.nbargent = nbargent;
	}
	
	
	public String getNom() {
		return nom;
	}
	public int getNbargent() {
		return nbargent;
	}
	
	public void parler(String message) {
		System.out.println(nom + " - " + message);
	}
	
	public void direBonjour() {
		String message = "Bonjour ! je m'appelle " + nom + "et j'aime boire du "+ boissonfavorite;
		parler(message);
	}
	
	public void boire() {
		String message = "Mmmm, un bon verre de " + boissonfavorite + "! GLOUPS !";
		parler(message);
	}
	
	public void acheter(String bien, int prix) {
		if(nbargent>prix) {
			String message = "j'ai " + nbargent + " sous en poche je vais pouvoir m'offrir " 
		+ bien + " a" + prix + " sous " ;
			parler(message);
		}else {
			String message = "je n'ai plus que " + nbargent + " sous en poche je ne peut pas m'offrir un " 
		+ bien + " a" + prix + " sous " ;
			parler(message);
		}
	}
	
	public void gagnerArgent(int nbargentgagner) {
		nbargent += nbargentgagner;
	}
	
	public void perdreArgent(int nbargentperdu) {
		nbargent -= nbargentperdu;
	}
	
	public void argentHumain() {
		String message = "j'ai " + nbargent + " sous";
		parler(message);
	}


}
