package ejercicios;

import java.util.Scanner;
public class Bombilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		private boolean estado;
		private int potencia;
		private String color;
		private double horas;
		
		public Bombilla()
		{
			this.estado = false;
			this.potencia = 10;
			this.color = "N/A";
			this.horas = 10;
		}
		public void apagar()
		{
			this.estado = false;
			System.out.println("La bombilla esta apagada.");
		}
		public boolean ver_estado()
		{
			return this.estado;
		}
		public void cambiar_potencia(int potencia)
		{
			this.potencia = potencia;
		}
		public int ver_potencia()
		{
			return this.potencia;
		}
		public void cambiar_color(String color)
		{
			if(this.estado == true)
			{
			  apagar();
			}
			this.color = color;
		}
		public void ver_color()
		{
			System.out.println("El color es: " + this.color);
		}
		public void recargar ()
		{ 
			double recarga;
			Scanner entrada = new Scanner(System.in);
			System.out.println("Cuantas horas quiere recargar? ");
			recarga = entrada.nextDouble();
			this.horas = this.horas + recarga;
			System.out.println("Ahora quedan " + horas + )
		} 
		public void encender() 
		{
			
		}
		
		
		
		
		
		
		
		
	}

}
