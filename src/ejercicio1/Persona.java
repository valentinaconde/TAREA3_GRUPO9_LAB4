package ejercicio1;

public class Persona implements Comparable<Persona>{

	private String Nombre;
	private String Apellido;
	private String DNI;
	
	public Persona() {
		
	}
	
	public Persona(String Nombre, String Apellido, String DNI) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.DNI = DNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	@Override
    public String toString() {
        return Nombre + " - " + Apellido + " - " + DNI;
    }
	
	@Override
	 public int compareTo(Persona otra) {
        return this.Apellido.compareTo(otra.Apellido);
    }
	
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return DNI.equals(persona.DNI);
    }
	
	public int hashCode() {
        return DNI.hashCode();
    }
	
}
