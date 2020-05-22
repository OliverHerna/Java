package main;

public class metodosFormato2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg = "";
		String nombre = "Juan";
		int calificacion = 7;
		float promedio = 5.9999f;
		
		
		//Guardar variable String con cieto formato
		 msg = String.format("El alumno %s saco %d en su examen, por lo tanto tiene %.1f de promedio", nombre, calificacion, promedio);
		 System.out.println(msg);
		 
		 //Si no volvemos a usar la variable simplemente podemos usar 
		 System.out.printf("El alumno %s saco %d en su examen, por lo tanto tiene %.1f de promedio", nombre, calificacion, promedio);
		 System.out.println("");
		 
		 //Otra manera de concatenar Strings es la siguiente (usando el operador "+")
		 System.out.println("El alumno " +nombre+ " saco " +calificacion+ " en su examen por lo tanto tiene " +promedio+ " de promedio ");

		 //Tres maneras distintas de desplegar un conjunto de Strings
	}

}
