package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String text) {
		System.out.println(prendreParole() + "\"" + text + "\"");
	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le romain " + nom + " : ";
	}

}
