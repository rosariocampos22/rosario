package Parcial_Laboratorio;
import java.util.*;
public class Persona {
	
	private String sexo;
	private int edad; 
	
	public Persona()
	{
		this.sexo = "";
		this.edad = 0;
	}
	public Persona (String sexo, int edad)
	{
		this.sexo = sexo;
		this.edad = edad;
	}
	public String devolverSexo(String sexo)
	{
		return this.sexo;
	}
	public void modificarEdad(int edad)
	{
		Scanner entrada = new Scanner(System.in);
		do
		{
			System.out.println("Ingrese su edad: ");
			edad = entrada.nextInt();
		}while(edad<=0);
		this.edad = edad;
	}
 
}
