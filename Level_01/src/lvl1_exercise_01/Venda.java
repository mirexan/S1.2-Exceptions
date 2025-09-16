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
	//GETTER
	public ArrayList<Producte> getProductes()
	{
		return this.productes;
	}
	public int getPreuTotal() {
		return this.preuTotal;
	}
	//SETTER
	public void setProductes(Producte producte)
	{
		this.productes.add(producte);
	}
	public void setPreuTotal(int preuTotal){
		this.preuTotal = preuTotal;
	}
	//GENERAL METHODS
	public int calcularTotal()
	{
		if(getProductes().isEmpty())
		{

		}
	}
}
