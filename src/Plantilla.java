import junit.framework.TestCase;

public class Plantilla extends TestCase {
	
	public void verificarNombre(){
		assertEquals("sencillo",PlantillaDemo.getNombre());
	}
	public void agregartexto(){
		assertEquals("texto", PlantillaDemo.getTexto());
	}
}
