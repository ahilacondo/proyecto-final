import java.awt.Color;
import java.awt.Font;

interface intrucciones {
	String INSTRUCCIONES= """
			'Duelo de Detectives'\n
			--> Juego de 2 jugadores competitivo, en el que tendran que tomar el rol de un detective
			--> Una persona fue acusa de un delito, tanto los agraviados y los padres del acusado contratan un detective
			--> con la intenci�n de demostrar la culpa e inocencia respectivamente, para ello tienen 7 d�as.
			--> Cada jugador posee 2 fichas de accion con las que podr� visitar a los personajes y activar sus habilidades.
			--> Cada personaje posee una habilidad diferente que se le presentara al colocar su ficha de accion sobre �l, depende del jugador si activar la habilidad del personaje.
			--> Los personajes iran apareciendo aleatoriamente (uno) por cada d�a que pase, excepto el primer d�a que se generan 3 personajes automaticamente
			--> Pasado la semana, gana el Detective que posea m�s y mejores pistas.
			--> Si tiene alguna duda puede encontrar nuestro correo en los cr�ditos.
			              """;
	Color colorBoton= Color.BLACK;
	Color fondoBoton= new Color(96, 147, 172);
	Font fuente= new Font("OCR-A BT",0,20);

}
