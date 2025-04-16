package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
			FileReader entrada;
			entrada = new FileReader(ruta);
			BufferedReader buffer = new BufferedReader(entrada);
			
			String linea ;
			
			linea = buffer.readLine();
			while(linea != null) {
				
				try {
				
					String[] datos = linea.split("-");
					
					if (datos.length == 3) {
                        String nombre = datos[0];
                        String apellido = datos[1];
                        String dni = datos[2];
                        
                       
                        VerificadorDni.verificarDniInvalido(dni);
                        
                        //
                        Persona persona = new Persona(nombre, apellido, dni);
                        listaOrdenada.add(persona);
                    }
				}catch (DniInvalido e) {
                    
                    System.out.println("El DNI es invalido " );
                }
				
				linea = buffer.readLine();
			}
			
			buffer.close();
			entrada.close();

			
		}catch (IOException e) {
			System.out.println("no se eoncontro el archivo");
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

	
}


