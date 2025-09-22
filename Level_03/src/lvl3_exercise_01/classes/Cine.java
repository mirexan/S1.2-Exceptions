package lvl3_exercise_01.classes;

public class Cine {

	//ATTRIBUTES

	private int	files_sala;
	private int seients_fila;
	private GestioButaques gButaca;
	private GestioCine gCine;

	//CONSTRUCTOR
	public Cine(){
		this.gButaca = new GestioButaques();
		demanarDadesInicials();
		this.gCine = new GestioCine(this);
	}
	//GETTER

	public int getFiles_sala() {
		return this.files_sala;
	}
	public int getSeients_fila(){
		return this.seients_fila;
	}
	public GestioButaques getGestioButaques (){
		return this.gButaca;
	}
	public GestioCine getgCine() {
		return this.gCine;
	}

	public void iniciar () {
		int opcio = -1;
		String resposta = "";

		while (opcio != 0)
		{
			opcio = GestioCine.menu();
			switch (opcio)
			{
				case 1:
					resposta = this.gCine.mostrarButaques();
					break;
				case 2:
					resposta = this.gCine.mostrarButaquesPersona();
					break;
				case 3:
					resposta = this.gCine.reservarButaca();
					break;
				case 4:
					resposta = this.gCine.anularReserva();
					break;
				case 5:
					resposta = this.gCine.anularReservaPersona();
					break;
				default:
					resposta = "Sortint de l'aplicació.";
					break;
			}
			System.out.println(resposta + "\n\n");
		}

	}
	public void demanarDadesInicials()
	{
		this.files_sala = Revision_Entradas.llegirInt("Siplau indica el nombre de files de la sala de cinema :");
		this.seients_fila = Revision_Entradas.llegirInt("Sisplau indica quants seients per fila te la sala de cinema :");
	}
}
