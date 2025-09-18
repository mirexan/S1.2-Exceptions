package lvl3_exercise_01;

import java.util.Scanner;

public class GestioCine {
	//ATRIBUTTES
	private final Cine cine;
	//CONSTRUCTOR
	public GestioCine(Cine cine)
	{
		this.cine = cine;
	}
	//GENERAL METHODS
	public static int menu()
	{
		int opcio = -1;
		opcio = Revision_Entradas.llegirInt("\t***Menú***\n" +
				"1.- Mostrar totes les butaques reservades.\n" +
				"2.- Mostrar les butaques reservades per una persona.\n" +
				"3.- Reservar una butaca.\n" +
				"4.- Anul·lar la reserva d'una butaca.\n" +
				"5.- Anul·lar totes les resserves d'una persona.\n" +
				"0.- Sortir.");
		return (opcio);
	}

	public String	mostrarButaques(){
		String resposta = "";
		for(int i = 0; i < this.cine.getGestioButaques().getButaques().size();i++)
		{
			resposta += "\n" + this.cine.getGestioButaques().getButaques().get(i).toString();
		}
		return resposta;
	}

	public String	mostrarButaquesPersona(){
		String nom = introduirPersona();
		String resposta = "";
		for(int i = 0; i < this.cine.getGestioButaques().getButaques().size();i++)
		{
			if (this.cine.getGestioButaques().getButaques().get(i).getNom().equalsIgnoreCase(nom))
				resposta += "\n" + this.cine.getGestioButaques().getButaques().get(i).toString();
		}
		if (resposta.isEmpty())
			resposta = "No s'han trobat butaques reservades a nom de :" + nom;
		return resposta;
	}

	public String	reservarButaca(){
		int fila = introduirFila();
		int seient = introduirSeient();
		String nom = "";
		do{
			nom = introduirPersona();
		}while(nom.equalsIgnoreCase(""));
		Butaca novaButaca = new Butaca(fila,seient,nom);
		String resposta = this.cine.getGestioButaques().afegirButaca(novaButaca);
		return resposta;
	}

	public String anularReserva()
	{
		int fila = 0, seient = 0, idButaca = -1;
		String resposta =  "";
		System.out.println("A continuació es solicita la fila i el seient de la reserva a anular");
		fila = introduirFila();
		seient = introduirSeient();
		resposta = this.cine.getGestioButaques().eliminarButaca(fila,seient);
		return resposta;
	}

	public String anularReservaPersona(){
		String nom = "";
		String resposta = "";
		int fila = 0, seient = 0;
		do{
			nom = introduirPersona();
		}while(nom.isEmpty());
		for(int i = this.cine.getGestioButaques().getButaques().size() - 1; i >= 0 ;i--)
		{
			if (this.cine.getGestioButaques().getButaques().get(i).getNom().equalsIgnoreCase(nom)) {
				fila = this.cine.getGestioButaques().getButaques().get(i).getNum_fila();
				seient = this.cine.getGestioButaques().getButaques().get(i).getNum_seient();
				resposta += "\n" + this.cine.getGestioButaques().getButaques().get(i).toString();
				this.cine.getGestioButaques().eliminarButaca(fila, seient);
			}
		}
		if (resposta.isEmpty())
			resposta = "No s'han trobat butaques reservades a nom de :" + nom;
		else {
			resposta += "\n han sigut eliminades";
		}
		return resposta;
	}

	public String introduirPersona(){
		String resposta = "";
		String nom = "";
		int i = 0;
		boolean flag = true;
		nom = Revision_Entradas.llegirString("Indiqui el nom de la persona");
		try{
			while (i < nom.length() && flag)
			{
				char c = nom.charAt(i);
				if (c >= '0' && c <= '9')
					flag = false;
				else
					i++;
			}
			if (!flag)
			{
				throw new ReadException.ExcepcioNomPersonaIncorrecte( "El nom de la persona " +
						"no pot contenir números");
			}
			else
				resposta = nom;
		}
		catch (ReadException.ExcepcioNomPersonaIncorrecte e){
			System.out.println("Error : " + e.getMessage());
			resposta ="";
		}
		return resposta;
	}
	public int introduirFila(){
		int resposta = 0;
		int fila = 0;
		fila = Revision_Entradas.llegirInt("Indiqui el número de la fila");
		try{
			if (fila > 0 && fila <= this.cine.getFiles_sala())
			{
				resposta = fila;
			}
			else
				throw new ReadException.ExcepcioFilaIncorrecte( "No s'ha trobat aquest " +
						"nombre de fila a la sala");
		}
		catch (ReadException.ExcepcioFilaIncorrecte e){
			System.out.println( "Error : " + e.getMessage());
		}
		return resposta;
	}

	public int introduirSeient(){
		int resposta = 0;
		int seient = 0;
		seient = Revision_Entradas.llegirInt("Indiqui el número del seient");
		try{
			if (seient > 0 && seient <= this.cine.getSeients_fila())
			{
				resposta = seient;
			}
			else
				throw new ReadException.ExcepcioSeientIncorrecte( "No s'ha trobat aquest " +
						"nombre de seient a les files de la sala");
		}
		catch (ReadException.ExcepcioSeientIncorrecte e){
			System.out.println( "Error : " + e.getMessage());
		}
		return resposta;
	}
}

