package ARTICULO;

import java.util.Scanner;

public class deposito {

	 private String nombre; //atributo
	 
	 public deposito() //constructor 1
	 {
		 this.nombre = "Sin ubicacion";
	 }
	 
	 public deposito(int division) //constructor 2
	 {
		 this.nombre = "Deposito N° " + division;
	 }

	 public void modificardeposito()
	 {
		 Scanner entrada = new Scanner(System.in);
		 int division;
		 System.out.println("Ingrese numero de deposito: ");
		 division = entrada.nextInt();
		 this.nombre = "Deposito N°: " + division;
	 }
	 public String devolverDeposito() 
	 {
		 return this.nombre;
	 }
	 


}
