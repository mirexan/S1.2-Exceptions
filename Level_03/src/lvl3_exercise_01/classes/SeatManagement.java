package lvl3_exercise_01.classes;

import lvl3_exercise_01.classes.exceptions.ExceptionFreeSeat;
import lvl3_exercise_01.classes.exceptions.ExceptionOccupiedSeat;

import java.util.ArrayList;

public class SeatManagement {
	//ATTRIBUTES
	private ArrayList<Seat> seats;
	//CONSTRUCTOR
	public SeatManagement(){
		this.seats = new ArrayList<Seat>();
	}
	//GETTER

	public ArrayList<Seat> getSeats() {
		return this.seats;
	}
	//GENERAL METHODS
	public String addSeat(Seat novaSeat)
	{
		String resposta = "";
		try{
			if (searchSeat(novaSeat.getNum_row(), novaSeat.getNum_seat()) != -1)
				throw new ExceptionOccupiedSeat("This seat is occuppied, it can't" +
						" be added");
			else {
				this.seats.add(novaSeat);
				resposta = "Place added with row :" + novaSeat.getNum_row()
						+ ", seat :" + novaSeat.getNum_seat();
			}
		}
		catch(ExceptionOccupiedSeat e){
			resposta = "Error :" + e.getMessage();
		}
		return resposta;
	}
	public String eliminateSeat(int fila, int seient){
		int id_butaca;
		String resposta = "";
		try{
			id_butaca = searchSeat(fila,seient);
			if (id_butaca == -1){
				throw new ExceptionFreeSeat("There is no " +
						"seat to delete");
			}
			else{
				this.seats.remove(id_butaca);
				resposta = "Place row: " + fila
						+ ", seat: " + seient + " has been eliminated";
			}
		}
		catch (ExceptionFreeSeat e){
			resposta = "Error : " + e.getMessage();
		}
		return resposta;
	}

	public int searchSeat(int fila, int seient){
		int posicio = -1, i = 0;
		while (i < this.seats.size() && posicio == -1)
		{
			Seat butacActual = this.seats.get(i);
			if (fila == butacActual.getNum_row()
					&& seient == butacActual.getNum_seat())
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
