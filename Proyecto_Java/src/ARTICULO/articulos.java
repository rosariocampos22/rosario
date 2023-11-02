package ARTICULO;
import java.util.*;
public class articulos {

	private String codigo;
	private String descripcion;
	private double precio;
	private deposito ubicacion;
	private int stock;
	
    public  articulos() //constructor con valores por default
    {
    	this.codigo = "0";
    	this.descripcion = "";
    	this.precio = 0;
    	this.stock = 0;
    	this.ubicacion = new deposito();
     }
    
     public articulos(String codigo, String descripcion, double precio, int stock, int ubicacion)
     {//constructor que recibe parametros para dar un estado inicial completo al objeto
    	 this.codigo = Interger.toString(codigo);
    	 this.descripcion = descripcion;
    	 this.precio = precio;
    	 this.stock = stock;
    	 this.ubicacion = new deposito(ubicacion);
     }
     
     public void modificarCodigo()
     {
    	 int codigo;
    	 Scanner entrada = new Scanner (System.in);
    	 System.out.println("Ingrese nuevo codigo: ");
    	 codigo = entrada.nextInt();
    	 this.codigo = "" + codigo;
     }
     
     
     
     public void modificarPrecio()
     {
    	 double precio;
    	 Scanner entrada = new Scanner(System.in);
    	 do
    	 {
    		 System.out.println("Ingrese nuevo precio: ");
    		 precio = entrada.nextDouble();
    	 }while(precio<=0);
    	 this.precio = precio;
     }
	 
     public void modificarPrecioGlobal(int opcion, double porcentaje)
     {
    	 if (opcion == 0) //0 para incrementar
    	 { 
    		 this.precio = (this.precio * porcentaje / 100) + this.precio;
    	 }
    	 else // decrementar
    	 {
    		 this.precio = this.precio - (this.precio * porcentaje / 100);
    	 }
    	 
    	 
     }
	
     public String obtenerCodigo()
     {
    	 return this.codigo;
     }
     
     protected void codigoModificado(String codigo) //protected para que no pueda ser utilizado desde cualquier otra clase
     {
    	 this.codigo = codigo;
     }
     
}
