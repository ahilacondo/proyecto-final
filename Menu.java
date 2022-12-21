import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Menu extends JFrame implements intrucciones{
    private static final int ANCHO = 800;
    private static final int ALTO = 500;
    private JPanel botonesCentro, estadisticas, textGuia;
    private JButton iniciarJuego;
    private JButton creditos;
    private JButton historial;
    private JButton guia;
    private JButton regresar;
    private JLabel imagen;
    private boolean viendoPuntajes;
    private Detective jug1, jug2;
    
    public Menu() {
        setTitle("Bienvenido a Duelo de Detectives");
        setSize(ANCHO, ALTO);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();    
        setVisible(true);
    } 
    
    public void createContents() {
        imagen = new JLabel();
        imagen.setBounds(0,0,this.getWidth(),this.getHeight());
        
        botonesCentro = new JPanel(new GridLayout(2, 2));      
        iniciarJuego = new JButton("Nuevo Juego");
        cambios(iniciarJuego);
        creditos = new JButton("Creditos");
        cambios(creditos);
        historial = new JButton("Historial de Juego");
        cambios(historial);
        guia = new JButton("Como jugar");
        cambios(guia);
        regresar = new JButton("Regresar");
        cambios(regresar);
        
        JTextArea instrucciones = new JTextArea(INSTRUCCIONES);
        instrucciones.setEditable(false);
        textGuia= new JPanel(new BorderLayout());
        textGuia.add(instrucciones);
        
        botonesCentro.add(iniciarJuego);      
        botonesCentro.add(historial);
        botonesCentro.add(guia);
        botonesCentro.add(creditos);
        
        iniciarJuego.addActionListener(new OpcionesPrincipales());
        creditos.addActionListener(new Creditos());
        historial.addActionListener(new OpcionesPrincipales());
        guia.addActionListener(new OpcionesPrincipales());
        regresar.addActionListener(new Regresar());
        botonesCentro.setPreferredSize(new Dimension(ANCHO, 100));
        
        ImageIcon duelo= new ImageIcon("duelo.jpg");
        imagen.setIcon(new ImageIcon(duelo.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
        add(imagen);
        add(botonesCentro, BorderLayout.SOUTH);      
    }
    
    private void cambios(JButton x) {
		x.setForeground(colorBoton);
		x.setBackground(fondoBoton);
		x.setFont(fuente);
	}

	private class OpcionesPrincipales implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            imagen.setVisible(false);
            botonesCentro.setVisible(false);
            viendoPuntajes = false;     
            if (e.getSource() == iniciarJuego) {
                setVisible(false);
                new Cuestionario();
            }
           // else if (e.getSource() == historial) {}
            	
            else {
            	textGuia.add(new JLabel("   INSTRUCCIONES:"), BorderLayout.NORTH);
                add(textGuia, BorderLayout.CENTER);
                add(regresar, BorderLayout.SOUTH);
                textGuia.setVisible(true);                
                regresar.setVisible(true);              
            }
        }
    }
    private class Creditos implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(Menu.this, CREDITOS);
        }
    }
    private class Regresar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	setSize(ANCHO, ALTO);
            if (viendoPuntajes)
                estadisticas.setVisible(false);            
            else 
                textGuia.setVisible(false);              
            regresar.setVisible(false);
            imagen.setVisible(true);
            botonesCentro.setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        new Menu();
    }


}
