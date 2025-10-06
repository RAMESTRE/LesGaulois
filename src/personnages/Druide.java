package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;

	public Druide(String string, int force) {
		this.nom = string;
		this.force = force;
		this.chaudron = new Chaudron();
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void booster(Gaulois gaulois) {
		boolean contientPotion = chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();

		if (contientPotion) {
			if (nomGaulois == "Obélix")
				parler("Non " + nomGaulois + " Non !... Et tu le sais très bien !");
			else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				parler("Tiens " + nomGaulois + " un peu de potion magique.");
			}
		} else
			parler("Désolé " + nomGaulois + " il n'y a plus une seule goutte de potion.");
	}

	public void fabriquerPotion(int qte, int forcePotion) {
		chaudron.remplirChaudron(qte, forcePotion);
		parler("J'ai concocté " + qte + " doses de potion magique. Elle a une force de " + forcePotion + ".");
	}

	public String getNom() {
		return nom;
	}
}
