import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;


public class ContenedorIzquierdo extends JPanel{
	public ContenedorIzquierdo(Dimension dim){
		setMinimumSize(new Dimension(100, dim.height));
	//	setPreferredSize(new Dimension(300, dim.height));
		setBounds(0,0,250,dim.height-28);
	//	setBackground(Color.BLACK);
		setLayout(null);
		setOpaque(true);
        setVisible(true);
		
	}
}
