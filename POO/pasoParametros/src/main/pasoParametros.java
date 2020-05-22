package main;

public class pasoParametros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float resultado;
		triangulo triangle = new triangulo();
		
		
		triangle.altura = 20f;
		triangle.base = 10f;
		
		resultado = triangle.calculaArea();
		System.out.println(resultado);

	}

}
