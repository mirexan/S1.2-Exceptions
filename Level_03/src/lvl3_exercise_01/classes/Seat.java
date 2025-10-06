package lvl3_exercise_01.classes;

public class Seat {
	//ATTRIBUTES

	private final int num_row;
	private final int num_seat;
	private final String name;

	//CONSTRUCTOR
	public Seat(int num_row, int num_seat, String name){
		this.num_row = num_row;
		this.num_seat = num_seat;
		this.name = name;
	}
	//GETTER
	public int getNum_row(){
		return this.num_row;
	}
	public int getNum_seat(){
		return this.num_seat;
	}
	public String getNom(){
		return this.name;
	}
	//GENERAL METHOD
	public boolean Equals(int num_fila, int num_seient)
	{
		boolean resposta = false;

		resposta = (this.num_row == num_fila
				&& this.num_seat == num_seient)?true:false;
		return resposta;
	}
	//OWN METHOD

	public String toString(){
		return "Row: " + this.num_row + ", Seat: " + this.num_seat + ", " +
				"Name : " + this.name;
	}

}
