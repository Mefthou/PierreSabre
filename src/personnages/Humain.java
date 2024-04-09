package personnages;

public class Humain {
	
	private static final int NB_MAX_CONNAISSANCE = 30;
	
	private String nom;
	private String boissonfavorite;
	protected int nbargent;
	protected int nbConnaissance=0;
	protected Humain[] memoire;
	
	
	public Humain(String nom,String boissonfavorite,int nbargent) {
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.nbargent = nbargent;
		memoire = new Humain[NB_MAX_CONNAISSANCE];
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
		String message = "Bonjour ! je m'appelle " + nom + " et j'aime boire du "+ boissonfavorite;
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
	
	public void repondre(Humain autreHumain) {
		this.direBonjour();
		memoriser(autreHumain);
	}
	
	
	public void memoriser(Humain autreHumain) {
		if(nbConnaissance < memoire.length) {
			memoire[nbConnaissance] = autreHumain ;
			nbConnaissance ++ ;
		}else {
			for(int i=0; i<memoire.length - 1; i++) {
				memoire[i]= memoire[i+1];
			}
			memoire[memoire.length - 1]= autreHumain;
		}
		
	}
	
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	public void listeConnaissance() {
		parler(" Je connais beaucoup de monde dont : ");
		for(int i=0; i<nbConnaissance; i++) {
			System.out.println(memoire[i].getNom() + ",");
		}
	}



}
