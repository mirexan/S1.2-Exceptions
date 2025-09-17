package lvl3_exercise_01;

public class Cine {

	//ATTRIBUTES

	private int	files_sala;
	private int seients_fila;
	private GestioButaques gButaca;
	private GestioCine gCine;

	//CONSTRUCTOR
	public Cine(){
		this.gButaca = new GestioButaques();
		this.gCine = new GestioCine();
		demanarDadesInicials();
	}
	//GETTER

	public int getFiles_sala() {
		return this.files_sala;
	}
	public int getSeients_fila(){
		return this.seients_fila;
	}

	public static void iniciar () {
		int opcio = -1;

		while (opcio != 0)
		{
			opcio = GestioCine.menu();
			switch (opcio)
			{
				case 1:
					//Mostrar totes les butaques reservades.
					break;
				case 2:
					//Mostrar les butaques reservades per una persona.
					break;
				case 3:
					//Reservar una butaca.
					break;
				case 4:
					//Anul·lar la reserva d’una butaca.
					break;
				case 5:
					//Anul·lar totes les reserves d’una persona.
					break;
				default:
					break;
			}
		}

	}
	public void demanarDadesInicials()
	{
		this.files_sala = Revision_Entradas.llegirInt("Siplau indica el nombre de files de la sala de cinema :");
		this.seients_fila = Revision_Entradas.llegirInt("Sisplau indica quants seients per fila te la sala de cinema :");
	}
}
