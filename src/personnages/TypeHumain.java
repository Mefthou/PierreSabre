package personnages;

public enum TypeHumain {
COMMERCANT("commercant"),GRANDMERE("grand-mere"),
RONIN("Ronin"),SAMOURAIS("samourais"),YAKUZA("yakuza");
	
	private String nom;
	
	
	TypeHumain(String nom){
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
