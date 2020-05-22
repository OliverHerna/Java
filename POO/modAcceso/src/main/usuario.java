package main;

public class usuario {
	/*Modificadores de acceso
	 * 1- default: se puede acceder desde el mismo paquete	
	 * 2- public: se puede acceder a este elemento desde cualquier paquete
	 * 3- private: no se tiene acceso desde ningun paquete
	 * 4- protected: pendiente
	 * 
	 * Se encarga de controlar el acceso a los datos*/
	
	public String usuario;
	private String pass;
	
	void saludo() {
		System.out.println("Hola mi nombre es: " + this.usuario);
	}
	
	
	/*El constructor puede cumplir las siguientes tareas:
	 * colocar valores por default
	 * establecer estados
	 * colocar banderas
	 * */
	
	public usuario(String usuario, String pass) {
		this.usuario = usuario;
		this.pass = pass;
	}

	//Getters y Setters, estan hechos para hacer uso de atributos sin trabajar directamente con ellos
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
