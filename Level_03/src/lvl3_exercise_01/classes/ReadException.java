package lvl3_exercise_01.classes;

public class ReadException extends Exception{
		public ReadException(String mensaje){
			super(mensaje);
		}
		public static class ExcepcioButacaOcupada extends Exception{
			public ExcepcioButacaOcupada(String mensaje){
				super(mensaje);
			}
		}
	public static class ExcepcioButacaLliure extends Exception{
		public ExcepcioButacaLliure(String mensaje){
			super(mensaje);
		}
	}
	public static class ExcepcioNomPersonaIncorrecte extends Exception{
		public ExcepcioNomPersonaIncorrecte(String mensaje){
			super(mensaje);
		}
	}
	public static class ExcepcioFilaIncorrecte extends Exception{
		public ExcepcioFilaIncorrecte (String mensaje){
			super(mensaje);
		}
	}
	public static class ExcepcioSeientIncorrecte extends Exception{
		public ExcepcioSeientIncorrecte(String mensaje){
			super(mensaje);
		}
	}
}
