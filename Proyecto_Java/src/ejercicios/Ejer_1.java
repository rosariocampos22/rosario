package ejercicios;

import java.util.Scanner;
public class Ejer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDato = new Scanner(System.in);
		
		int pares = 0, impares = 0, num;
		
		do 
		{
			System.out.println("Ingrese un numero: ");
			num = entradaDato.nextInt(); 
			if(num!=0)
			{
				if (num % 2 == 0)
			 {
				pares++;
			 }
			else
			{
				impares++;
			}
			}
		}while(num!=0);
		   System.out.println("Pares: " + pares);
		   System.out.println("Impares: " + impares);
		
		
		
		
	}

}
