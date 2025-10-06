package personnages;

public class Chaudron {
	private int qtePotion;
	private int forcePotion;

	public void remplirChaudron(int qte, int forcePotion) {

	}

	public boolean resterPotion() {
		if (qtePotion > 0)
			return true;
		return false;
	}

	public int prendreLouche() {
		return 0;
	}
}
