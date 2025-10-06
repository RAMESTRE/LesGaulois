package personnages;

public class Druide {
	private String[] nom;
	private int force;
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	public String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void booster(Gaulois gaulois) {}
	
	public void fabriquerPotion(int qte, int forcePotion) {
		
	}
	
	public String[] getNom() {
		return nom;
	}
}
