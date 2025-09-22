package lvl1_exercise_01;

import lvl1_exercise_01.classes.Producte;
import lvl1_exercise_01.classes.Venda;
import lvl1_exercise_01.classes.VendaBuidaException;

public class Lvl1_Exercise_01_Main {
	public static void main(String[] args) {
		Venda venda = new Venda();
		try{
			venda.calcularTotal();
		}
		catch (VendaBuidaException exception){
			System.out.println("Error : " + exception.getMessage());
		}
		try {
			Producte tomate = new Producte("Tomate Cherry", 2);
			venda.setVenda(tomate);
			System.out.println(venda.getProductes().get(1).getNom());
		}
		catch (IndexOutOfBoundsException indexOut){
			System.out.println("Error : " + indexOut.getMessage());
		}
	}
}
