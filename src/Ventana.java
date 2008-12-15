import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.*;

public class Ventana {
	private JFrame ventana;
	private Dimension dim;
	private JPopupMenu menu;
	private ContenedorIzquierdo CIzq;
	private ContenedorPrincipal CPrin;
	private ContenedorDerecho CDer;
	private ContenedorCentro CCen;
	
	public Ventana(){
		/*
		 * Cramos nuestra Ventana principal que contendra a los paneles
		 */
		dim=Toolkit.getDefaultToolkit().getScreenSize();
		ventana =new JFrame("Slide");		
		ventana.setSize(dim.width,dim.height-28);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	BorderLayout bord = new BorderLayout();
        ventana.setLayout(bord);
	//	ventana.setLayout(null);
        crearToolBar();
        crearMenu();
		iniciarContenedores();	
	//	ventana.pack();
	    ventana.setVisible( true );
	
	}	
	public void iniciarContenedores(){
		/*
		 * Creamos los paneles que contendra nuestra ventana principal
		 */		
		CPrin=new ContenedorPrincipal(dim);
		CPrin.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		ventana.add(CPrin);
		
	/**	CIzq=new ContenedorIzquierdo(dim);
		CDer=new ContenedorDerecho(dim);
	//	CPrin=new ContenedorPrincipal(dim);
		CCen=new ContenedorCentro(dim);
		/*
		 * Ponemos bordes a nuestros a los paneles 
		 *		 		
		CCen.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		CDer.setBorder(new EtchedBorder());
	//	CPrin.setBorder(new EtchedBorder());
		CIzq.setBorder(new EtchedBorder());
		
		/*
		 * insertamos nuestros paneles a la ventana principal
		 *
		
	//	ventana.add(CPrin);		
		ventana.add(CIzq,BorderLayout.WEST);
		ventana.add(CCen,BorderLayout.CENTER);
		ventana.add(CDer,BorderLayout.EAST);
	*/	
	/*	contenedorIzq = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,CPrin,CDer);	
		contenedorIzq.setContinuousLayout(true);
		contenedorIzq.setOneTouchExpandable(true);
		contenedorIzq.setDividerLocation(200);
		contenedorIzq.setBackground(Color.cyan);
		ventana.getContentPane().add(contenedorIzq,BorderLayout.CENTER);
		//ventana.setBackground(Color.BLACK);
		contenedorDer = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,CPrin,CIzq);		
		contenedorDer.setContinuousLayout(true);
		contenedorDer.setOneTouchExpandable(true);
		contenedorDer.setDividerLocation(200);
		contenedorDer.setBackground(Color.BLUE);
		ventana.getContentPane().add(contenedorDer,BorderLayout.CENTER);
	*/
	}
	public void crearToolBar(){
		// create icons
        ImageIcon AdelanteIcon = new ImageIcon("imagen/adelante.gif");
        ImageIcon AtrasIcon = new ImageIcon("imagen/atras.gif");
        ImageIcon PdfIcon = new ImageIcon("imagen/pdf.jpg");
        ImageIcon AbrirIcon = new ImageIcon("imagen/abrir.gif");
        ImageIcon ImpresoraIcon = new ImageIcon("imagen/impresora.gif");
        ImageIcon VerIcon = new ImageIcon("imagen/ver.gif");
        ImageIcon NuevoIcon = new ImageIcon("imagen/nuevo.gif");
        
        // create buttons
        JButton adelante = new JButton(AdelanteIcon);
        JButton atras = new JButton(AtrasIcon);
        JButton pdf = new JButton(PdfIcon);
        JButton abrir = new JButton(AbrirIcon);
        JButton impresora = new JButton(ImpresoraIcon);
        JButton ver = new JButton(VerIcon);
        JButton nuevo = new JButton(VerIcon);
        
        JToolBar bar = new JToolBar();
        bar.add(nuevo);
        bar.add(abrir);
        bar.addSeparator();
        bar.add(pdf);
        bar.add(impresora);
        bar.addSeparator();
        bar.add(adelante);
        bar.add(atras);
        bar.add(ver);
        
        // JtoolBar de texto
              
       ventana.add("North", bar);     
    //    ventana.add(bar,"NORTH");        
		bar.setFloatable(false);
	}
	public void crearMenu(){
		JMenuBar menubar = new JMenuBar();
		
		JMenu Archivo = new JMenu("Archivo");
		JMenu Editar = new JMenu("Editar");
		JMenu Ver = new JMenu("Ver");
		JMenu Insertar = new JMenu("Insertar");
		JMenu Formato = new JMenu("Formato");
		JMenu Presentacion = new JMenu("Precentacion");
		JMenu Ayuda = new JMenu("Ayuda");
		
		//items de Archivo
		JMenuItem nuevo = new JMenuItem("nuevo");
        JMenuItem abrir = new JMenuItem("abrir");
        JMenuItem guardar = new JMenuItem("guardar");
        JMenuItem guardarComo = new JMenuItem("guardar como");
        JMenuItem cerrar = new JMenuItem("cerrar");
        JMenuItem imprimir = new JMenuItem("imprimir");
        JMenuItem terminar = new JMenuItem("termiar"); 
        Archivo.add(nuevo);
        Archivo.add(abrir);
        Archivo.addSeparator();
        Archivo.add(cerrar);
        Archivo.add(guardar);
        Archivo.add(guardarComo);
        Archivo.addSeparator();
        Archivo.add(imprimir);
        Archivo.addSeparator();
        Archivo.add(terminar);
        
        //items de Editar
        JMenuItem deshacer = new JMenuItem("deshacer");
        JMenuItem restaurar = new JMenuItem("restaurar");
        JMenuItem cortar = new JMenuItem("cortar");
        JMenuItem copiar = new JMenuItem("copiar");
        JMenuItem pegar = new JMenuItem("pegar");
        JMenuItem seleccionar = new JMenuItem("seleccionar todo");
        Editar.add(deshacer);
        Editar.add(restaurar);
        Editar.addSeparator();
        Editar.add(cortar);
        Editar.add(copiar);
        Editar.add(pegar);
        Editar.addSeparator();
        Editar.add(seleccionar);
        
        // Items de Ver
        JMenuItem normal = new JMenuItem("normal");
        JMenuItem organizador = new JMenuItem("organizador de diapositivas");
        JMenuItem precentacion = new JMenuItem("precentacion");
        Ver.add(normal);
        Ver.add(organizador);
        Ver.add(precentacion);
        
        // Items de Insertar
        JMenuItem diapositiva = new JMenuItem("diapositiva");
        JMenuItem fecha = new JMenuItem("fecha y hora");
        JMenuItem numpag = new JMenuItem("numero de paginas");
        JMenuItem imagen = new JMenuItem("imagen");
        JMenuItem video = new JMenuItem("video sonido");        
        Insertar.add(diapositiva);
        Insertar.add(numpag);
        Insertar.add(fecha);
        Insertar.addSeparator();
        Insertar.add(imagen);
        Insertar.add(video);
        
        //aniadimos al MenuBar        
        menubar.add(Archivo);
        menubar.add(Editar);
        menubar.add(Ver);
        menubar.add(Insertar);
        menubar.add(Formato);
        menubar.add(Presentacion);
        menubar.add(Ayuda);
        
        
        ventana.setJMenuBar(menubar);
        
	}
}
