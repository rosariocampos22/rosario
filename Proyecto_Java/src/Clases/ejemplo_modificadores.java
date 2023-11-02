package Clases; 
public class ejemplo_modificadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VisorDeReloj reloj1 = new VisorDeReloj();
		System.out.println(reloj1.getHora());
		reloj1.ponerEnHora(20, 59);
		System.out.println(reloj1.getHora());
		reloj1.ticTac();
		System.out.println(reloj1.getHora());
		
		
		
		
		
	}

}
