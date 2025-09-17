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

	public static void iniciar () {
		GestioCine.menu();

	}
	public void demanarDadesInicials()
	{
		this.files_sala = Revision_Entradas.llegirInt("Siplau indica el nombre de files de la sala de cinema :");
		this.seients_fila = Revision_Entradas.llegirInt("Sisplau indica quants seients per fila te la sala de cinema :");
	}
}
