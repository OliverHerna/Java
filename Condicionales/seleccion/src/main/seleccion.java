package main;

public class seleccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejemplo Semáforo
		
		String color = "morado";
		
		
		if(color.equals("verde")) {
			System.out.println("Puede pasar");
		}
		else 
			if(color.equals("amarillo")){
				System.out.println("Detengase parcialmente");
			}
		else
			if(color.equals("rojo")) {
				System.out.println("No puede pasar");
			}
			else {
				System.out.println("No hay semaforos con esa luz");
			}
	}

}
