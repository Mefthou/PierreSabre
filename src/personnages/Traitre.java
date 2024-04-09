package personnages;

import java.util.Random;

public class Traitre extends Samourais {
	
	private int nivTraitre = 0;
	
	public Traitre(String seigneur, String nom, String boissonfavorite, int nbargent, int honneur) 
	{
		super(seigneur, nom, boissonfavorite, nbargent, honneur);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("je suis fier de servir le seigneur" + seigneur);
		parler("Mais je suis un traître et mon niveau de traîtrise est : "+ nivTraitre + " Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if(nivTraitre < 3) {
			int a = commercant.getNbargent();
			int argentRanconner = a * 2/10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			nivTraitre ++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer "
					+ "! Donne-moi " + argentRanconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + " .");
		}else {
			parler("- Mince je ne peux plus rançonner personne sinon un samouraï risque de\r\n"
					+ "me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		Random random = new Random();
		if(nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif");
		}else {
			int indice = random.nextInt(nbConnaissance);
			Humain ami = memoire[indice];
			int don = getNbargent() * 1/20; 
			String nomAmi = ami.getNom();
			parler(" Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec"
					+ nomAmi);
			parler("- Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci " + getNom() + " Vous etes quelq'un de bien.");
			if(nivTraitre > 1) {
				nivTraitre --;
			}else {
				nivTraitre = nivTraitre;
			}
		}
	}
	
	
}
