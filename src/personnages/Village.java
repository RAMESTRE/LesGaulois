package personnages;

public class Village {

	private String nom;
	private int nbVillageois = 0;
	private Gaulois[] chef = new Gaulois[1];
	private Gaulois[] villageois;

	public Village(final int NB_VILLAGEOIS_MAX) {
		villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}
	
	public String getNom() {
		return nom;
	}

	public Gaulois[] getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois <= nbVillageois && numVillageois > 0 && villageois[numVillageois - 1] != null) {
			return villageois[numVillageois - 1];
		} else {
			System.out.println("Il n'y a pas autant d'habitants dans notre village");
			return null;
		}
	}
	
	public void afficherVillage() {
		
	}

}
