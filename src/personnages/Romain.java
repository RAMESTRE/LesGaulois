package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nmEquipement = 0;

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

	public void sEquiper(Equipement nequipement) {
		switch (nmEquipement) {
		case 2:
			System.out.println("Le soldat " + this.getNom() + " est déjà bien protégé !");
			break;
		case 1:
			if (this.equipement[nmEquipement - 1] == nequipement)
				System.out.println("Le soldat " + this.getNom() + " possède déja " + nequipement.toString());
			else {
				ajoutTabEquip(nequipement);
			}
			break;
		default:
			ajoutTabEquip(nequipement);
		}
	}

	private void ajoutTabEquip(Equipement nequipement) {
		this.equipement[nmEquipement] = nequipement;
		nmEquipement++;
		System.out.println("Le soldat " + this.getNom() + " s'équipe avec un " + nequipement.toString());
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

		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);

		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);

	}

}
