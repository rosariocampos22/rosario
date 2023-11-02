package Clases;

public class VisorDeNumero {
	
	private int limite; //atributos de clases
	private int valor; 
	
	public VisorDeNumero (int limiteMaximo) //metodo constructor, poruque tiene el mimos nombre de la clase
	{
		this.limite = limiteMaximo; //this se utiliza para no confundir el nombre, el parametro puede tener el mismo nombre
		this.valor = 0;
	} 
	
	public int getValor() //metodo para devolver el valor
	{
		return this.valor;
	}
	
	public void setValor(int nuevoValor) //metodo para modificar el valor horas o minutos
	{
	    if((nuevoValor >= 0) && (nuevoValor < limite))
	     {
		    this.valor = nuevoValor;
	     }
	}
	 
	public String getValorDelVisor() //solicta el estado del valor
	{ 
		if (this.valor<10)//9.30
		{
			return "0" + this.valor;
		}
		else 
		{
			return "" + this.valor;
	    }
	 }
	
	public void setIncrementar() //set porque no retorna nada
	{
	    this.valor = (this.valor + 1) % this.limite; //incrementamos valor en 1
	    // ejemplo
	    //this.valor++; // this.valor+1
	    //if (this.valor == this.limite)// vwrificamos si llego al limite
	    //this.valor=0; //en caso de verdadero volver a 0
	}
	
	
	}
	


