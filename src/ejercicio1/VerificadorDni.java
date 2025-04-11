package ejercicio1;

public class VerificadorDni {
	 public static void verificarDniInvalido(String dni) throws DniInvalido {
	     if (!dni.matches("\\d+")) {
	         throw new DniInvalido("El DNI contiene caracteres no numéricos.");
	     }
	 }

	 public static void main(String[] args) {
	     try {
	         verificarDniInvalido("1234A567"); 
	     } catch (DniInvalido e) {
	    	 e.printStackTrace();
	         System.out.println("Excepción capturada: " + e.getMessage());
	     }
	 }
}