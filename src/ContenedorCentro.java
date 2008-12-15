import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;


public class ContenedorCentro extends JPanel {
	public ContenedorCentro(Dimension dim){
		setSize(dim.width-500,dim.height-28);
		setLocation(250,0);
		//setBackground(Color.RED);
		setLayout(null);
		setOpaque(true);
        setVisible(true);
	}
}
