package main;

public class metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Gracias a que String es una clase podemos
		 * implementar métodos*/
		
		String msg = "Vive en una piña", newMsg;
		
		Boolean bool;
		
		//contar caracteres incluyendo espacios  res = 16
		int num_car = msg.length();
		System.out.println(num_car);
		
		//Busqueda en todo el texto (booleano) ; res = true
		bool = msg.contains("una");
		System.out.println(bool);
		
		//Empieza con y termina con ; res = true && res = false
		bool = msg.startsWith("Vive");
		System.out.println(bool);
		
		bool = msg.endsWith("na");
		System.out.println(bool);
		
		//Concatenar palabras ; res = Vive en una piña debajo del mar 
		newMsg = msg.concat(" debajo del mar");
		System.out.println(newMsg);
		
		
	}

}
