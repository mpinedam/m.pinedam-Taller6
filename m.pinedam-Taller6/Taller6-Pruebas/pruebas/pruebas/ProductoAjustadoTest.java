package pruebas;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import modelo.ProductoAjustado;

public class ProductoAjustadoTest {

	@Test
	public void productoTest() throws FileNotFoundException, IOException {
		assertTrue(ProductoAjustado.obtenerPrecioProductoAjustado("lechuga").equals(1000));
		
	}

}
