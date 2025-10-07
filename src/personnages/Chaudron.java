package personnages;

import java.util.concurrent.BrokenBarrierException;

public class Chaudron {
	private int qtePotion;
	private int forcePotion;

	public void remplirChaudron(int qte, int forcePotion) {
		this.qtePotion = qte;
		this.forcePotion = forcePotion;
	}

	public boolean resterPotion() {
		return qtePotion > 0;
	}

	public int prendreLouche() {
		if (qtePotion > 0) {
			qtePotion--;
			return forcePotion;
		} else
			return 0;
	}
}
