package personnages;

import java.util.Random;
public class Grandmere extends Humain {

	
	public Grandmere(String nom, int nbargent) {
		super(nom, "tisane", nbargent);
	}
	
	
	public void memoriser(Humain autreHumain) {
		if(nbConnaissance < 5) {
			memoire[nbConnaissance] = autreHumain ;
			nbConnaissance ++ ;
		}else {
			for(int i=0; i<5 - 1; i++) {
				memoire[i]= memoire[i+1];
			}
			memoire[memoire.length - 1]= autreHumain;
		}
		
	}
	
	private String humainHasard() {
		Random random = new Random();
		TypeHumain[] types = TypeHumain.values();
		return types[random.nextInt(types.length)].toString();
	}
	
	public void ragoter() {
		String TypeHumain = "";
		Humain humain;
		for(int i=0; i<nbConnaissance; i++) {
			humain = memoire[i];
			if(humain instanceof Traitre) {
				parler("Je sais que "+ humain.getNom() +" est un Traitre. Petit chenapan ");
			}else {
				parler("Je croit que "+ humain.getNom() +" est un "+ humainHasard());
			}
		}
	}

}
