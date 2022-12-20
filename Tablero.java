import java.util.ArrayList;

public class Tablero {
	private ArrayList<ArrayList <Dia>> tableroDePersonajes;
	private int dia;
	
	public Tablero() {
		tableroDePersonajes= new ArrayList<ArrayList <Dia>>();
		inicializarTablero();
		dia= 1;
	}
	
	public void inicializarTablero() {
		tableroDePersonajes.clear();
		for(int i= 0;i < 2; i++) {
            tableroDePersonajes.add(new ArrayList<>());
            for(int j= 0;j < 6; j++)
                tableroDePersonajes.get(i).add(null);
		}
	}
	public ArrayList<ArrayList<Dia>> getTablero(){
		return tableroDePersonajes;
	}
	
	public void generarDia() {
		Dia diaAux;
		switch(dia) {
		case 1 -> {
			//Se generan 3 aleatorios automaticamente y otros 2 por ser día 1
		}
		case 2, 3, 4, 5, 6, 7-> {
			//Dias normales se genera un personaje por día
		}
		
		}
	}


}
