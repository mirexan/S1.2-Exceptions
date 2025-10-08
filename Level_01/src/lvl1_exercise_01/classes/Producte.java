package lvl1_exercise_01.classes;

public class Producte {

	private String nom;
	private int preu;

	public Producte(String nom, int preu){
		this.nom = nom;
		this.preu = preu;
	}

	public String getNom() {
		return this.nom;
	}
	public int getPreu(){
		return this.preu;
	}

	public void setNom(String nom){
		this.nom = nom;
	}
	public void setPreu(int preu){
		this.preu = preu;
	}
}
