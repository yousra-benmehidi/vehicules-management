package exo3;

public class test {

	public static void main(String[] args) {
		//public Voiture(String marque,int dateAchat,int prix, int nbrPortes,int puissance, int kilometrage) 
		Voiture v = new Voiture("oui",1,100000,4,200,120000);
		Voiture v1 = new Voiture("non",10,100000,4,300,140000);
        Voiture.echangeVoiture(v,v1);
	}

}
