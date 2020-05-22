package main;

public class metodosFormato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg = "  HolA Me Van A mODifiCar   ";
		
		System.out.println(msg);
		
		//Todo MAyusculas
		System.out.println(msg.toUpperCase());
		
		//Todo Minusculas
		System.out.println(msg.toLowerCase());
		
		//Sin espacios y en minusculas
		System.out.println(msg.toLowerCase().trim().concat(", mira ya estoy estandarizado :)"));
		//Mientras regrese un Strifg podemos concatenar los metodos

	}

}
