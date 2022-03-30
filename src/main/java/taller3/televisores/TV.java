package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	public static int numTV=0;
	
	public TV (Marca marca, boolean estado) {
		this.marca= marca;
	    this.estado= estado;
	}
	public TV (int valorCanal, int valorVolumen, int valorPrecio) {
		canal=1;
		volumen= 1;
		precio= 500;
	}
	 public void setMarca(Marca marca) {
	    	this.marca = marca;
	    }
	 public Marca getMarca() {
	    	return this.marca;
	    }
	public void setCanal(int canal) {
		this.canal=canal;
	}
	public int getCanal() {
		return this.canal;
	}
	public void setPrecio(int precio) {
		this.precio= precio;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setVolumen(int volumen) {
		this.volumen= volumen;
	}
	public int getVolumen() {
		return this.volumen;
	}
	public void setControl(Control control) {
    	this.control = control;
    }
 public Marca getControl() {
    	return this.control;
    }
 public class Conteo{
	 public static void main(String [] args) {
		 System.out.println(TV.numTV);
	 }
 }
	
 public boolean getEstado() {
	 return this.estado;
 }
 
} 

