package EjemploLibro;

public abstract class SerVivo {

	private String especie;
	
	public SerVivo(String especie)
	{
		this.especie = especie;
	}
	
	public abstract void alimentarse ();
	
}

  class Humano extends SerVivo{
	 
	  private  String nombre;
	  
	  public Humano(String especie, String nombre)
	  {
		  super(especie);
		  this.nombre = nombre;
	  }
	  public void alimentarse() {
		  System.out.println("El humano debe laburar para comer");
		  
	  }
  }