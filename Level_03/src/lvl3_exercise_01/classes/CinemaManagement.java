package lvl3_exercise_01.classes;

import lvl3_exercise_01.classes.exceptions.ExceptionWrongName;
import lvl3_exercise_01.classes.exceptions.ExceptionWrongRow;
import lvl3_exercise_01.classes.exceptions.ExceptionWrongSeat;


public class CinemaManagement {
	//ATRIBUTTES
	private final Cinema cinema;
	//CONSTRUCTOR
	public CinemaManagement(Cinema cinema)
	{
		this.cinema = cinema;
	}
	//GENERAL METHODS
	public static int menu()
	{
		int option = -1;
		option = CheckTicket.readInt("\t***Menú***\n" +
				"1.- Show all the reserved seats.\n" +
				"2.- Show seats reserved by person.\n" +
				"3.- Reserve a seat.\n" +
				"4.- Eliminate a reservation of a seat.\n" +
				"5.- Eliminate all the reservations from a person.\n" +
				"0.- Leave.");
		return (option);
	}

	public String showSeats(){
		String resposta = "";
		for(int i = 0; i < this.cinema.getSeatManagement().getSeats().size(); i++)
		{
			resposta += "\n" + this.cinema.getSeatManagement().getSeats().get(i).toString();
		}
		return resposta;
	}

	public String showSeatsByPerson(){
		String nom = addPerson();
		String resposta = "";
		for(int i = 0; i < this.cinema.getSeatManagement().getSeats().size(); i++)
		{
			if (this.cinema.getSeatManagement().getSeats().get(i).getNom().equalsIgnoreCase(nom))
				resposta += "\n" + this.cinema.getSeatManagement().getSeats().get(i).toString();
		}
		if (resposta.isEmpty())
			resposta = "There is no seat in :" + nom + " name";
		return resposta;
	}

	public String	reserveSeat(){
		int fila = addRow();
		int seient = addSeat();

		String nom = "";
		do{
			nom = addPerson();
		}while(nom.equalsIgnoreCase(""));
		Seat novaSeat = new Seat(fila,seient,nom);
		String resposta = this.cinema.getSeatManagement().addSeat(novaSeat);
		return resposta;
	}

	public String deleteReserve()
	{
		int fila = 0, seient = 0, idButaca = -1;
		String resposta =  "";
		System.out.println("Asking data to erease the reservation :");
		fila = addRow();
		seient = addSeat();
		resposta = this.cinema.getSeatManagement().eliminateSeat(fila,seient);
		return resposta;
	}

	public String deleteReservationByPerson(){
		String nom = "";
		String resposta = "";
		int fila = 0, seient = 0;
		do{
			nom = addPerson();
		}while(nom.isEmpty());
		for(int i = this.cinema.getSeatManagement().getSeats().size() - 1; i >= 0 ; i--)
		{
			if (this.cinema.getSeatManagement().getSeats().get(i).getNom().equalsIgnoreCase(nom)) {
				fila = this.cinema.getSeatManagement().getSeats().get(i).getNum_row();
				seient = this.cinema.getSeatManagement().getSeats().get(i).getNum_seat();
				resposta += "\n" + this.cinema.getSeatManagement().getSeats().get(i).toString();
				this.cinema.getSeatManagement().eliminateSeat(fila, seient);
			}
		}
		if (resposta.isEmpty())
			resposta = "There is no seats in the name of :" + nom;
		else {
			resposta += "\n has been eliminated";
		}
		return resposta;
	}

	public String addPerson(){
		String resposta = "";
		String nom = "";
		int i = 0;
		boolean flag = true;
		nom = CheckTicket.readString("Insert a name");
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
				throw new ExceptionWrongName( "The name can't " +
						"contain numbers");
			}
			else
				resposta = nom;
		}
		catch (ExceptionWrongName e){
			System.out.println("Error : " + e.getMessage());
			resposta ="";
		}
		return resposta;
	}
	public int addRow(){
		int resposta = 0;
		int fila = 0;
		fila = CheckTicket.readInt("Insert a row number");
		try{
			if (fila > 0 && fila <= this.cinema.getRoom_row())
			{
				resposta = fila;
			}
			else
				throw new ExceptionWrongRow( "Invalid row number");
		}
		catch (ExceptionWrongRow e){
			System.out.println( "Error : " + e.getMessage());
		}
		return resposta;
	}

	public int addSeat(){
		int resposta = 0;
		int seient = 0;
		seient = CheckTicket.readInt("Insert a seat number :");
		try{
			if (seient > 0 && seient <= this.cinema.getSeats_row())
			{
				resposta = seient;
			}
			else
				throw new ExceptionWrongSeat( "Invalid seat number");
		}
		catch (ExceptionWrongSeat e){
			System.out.println( "Error : " + e.getMessage());
		}
		return resposta;
	}
}

