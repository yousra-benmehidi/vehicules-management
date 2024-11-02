package exo3;

public class Vehicule {
	//attributs
	private String marque;
	private int prix,dateAchat;
	//constructeur
	public Vehicule(String marque,int dateAchat,int prix) {
		this.marque=marque;
		this.prix=prix;
		this.dateAchat=dateAchat;
	}
	//setters
	public void setMarque(String marque) {
		this.marque=marque;
	}
	public void setPrix(int prix) {
		this.prix=prix;
	}
	public void setDate(int dateAchat) {
		this.dateAchat=dateAchat;
	}
	//getters
	public String getMarque() {
		return marque;
	}
	public int getPrix() {
		return prix;
	}
	public int getDate() {
		return dateAchat;
	}
	//methodes
	public void afficher() {
		System.out.println("marque: "+marque+"\ndate d'achat du vehicule: "+dateAchat+"\nprix du vehicule: "+prix);
	}
	public double calculPrix() {
		int d=2023-dateAchat;
		if(d!=0) {
			return prix-prix*0.05*d;
		}
		else
			return prix;
	}
	@Override
	public boolean equals(Vehicule v) {
		/*if (this==null|| getClass() != v.getClass())
			return false;
		if(this==v) 
			super.equals(v);*/
		}
}
