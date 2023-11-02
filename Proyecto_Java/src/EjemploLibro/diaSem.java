package EjemploLibro;

public enum diaSem {
	
	LUNES(1, "Primer día de la semana"),
	MARTES(2, "Día de clases"), 
	MIERCOLES(3, "juega fluminente"),
	JUEVES(4, "juega Boca"),
	VIERNES(5, "el mejor día"),
	SABADO(6, "se juega f5"),
	DOMINGO(7, "se duerme hasta tarde");
	
	private int numDia;
	private String comentarioDia;
	
	private diaSem(int a, String b)
	{
		this.numDia = a;
		this.comentarioDia = b;
	}

	public int devolverNumDia()
	{
		return this.numDia;
	}
	
	public String devolverCalendario()
	{
		return this.comentarioDia;
	}
	
	
	
}

enum Depositos
{ 
	DEPOSITO
}

 