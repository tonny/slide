package Plantillas;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

abstract class Template extends JPanel{
	int x,y,alto,ancho;
	public Template(){
		setBounds(10,10, 220, 120);
		setBackground(Color.BLACK);
		setVisible(true);
	}
	public void paintComponent( Graphics g ){
		super.paintComponent( g );
	     g.drawRect( 10, 10, 200, 100 );
	};
	
	public void dibujarTexto(int x,int y,int alto,int ancho){};
	public void dibujarTitulo(){};
	public void insertarImagen(){};
}
