package ARTICULO;
import java.util.Scanner;

public class telefonia extends articulos {//extends nos indica que articulo sea una superclase y 
	//telefonia hereda de articulos

	private String marca;
	private String modelo;
	private double peso;
	

	public telefonia ()//es constructor porque tienen el mismo nombre que la clase
	{
		super(); //estariamos haciendo mension del metodo articulo de la superclase
		codigoModificado(actualizarCodigo());
		this.marca = "";
		this.modelo ="";
		this.peso = 0;
		
    } 
	
	public telefonia (int codigo, String descripcion, double precio, int stock, int ubicacion, String marca, String modelo, double peso)
	{
		super(codigo, descripcion, precio, stock, ubicacion);
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
		
	}
	
	public void modificarMarca()
	{
		String marca;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese nueva marca: ");
		marca = entrada.nextLine();
		this.marca = marca;
		
	}
   //hacer los otros 2 metodos
	
	//private voi telefono, que devuelva los detalles del telefono, articulo y muebles ya estan
	
	public void verDetalle()
	{
		System.out.println("Detalles del telefono: "):
		super.verDetalle(); //sin la palabra reservada super llamo al metodo que cree
		super.verStockUbicacion();
		detalleTelefono();
	}
	
	private String actualizarCodigo()
	{
		return "T" + obtenerCodigo();
	}
	public 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
