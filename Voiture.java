package exo3;

public class Voiture extends Vehicule {
	//attributs
	private int nbrPortes, puissance, kilometrage;
	//constructeur
	public Voiture(String marque,int dateAchat,int prix, int nbrPortes,int puissance, int kilometrage) {
		super(marque,dateAchat,prix);
		this.nbrPortes=nbrPortes;
		this.puissance=puissance;
		this.kilometrage=kilometrage;
	}
	//setters
	public void setNbrPortes(int nbrPortes) {
		this.nbrPortes=nbrPortes;
	}
	public void setPuissance(int puissance) {
		this.puissance=puissance;
	}
	public void setKilometrage(int kilometrage) {
		this.kilometrage=kilometrage;
	}
	//getters
	public int getNbrPortes() {
		return  nbrPortes;
	}
	public int getPuissance() {
		return puissance;
	}
	public int getKilometrage() {
		return kilometrage;
	}
	//redef
	@Override
	public double calculPrix() {
		int k=kilometrage/100000;
		if(k!=0) {
			return super.calculPrix()-this.getPrix()*k*0.1;
		}
		else
			return super.calculPrix();
	}
	@Override
	public void afficher() {
		System.out.println("information sur la voiture:");
		super.afficher();
		System.out.println("nombre de portes: "+nbrPortes+"\npuissance: "+puissance+" chevaux\nkilometrage: "+kilometrage+" km\n");
	}
	//methode sup
	public static int diffKil(Voiture a,Voiture b) {
		if(a.kilometrage>b.kilometrage)
			return a.kilometrage-b.kilometrage;
		else
			return b.kilometrage-a.kilometrage;
	}
	public static int diffPuiss(Voiture a,Voiture b) {
		if(a.puissance>b.puissance)
			return a.puissance-b.puissance;
		else
			return b.puissance-a.puissance;
	}
	public static int diffPrix(Voiture a,Voiture b) {
		if(a.getPrix()>b.getPrix())
			return a.getPrix()-b.getPrix();
		else
			return b.getPrix()-a.getPrix();
	}
	public static void echangeVoiture(Voiture a, Voiture b) {
		if(diffPuiss(a,b)<=150&& diffPuiss(a,b)>=100&&diffKil(a,b)<=30000&&a.nbrPortes==b.nbrPortes&& diffPrix(a,b)<=3000) {
			System.out.println("on peut faire un echange");
		}
		else
			System.out.println("on ne peut pas faire un echange");
	}
}
