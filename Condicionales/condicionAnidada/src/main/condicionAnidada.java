package main;

public class condicionAnidada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Promedio < 6 reprobatorio
		 * Promedio >=6 aprobatorio
		 * promedio = 10 felicidades
		 * */
		int prom = 10;
		
		if(prom >=6) {
			if(prom==10) {
				System.out.println("Alumno destacado");
			}
			else {
				System.out.println("Aprobado");
			}
			
		}
		else {
			System.out.println("Reprobado");
		}

	}

}
