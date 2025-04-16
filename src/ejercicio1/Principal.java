package ejercicio1;

import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt");
		
		if(archivo.existeArchivo())
		{
			System.out.println("Existe archivo");
		}
		else
		{
			System.out.println("No existe archivo entonces lo creo");
			//archivo.creaArchivo();
		}
		
		Set<Persona> personas = Archivo.leerArchivo(archivo.getRuta());

		for (Persona p : personas) {
			System.out.println(p);
		}
	}

}
