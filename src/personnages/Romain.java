package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}

	public String getNom() {
		return nom;
	}

	public void parler(String text) {
		System.out.println(prendreParole() + "\"" + text + "\"");
	}

	public String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert isPreconditionVerified(forceCoup);
		int oldForce = this.force;
		this.force -= forceCoup;
		if (this.force < 1)
			parler("J'abandonne");
		else
			parler("Aïe");
		assert isPostConditionVerified(oldForce);
	}

	private boolean isInvariantVerified() {
		return this.force >= 0;
	}
	
	private boolean isPreconditionVerified(int forceCoup) {
		return forceCoup >= 0;
	}
	
	private boolean isPostConditionVerified(int oldForce) {
		return oldForce > this.force;
	}

	public static void main(String[] argv) {

		Romain minus = new Romain("Minus", 6);
		assert minus.isInvariantVerified();

	}

}
