package Clases;

public class VisorDeReloj {
	
	private VisorDeNumero horas; //limite y valor - declaracion de un objeto
	private VisorDeNumero minutos; //limite y valor
    private String cadVisor; //simula el visor 
    
    public VisorDeReloj()//signatura del metodo constructor
    {
    	this.horas = new VisorDeNumero(24); //horas va a tener su limite = 24 y su valor = 0- INICIALIZANDO
    	this.minutos = new VisorDeNumero(60); // va a tener su limite = 60 y su valor = 0 
    	actualizarVisor(); //cadVisor 00:00
    }
    public VisorDeReloj(int hora, int minuto)
    {
        this.horas = new VisorDeNumero(24); //se tuliza el this para referirnos a atributo de la clase
        this.minutos = new VisorDeNumero(60);
        ponerEnHora(hora, minuto);
    }
    private void actualizarVisor()
    {
        cadVisor = horas.getValorDelVisor() + ":" + minutos.getValorDelVisor(); 
    }
	
    public void ponerEnHora(int hora, int minuto)
    {
       horas.setValor(hora);
       minutos.setValor(minuto);
       actualizarVisor();
    }
    public void ticTac()
     {
        minutos.setIncrementar();
        if(minutos.getValor() == 0) 
          { 
    	    horas.setIncrementar();
    	  }
    	   actualizarVisor();
    }	   
    public String getHora()
     {
    	 return cadVisor;
     }
}
 