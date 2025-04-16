package ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt");
		
		Archivo nuevoArchivo = new Archivo();
		nuevoArchivo.setRuta("Resultado.txt");
		Set<Persona> personas;
		if(archivo.existeArchivo())
		{
			System.out.println("Existe archivo");
			//punto 2
			personas = Archivo.leerArchivo(archivo.getRuta());

		
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
		
		//crea y carga el archivo Resultado.txt
		nuevoArchivo.creaArchivo(nuevoArchivo.getRuta());
		nuevoArchivo.cargarArchivo(personas, nuevoArchivo.getRuta());

		 //Lee y muestra el archivo con los datos cargados anteriormente
		try {
		        FileReader entrada = new FileReader(nuevoArchivo.getRuta());
		        BufferedReader miBuffer = new BufferedReader(entrada);

		        String linea;

		        while ((linea = miBuffer.readLine()) != null) { 
		        	System.out.println(linea);
		        }
		       entrada.close();
		       miBuffer.close();}
		 catch (IOException e) {
			System.out.println("Error al leer el archivo");
		}
		
	}

}
	
