
public class Detective {
	private String nombreJugador;
	private int fichasDeAccion = 2;
	private boolean gastoSusFichas;
	private int contadorTurnos;
	private boolean haGanado;
	
	public Detective(String n) {
		nombreJugador= n;
		gastoSusFichas= false;
		contadorTurnos= 0;
		haGanado= false;
	}
	
	public String getNombre() {
		return nombreJugador;
	}
	
	public boolean getGastoSusFichas() {
		if(fichasDeAccion == 0) 
			return true;
		return false;
	}
	
	public int getFichasDeAccion() {
		return fichasDeAccion;
	}
	
	public int cantTurnos() {
		return contadorTurnos;
	}
	
	public void haGanado() {
		haGanado= true;
	}
	
	public static void actualizarDatos() {
		//
	}
	public static Detective obtenerDatos() {
		return null;
	}

}
