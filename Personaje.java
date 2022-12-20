import java.util.*;

public class Personaje implements nombres{
	private String habilidad, ubicacion, nombre;
	private boolean habilidadActivada= false;
	
	public Personaje(String h) {
		habilidad= h;
		generarNombre();
	}
	public void generarNombre() {
		int sexo= (int)(Math.random()*2)+1;
		int aleatorio= (int)(Math.random()*5)+1;
		
		if(sexo == 1) 
			nombre= nombresVarones[aleatorio];
		else
			nombre= nombresMujeres[aleatorio];
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean getHabilidadActivada() {
		return habilidadActivada;
	}
	
	public void activarHabilidad() {
		habilidadActivada= true;
	}
	
	public void desactivarHabilidad() {
		habilidadActivada= false;
	}
	
	public String getHabilidad() {
		return habilidad;
	}
	
	public int getNfila() {
		return Integer.parseInt(ubicacion.substring(0, ubicacion.length() - 1));
	}
		
	public int getNcolumna() {
		int large= ubicacion.length();
		return (int)ubicacion.charAt(large - 1);	
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	
	
	

}
