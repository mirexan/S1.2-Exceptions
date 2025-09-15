package lvl1_exercise_01;

import java.util.ArrayList;

public class Venda {
	//ATTRIBUTES

	private ArrayList<Producte> productes;
	private int preuTotal;

	//CONSTRUCTOR

	public Venda(Producte producte){
		this.productes = new ArrayList<Producte>();
		this.preuTotal = 0;
	}
}
