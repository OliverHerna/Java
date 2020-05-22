package main;

public class compararCad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1="Hola", cadena2="hola";
		
		//Metodo para comparar cadenas
		Boolean res= cadena1.equals(cadena2);
		
		System.out.println(res);
		
		/*Podemos validar que el texto sea el mismo
		 * utilizando los metodos .toUpperCase() y
		 * .toLowerCase()*/
		
		String cadenaN1 = cadena1.toUpperCase();
		String cadenaN2 = cadena2.toLowerCase();
		
		//Con este metodo estandarizamos primero y despues compara
		
		res = cadenaN1.equalsIgnoreCase(cadenaN2);
		System.out.println(res);
	}

}
