package lvl3_exercise_01.classes;

public class Cinema {

	//ATTRIBUTES

	private int room_row;
	private int seats_row;
	private SeatManagement gSeat;
	private CinemaManagement gCine;

	//CONSTRUCTOR
	public Cinema(){
		this.gSeat = new SeatManagement();
		demanarDadesInicials();
		this.gCine = new CinemaManagement(this);
	}
	//GETTER

	public int getRoom_row() {
		return this.room_row;
	}
	public int getSeats_row(){
		return this.seats_row;
	}
	public SeatManagement getSeatManagement(){
		return this.gSeat;
	}
	public CinemaManagement getCinemaManagement() {
		return this.gCine;
	}

	public void start () {
		int option = -1;
		String resposta = "";

		while (option != 0)
		{
			option = CinemaManagement.menu();
			switch (option)
			{
				case 1:
					resposta = this.gCine.showSeats();
					break;
				case 2:
					resposta = this.gCine.showSeatsByPerson();
					break;
				case 3:
					resposta = this.gCine.reserveSeat();
					break;
				case 4:
					resposta = this.gCine.deleteReserve();
					break;
				case 5:
					resposta = this.gCine.deleteReservationByPerson();
					break;
				default:
					resposta = "Leaving application.";
					break;
			}
			System.out.println(resposta + "\n\n");
		}

	}
	public void demanarDadesInicials()
	{
		this.room_row = CheckTicket.readInt("Insert the number of rows from room :");
		this.seats_row = CheckTicket.readInt("Insert the number of seat for row :");
	}
}
