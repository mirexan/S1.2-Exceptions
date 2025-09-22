package lvl2_exercise_01;

import lvl2_exercise_01.classes.Entrada;

public class Lvl2_Exercise_01_Main {
	public static void main(String[] args) {
		Entrada entrada = new Entrada();
		Byte resposta_byte = 0;
		int resposta_int = 0;
		float resposta_float = 0f;
		double resposta_double = 0d;
		char resposta_char = ' ';
		String resposta_string = "";
		boolean resposta_boolean = false;
		resposta_byte = entrada.llegirByte("Introdueix un byte");
		resposta_int = entrada.llegirInt("Introdueix un int");
		resposta_float = entrada.llegirFloat("Introdueix un float");
		resposta_double = entrada.llegirDouble("Introdueix un double");
		resposta_char = entrada.llegirChar("Introdueix un char");
		resposta_string = entrada.llegirString("Introdueix un string");
		resposta_boolean = entrada.llegirSiNo("Introdueix s o n");
		System.out.println("El byte es : " + resposta_byte + "\n" +
				"El int es : " + resposta_int + "\n"
		+ "El float es : " + resposta_float + "\n"
		+ "El double es : " + resposta_double + "\n"
		+ "El char es : " + resposta_char + "\n"
		+ "El string es : " + resposta_string + "\n"
		+ "El boolean es : " + resposta_boolean);
	}
}
