package lvl3_exercise_01.classes;

import java.util.ArrayList;

public class GestioButaques {
	//ATTRIBUTES
	private ArrayList<Butaca> butaques;
	//CONSTRUCTOR
	public GestioButaques(){
		this.butaques = new ArrayList<Butaca>();
	}
	//GETTER

	public ArrayList<Butaca> getButaques() {
		return this.butaques;
	}
	//GENERAL METHODS
	public String afegirButaca(Butaca novaButaca)
	{
		String resposta = "";
		try{
			if (cercarButaca(novaButaca.getNum_fila(), novaButaca.getNum_seient()) != -1)
				throw new ReadException.ExcepcioButacaOcupada("No es pot afegir la butaca" +
						", està ocupada");
			else {
				this.butaques.add(novaButaca);
				resposta = "S'ha afegit la butaca fila :" + novaButaca.getNum_fila()
						+ ", seient :" + novaButaca.getNum_seient();
			}
		}
		catch(ReadException.ExcepcioButacaOcupada e){
			resposta = "Error :" + e.getMessage();
		}
		return resposta;
	}
	public String	eliminarButaca(int fila, int seient){
		int id_butaca;
		String resposta = "";
		try{
			id_butaca = cercarButaca(fila,seient);
			if (id_butaca == -1){
				throw new ReadException.ExcepcioButacaLliure("No hi ha " +
						"butaca reservada a eliminar");
			}
			else{
				this.butaques.remove(id_butaca);
				resposta = "S'ha eliminat la butaca fila: " + fila
						+ ", seient: " + seient;
			}
		}
		catch (ReadException.ExcepcioButacaLliure e){
			resposta = "Error : " + e.getMessage();
		}
		return resposta;
	}

	public int cercarButaca(int fila, int seient){
		int posicio = -1, i = 0;
		while (i < this.butaques.size() && posicio == -1)
		{
			Butaca butacActual = this.butaques.get(i);
			if (fila == butacActual.getNum_fila()
					&& seient == butacActual.getNum_seient())
			{
				posicio = i;
			}
			else{
				i++;
			}
		}
		return posicio;
	}

}
