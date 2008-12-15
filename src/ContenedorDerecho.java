import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.plaf.BorderUIResource;


public class ContenedorDerecho extends JPanel{
	private Dimension dim;
	private JPanel disenio,template;
	public ContenedorDerecho(Dimension dim){
		this.dim=dim;
		setBounds(dim.width-250,0,250,dim.height-28);
//		setMinimumSize(new Dimension(100, dim.height-28));
	//	setPreferredSize(new Dimension(200, dim.height));
	//	setBackground(Color.GREEN);
		setLayout(null);
		crearPanel();
		crearSlide();
		setOpaque(true);
        setVisible(true);
	}
	public void crearPanel(){
		JTabbedPane pa= new JTabbedPane();
		pa.setBounds(0,0,250,dim.height-28);
		disenio = new JPanel();
		template = new JPanel();
		//template.setLayout(null);
		pa.add("diseño",disenio);
		pa.add("template",template);
		add(pa);
	}
	public void crearSlide(){
	 /*	JTextArea edit = new JTextArea(8, 40);
		edit.setBounds(0, 0, 100,100);
        JScrollPane scroll = new JScrollPane(edit);
        template.add(scroll);
        */
	   JPanel pan=new JPanel();
	   pan.setBounds(10, 10, 200,100);
	   pan.setBackground(Color.GREEN);
	  // pan.setLayout(null);
	   template.add(pan);
	   repaint();
	}
/*	public static void main(String[] args) {
		   Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		   JFrame frame=new JFrame();
		   ContenedorDerecho p =new ContenedorDerecho(dim);
		   frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		   frame.setSize(dim.width,dim.height);
		   frame.setLayout(null);
		   frame.add(p);
		   frame.setVisible(true);
	}*/
}
