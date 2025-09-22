package lvl1_exercise_01.classes;

public class Producte {
	//ATTRIBUTES

	private String nom;
	private int preu;

	//CONSTRUCTOR

	public Producte(String nom, int preu){
		this.nom = nom;
		this.preu = preu;
	}
	//GETTER

	public String getNom() {
		return this.nom;
	}
	public int getPreu(){
		return this.preu;
	}
	//SETTER
	public void setNom(String nom){
		this.nom = nom;
	}
	public void setPreu(int preu){
		this.preu = preu;
	}
}
