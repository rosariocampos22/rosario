package EjemploLis_Pila;
import java.util.*;

public class clases {
	
	public static ArrayList <Auto> listadoAutos = new ArrayList<Auto>(); //lsita
	public static Stack<Auto> pilaAutos = new Stack<Auto>(); //pila
	public static LinkedList<Auto> colaAutos = new LinkedList<Auto>(); //cola 
	public static HashMap <Interger, String> miDiccionario = new HashMap<Interger,String>();
	
	
	
	public static void main(String[] args) {
		
		miDiccionario.put(35750818, "Gomez Guillermo Luis");
		miDiccionario.put(40118820, "Campos Rosario Belen");
		miDiccionario.put(41654526, "Nicola Matias");
		miDiccionario.put(39420269, "Campos Ana Laura");
		miDiccionario.put(12814362, "Campos Hugo Alberto");
		
		Iterador it = miDiccionario.keySet().iterador();
		while(it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("DNI: " + key + " -> Nombre: " + miDiccionario.get(key));
			
		}
		
		Auto auto1 = new Auto ("VW01", "VW", "VENTO", "2.5", "NAFTA");
		Auto auto2 = new Auto ("VW02", "VW", "GOL TREND", "1.6", "NAFTA");
		Auto auto3 = new Auto ("FO01", "FORD", "FOCUS", "2.0", "DIESEL");
		Auto auto4 = new Auto ("PE01", "PEUGEOT", "208", "1.5", "ELECTRICO");
		Auto auto5 = new Auto ("CH01", "CHEVROLET", "CRUZE", "2.0", "HIBRIDO");
		
		listadoAutos.add(auto1);
		listadoAutos.add(auto2);
		listadoAutos.add(auto3);
		listadoAutos.add(auto4);
		listadoAutos.add(auto5);
		
		pilaAutos.push(auto1);
		pilaAutos.push(auto2);
		pilaAutos.push(auto3);
		pilaAutos.push(auto4);
		pilaAutos.push(auto5);
		
		colaAutos.offer(auto1);
		colaAutos.offer(auto2);
		colaAutos.offer(auto3);
		colaAutos.offer(auto4);
		colaAutos.offer(auto5);
		
		
		
		System.out.println(listadoAutos.size());
		System.out.println(pilaAutos.size());
		System.out.println(colaAutos.size());
		
		for(int i=0; i<3; i++)
		{
			System.out.println(listadoAutos.get(i).resumenAuto());//recorrimos la lista y muestra
			//System.out.println(pilaAutos.pop().resumenAuto()); //para mostrar la pila
			//System.out.println(colaAutos.poll().resumenAuto());  
		}
		
		
		
		
		
		
		
	}
}
	
class Auto
	{
		private String codigo;
		private String marca;
		private String modelo;
		private String motor;
		private String combustible;
		
		
		public Auto (String codigo, String marca, String modelo, String motor, String combustible)
		{
			this.codigo = codigo;
			this.marca = marca;
			this.modelo = modelo;
			this.motor = motor;
			this.combustible = combustible;
		}
		
	

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getMotor() {
			return motor;
		}

		public void setMotor(String motor) {
			this.motor = motor;
		}

		public String getCombustible() {
			return combustible;
		}

		public void setCombustible(String combustible) {
			this.combustible = combustible;
		}
		
		public String resumenAuto()
		{
			return getMarca() + " - " + getModelo() + " - " + getMotor + " - " + getCombustible();
		}
		
}

class calendario {
	
}




