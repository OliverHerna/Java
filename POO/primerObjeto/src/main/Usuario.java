package main;

public class Usuario {
	//Sobrecarga de metodos

	public Usuario(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
		this.pais = "";
	}
	
	public Usuario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.pais = "";
	}
	
	public Usuario(String nombre, String pais) {
		this.nombre = nombre;
		this.edad = 0;
		this.pais = pais;
	}
	String nombre;
	int edad;
	String pais;
}
