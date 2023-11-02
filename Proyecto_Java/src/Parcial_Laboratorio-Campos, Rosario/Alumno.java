package Parcial_Laboratorio;

import java.util.Scanner;

public class Alumno extends Persona{
	
	private String apellido;
	private String nombre; 
	
	public Alumno(String sexo, int edad, String apellido, String nombre)
	{
		super(sexo, edad);
		this.apellido = apellido;
		this.nombre = nombre;
	} 
	public void modificarNmobre(String nombre)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		nombre = entrada.nextLine();
		this.nombre = nombre;
	}
	public void modificarApellido(String apellido)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese su apellido: ");
		apellido = entrada.nextLine();
		this.apellido = apellido;
	}
	public String devolverApellido(String apellido)
	{
		return this.apellido; 
	}
	

}
