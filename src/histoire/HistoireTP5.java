package histoire;

import personnages.Commercant;
import personnages.Grandmere;
import personnages.Humain;
import personnages.Ronin;
import personnages.Samourais;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60, 1);
		Samourais akimoto = new Samourais("Miyamoto","Akimoto","saké",80,1);

		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		
		marco.listeConnaissance();
		roro.listeConnaissance();
		yaku.listeConnaissance();
		
		System.out.println("\n");
		
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listeConnaissance();
		akimoto.boire("the");
		
		System.out.println("\n");
		
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100, 1);
		 masako.faireLeGentil();
		 masako.ranconner(kumi);
		 masako.ranconner(chonin);
		 masako.ranconner(marco);
		 akimoto.direBonjour();
		 masako.direBonjour();
		 masako.ranconner(kumi);
		 masako.faireConnaissanceAvec(yaku);
		 masako.faireLeGentil();
		 masako.faireConnaissanceAvec(roro);
		 
		 System.out.println("\n");
		 
		 Samourais akira = new Traitre("Miyamoto", "Akira", "whisky", 50, 1);
		 Ronin hiro = new Traitre("Miyamoto", "Hiro", "saké", 20, 1);
		 Humain nori = new Traitre("Miyamoto", "Nori", "whisky", 70, 1);

		 System.out.println("\n");
		 
		 Grandmere grandMere = new Grandmere("Grand-Mère" , 10);
		 grandMere.faireConnaissanceAvec(akimoto);
		 grandMere.faireConnaissanceAvec(yaku);
		 grandMere.faireConnaissanceAvec(masako);
		 grandMere.faireConnaissanceAvec(kumi);
		 grandMere.faireConnaissanceAvec(marco);
		 grandMere.faireConnaissanceAvec(chonin);
		 grandMere.ragoter();
	}

}
