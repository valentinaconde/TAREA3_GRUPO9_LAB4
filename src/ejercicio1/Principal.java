package ejercicio1;

import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt");
		
		Archivo nuevoArchivo = new Archivo();
		nuevoArchivo.setRuta("Resultado.txt");
		
		if(archivo.existeArchivo())
		{
			System.out.println("Existe archivo");
			//punto 2
			Set<Persona> personas = Archivo.leerArchivo(archivo.getRuta());

			for (Persona p : personas) {
				System.out.println(p);
			}
		}
		else
		{
			System.out.println("Archivo Inexistente");
			return;
			
		}
		
		//punto 3
		nuevoArchivo.creaArchivo(nuevoArchivo.getRuta());

		
		
	}

}
