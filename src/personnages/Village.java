package personnages;

public class Village {

	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;

	public Village(final int NB_VILLAGEOIS_MAX, String nom, Gaulois chef) {
		villageois = new Gaulois[NB_VILLAGEOIS_MAX];
		this.nom = nom;
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
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
		System.out.println("Dans le village \"" + getNom() + "\" du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	public static void main(String[] argv) {
		
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village(30, "Village des irréductibles", abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois doublepolemix = new Gaulois("Doublepolémix", 3);
		Gaulois gaulois;
		
		
		village.ajouterVillageois(asterix);
		
		gaulois = village.trouverVillageois(1);
		System.out.println(gaulois.getNom());
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		
		village.afficherVillage();
		
		abraracourcix.setVillage(village);
		abraracourcix.sePresenter();
		
		asterix.setVillage(village);
		asterix.sePresenter();
		
		doublepolemix.setVillage(village);
		doublepolemix.sePresenter();
	}

}
