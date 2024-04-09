package personnages;

public class Samourais extends Ronin {
	
	protected String seigneur;
	
	public Samourais(String seigneur, String nom, String boissonfavorite, int nbargent, int honneur) 
	{
		super(nom, boissonfavorite, nbargent, honneur);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("je suis fier de servir le seigneur" + seigneur);
	}
	
	
	public void boire(String boisson) {
		parler("Q'est ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
		
	}
}
