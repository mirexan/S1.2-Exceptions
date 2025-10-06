package lvl3_exercise_01.classes;

import lvl3_exercise_01.classes.exceptions.ReadException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckTicket {
	static Scanner sc = new Scanner(System.in);


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

	public static int readInt(String missatge)
	{
		boolean flag_ok = false;
		int resposta_us = 0;

		while (!flag_ok){
			System.out.println(missatge);
			try {
				resposta_us = sc.nextInt();
				sc.nextLine();
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
				sc.next();
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
					throw new ReadException("A char must be introduced");
				flag_ok = true;
			}
			catch (ReadException e){
				System.out.println("Error : " + e.getMessage());
				flag_ok = false;
			}
		}
		resposta = entrada.charAt(0);
		return resposta;
	}

	public static String readString(String missatge)
	{
		boolean flag_ok = false;
		String resposta = "";
		String entrada = "";
		while (!flag_ok){
			System.out.println(missatge);
			entrada = sc.nextLine();
			try {
				if (entrada.isEmpty() || entrada.isBlank())
					throw new ReadException("You must introduce a str with visible chars");
				flag_ok = true;
			}
			catch (ReadException e){
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
				if (entrada.length() != 1 || (entrada.charAt(0) != 'n' && entrada.charAt(0) != 'y'))
					throw new ReadException(" 'y' as yes and 'n' as no must be introduced");
				flag_ok = true;
			} catch (ReadException e) {
				System.out.println("Error : " + e.getMessage());
				flag_ok = false;
			}
		}
		resposta = entrada.charAt(0) == 'y'?true:false;
		return resposta;
	}
}
