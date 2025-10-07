package personnages;

public class Gaulois {

	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}

	public void frapper(Romain romain) {
		System.out.println(this.nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(this.force * this.effetPotion / 3);
		if (this.effetPotion > 1)
			this.effetPotion--;
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}

	public void sePresenter() {
		if (this == village.getChef())
			System.out.println("Le gaulois " + this.getNom() + " : \"Bonjour, je m'appelle " + this.getNom()
					+ ". Je suis le chef du village " + village.getNom() + ".\"");

		int i = 1;
		while (village.trouverVillageois(i) != null) {
			if (this == village.trouverVillageois(i)) {
				System.out.println("Le gaulois " + this.getNom() + " : \"Bonjour, je m'appelle " + this.getNom()
						+ ". J'habite le village " + village.getNom() + ".\"");
				break;
			}
			i++;
		}

		if (village.trouverVillageois(i) == null)
			System.out.println("Le gaulois " + this.getNom() + " : \"Bonjour, je m'appelle " + this.getNom()
					+ ". Je voyage de village en village " + village.getNom() + ".\"");

	}

	public static void main(String[] argv) {

		Gaulois asterix;

		asterix = new Gaulois("Astérix", 8);

		System.out.println(asterix.getNom());

	}

}
