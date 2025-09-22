package lvl2_exercise_01.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	static Scanner sc = new Scanner(System.in);

	//GENERAL METHODS InputMismatch

	public static Byte llegirByte(String missatge)
	{
		boolean flag_ok = false;
		Byte resposta_us = 0;

		while (!flag_ok){
			System.out.println(missatge);
			try {
				resposta_us = sc.nextByte();
				flag_ok = true;
			}
			catch (InputMismatchException e){
				System.out.println("Error : " + e.getMessage());
				sc.next();
				flag_ok = false;
			}
		}
		return resposta_us;
	}

	public static int llegirInt(String missatge)
	{
		boolean flag_ok = false;
		int resposta_us = 0;

		while (!flag_ok){
			System.out.println(missatge);
			try {
				resposta_us = sc.nextInt();
				flag_ok = true;
			}
			catch (InputMismatchException e){
				System.out.println("Error : " + e.getMessage());
				sc.next();
				flag_ok = false;
			}
		}
		return resposta_us;
	}

	public static float llegirFloat(String missatge)
	{
		boolean flag_ok = false;
		float resposta_us = 0;
		while (!flag_ok){
			System.out.println(missatge);
			try {
				resposta_us = sc.nextFloat();
				flag_ok = true;
			}
			catch (InputMismatchException e){
				System.out.println("Error : " + e.getMessage());
				sc.next();
				flag_ok = false;
			}
		}
		return resposta_us;
	}

	public static double llegirDouble(String missatge)
	{
		boolean flag_ok = false;
		double resposta_us = 0;
		while (!flag_ok){
			System.out.println(missatge);
			try {
				resposta_us = sc.nextDouble();
				flag_ok = true;
			}
			catch (InputMismatchException e){
				System.out.println("Error : " + e.getMessage());
				sc.next();
				flag_ok = false;
			}
		}
		return resposta_us;
	}

	// GENERAL METHODS LlegirException

	public static char llegirChar(String missatge)
	{
		boolean flag_ok = false;
		char resposta = ' ';
		String entrada = "";
		while (!flag_ok){
			System.out.println(missatge);
			entrada = sc.next();
			try {
				if (entrada.length() != 1)
					throw new LlegirException("S'ha d'introduir un char");
				flag_ok = true;
			}
			catch (LlegirException e){
				System.out.println("Error : " + e.getMessage());
				flag_ok = false;
			}
		}
		resposta = entrada.charAt(0);
		return resposta;
	}

	public static String llegirString(String missatge)
	{
		boolean flag_ok = false;
		String resposta = "";
		String entrada = "";
		while (!flag_ok){
			System.out.println(missatge);
			entrada = sc.next();
			try {
				if (entrada.isEmpty() || entrada.isBlank())
					throw new LlegirException("S'ha d'introduir una cadena amb caràcters visibles");
				flag_ok = true;
			}
			catch (LlegirException e){
				System.out.println("Error : " + e.getMessage());
				flag_ok = false;
			}
		}
		resposta = entrada;
		return resposta;
	}

	public static boolean llegirSiNo(String missatge) {
		boolean flag_ok = false;
		boolean resposta = false;
		String entrada = "";
		while (!flag_ok) {
			System.out.println(missatge);
			entrada = sc.next();
			try {
				if (entrada.length() != 1 || (entrada.charAt(0) != 'n' && entrada.charAt(0) != 's'))
					throw new LlegirException("S'ha d'introduir 's' com a sí i 'n' com a no");
				flag_ok = true;
			} catch (LlegirException e) {
				System.out.println("Error : " + e.getMessage());
				flag_ok = false;
			}
		}
		resposta = entrada.charAt(0) == 's'?true:false;
		return resposta;
	}
}

