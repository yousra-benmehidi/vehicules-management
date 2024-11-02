package exo3;

public class Avion extends Vehicule {
	private int heureVol;
	//const
	public Avion(String marque,int dateAchat,int prix,int heuresVol) {
		super(marque,dateAchat,prix);
		this.heureVol=heureVol;
	}
	//setters
	public void setHeureVol(int heureVol) {
		this.heureVol=heureVol;
	}
	//getters
	public int getHeureVol() {
		return heureVol;
	}
	@Override
	public double calculPrix() {
		int h=heureVol/500;
		if(h!=0) {
			return super.calculPrix()-this.getPrix()*0.08*h;
		}
		else
			return super.calculPrix();
	}
	@Override
	public void afficher() {
		System.out.println("information sur l'avion:");
		super.afficher();
		System.out.println("heures total de vol: "+heureVol+" heures\n");
	}
}
