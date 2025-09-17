package lvl3_exercise_01;

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
}
