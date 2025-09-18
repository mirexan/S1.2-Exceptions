package lvl3_exercise_01;

public class Butaca {
	//ATTRIBUTES

	private final int num_fila;
	private final int num_seient;
	private final String nom;

	//CONSTRUCTOR
	public Butaca(int num_fila, int num_seient, String nom){
		this.num_fila = num_fila;
		this.num_seient = num_seient;
		this.nom = nom;
	}
	//GETTER
	public int getNum_fila(){
		return this.num_fila;
	}
	public int getNum_seient(){
		return this.num_seient;
	}
	public String getNom(){
		return this.nom;
	}
	//GENERAL METHOD
	public boolean Equals(int num_fila, int num_seient)
	{
		boolean resposta = false;

		resposta = (this.num_fila == num_fila
				&& this.num_seient == num_seient)?true:false;
		return resposta;
	}
	//OWN METHOD

	public String toString(){
		return "Fila: " + this.num_fila + ", Seient: " + this.num_seient + ", " +
				"Persona: " + this.nom;
	}

}
