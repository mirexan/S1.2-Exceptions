package lvl1_exercise_01.classes;

import java.util.ArrayList;

public class Venda {
	//ATTRIBUTES

	private ArrayList<Producte> productes;
	private int preuTotal;

	//CONSTRUCTOR

	public Venda(){
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
	public void setVenda(Producte producte)
	{
		this.productes.add(producte);
	}
	public void setPreuTotal(int preuTotal){
		this.preuTotal = preuTotal;
	}
	//GENERAL METHODS
	public void calcularTotal() throws VendaBuidaException {
		if(getProductes().isEmpty())
		{
			throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
		}
		else{
				for (Producte producte:productes){
					this.preuTotal += producte.getPreu();
				}
		}
	}
}
