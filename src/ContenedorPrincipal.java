import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;


public class ContenedorPrincipal extends JPanel{
	private ContenedorIzquierdo CIzq;
	private ContenedorDerecho CDer;
	private ContenedorCentro CCen;
	private Dimension d;
	public ContenedorPrincipal(Dimension dim){
		d=dim;
	//	setMinimumSize(new Dimension(100, dim.height));
	//	setPreferredSize(new Dimension(300, dim.height));
	//	setSize(dim.width,dim.height);
	//	setLocation(0,0);
	//	setBackground(Color.MAGENTA);
		setLayout(null);
		iniciarContenedores();
		setOpaque(true);
        setVisible(true);
		
	}
	public void iniciarContenedores(){
		/*
		 * Creamos los paneles que contendra nuestra ventana principal
		 */		
		CIzq=new ContenedorIzquierdo(d);
		CDer=new ContenedorDerecho(d);
		CCen=new ContenedorCentro(d);
		/*
		 * Ponemos bordes a nuestros a los paneles 
		 */		 		
		CCen.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		CDer.setBorder(new EtchedBorder());	
		CIzq.setBorder(new EtchedBorder());
		
		/*
		 * insertamos nuestros paneles a la ventana principal
		 */
					
		add(CIzq);
		add(CCen);
		add(CDer);
		
	
	}
}
