package edu.unimagdalena.bancos.cuentas;

public class Persona {
	private String nombre;
	private long dni;
	public Persona(String nombre, long dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public long getDni() {
		return dni;
	}
	
}
