package main;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Definir dos o m�s metodos con el mismo 
		 * nombre en la misma clase
		 * Para que? Para tener comportamientos  distintos*/
		
		suma sum =  new suma();
			
		System.out.println("El resultado es: " + sum.calcu(10, 20));
		System.out.println("El resultado es: " + sum.calcu(10.5f, 20.5f));
		
	}

}
