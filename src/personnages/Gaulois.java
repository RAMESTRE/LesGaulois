package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = 1;
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

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}

	public void frapper(Romain romain) {
		System.out.println(this.nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(this.force / 3);
	}

	public void boirePotion(int forcePotion) {

	}

	public static void main(String[] argv) {

		Gaulois asterix;

		asterix = new Gaulois("Astérix", 8);

		System.out.println(asterix.getNom());

	}

}
