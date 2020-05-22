package main;

public class modAcceso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		usuario user = new usuario("Dieguito02", "megustaelqueso2");
		
		//no es posible acceder al password ya que es private
		
		user.saludo();
		System.out.println("Contraseña: "+user.getPass());	
		
	}

}
