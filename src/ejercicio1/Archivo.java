package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;


public class Archivo {
	
	private String ruta;
	
	public boolean existeArchivo() {
		File archivo = new File(ruta);
		if(archivo.exists())
			return true;
		return false;
				
	}
	
	public static  Set<Persona> leerArchivo(String ruta){
		
		Set<Persona> listaOrdenada = new TreeSet<>();

	    try {
	        FileReader entrada = new FileReader(ruta);
	        BufferedReader buffer = new BufferedReader(entrada);

	        String linea;

	        while ((linea = buffer.readLine()) != null) {
	            String[] datos = linea.split("-");

	            if (datos.length == 3) {
	                String nombre = datos[0];
	                String apellido = datos[1];
	                String dni = datos[2];

	                try {
	                    VerificadorDni.verificarDniInvalido(dni);
	                    Persona persona = new Persona(nombre, apellido, dni);
	                    listaOrdenada.add(persona);
	                } catch (DniInvalido e) {
	                    System.out.println("El DNI es inválido para " + nombre + " " + apellido);
	                }
	            }
	        }

	        buffer.close();
	        entrada.close();

	    } catch (IOException e) {
	        System.out.println("No se encontró el archivo");
	    }

	    return listaOrdenada;
		
	}
	
	

	// getters y setters
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	//punto 3

	public boolean creaArchivo(String RutaResultado)
	{
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta, false);
			escritura.write("");
			escritura.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
			
	}
	
}


