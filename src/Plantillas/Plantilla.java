package Plantillas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Plantilla extends Template {
	public Plantilla(){
		super();
	}
	@Override
	public void paintComponent( Graphics g ){
		super.paintComponent( g );
	     g.drawRect( 10, 10, 200, 100 );
	     
	}
	
   public static void main(String[] args) {
	   JFrame frame = new JFrame();
	   Plantilla p=new Plantilla();
	   JPanel pan=new JPanel();
	   pan.setBounds(0, 0, 300,300);
	   pan.setBackground(Color.GREEN);
	   pan.setLayout(null);
	   pan.add(p);
	   frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   frame.setSize(400,350);
	   frame.setLayout(null);
	   frame.add(pan);
	   frame.setVisible(true);
   }	

}
