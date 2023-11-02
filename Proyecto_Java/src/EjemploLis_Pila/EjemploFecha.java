package EjemploLis_Pila;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EjemploFecha {
	
	public static final DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy);

	public static void main(String[] args) {
		
		LocalDate hoy = LocalDate.now();//metodo now para almacenar la fecha de hoy
		LocalDate cumple = LocalDate.of(2023, 12, 30);//metodo of para almacenar 
		
		System.out.println(hoy);
		System.out.println(cumple);
		
		System.out.println("Hoy es: " + hoy.format(fechaFormateada));//objeto de tipo 
		System.out.println("Tu cumple es: " + cumple.format(fechaFormateada));
		int.dias = (int) ChronoUnit.DAYS.between(hoy, cumple);//metodo dbetween chrono enumer
		System.out.println("Para tu cumple faltan: " + dias);
		
	}
	
}
