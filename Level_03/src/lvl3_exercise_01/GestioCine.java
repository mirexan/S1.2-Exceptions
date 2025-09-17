package lvl3_exercise_01;

import java.util.Scanner;

public class GestioCine {
	//ATRIBUTTES
	private Cine cine;
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
		return resposta;
	}
	public String introduirPersona(){
		String resposta = "";
		String nom = "";
		int i = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indiqui un nom");
		nom = sc.nextLine();
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
			resposta = "Error : " + e.getMessage();
		}
		return resposta;
	}
	public int introduirFila(){
		int resposta = 0;
		int fila = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indiqui una fila");
		fila = sc.nextInt();
		sc.next();
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Indiqui el numero del seient");
		seient = sc.nextInt();
		sc.next();
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

