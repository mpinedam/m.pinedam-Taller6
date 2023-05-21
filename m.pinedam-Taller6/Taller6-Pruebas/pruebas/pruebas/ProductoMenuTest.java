package pruebas;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import modelo.ProductoMenu;

public class ProductoMenuTest {

	@Test
	public void precioProductoTest() throws FileNotFoundException, IOException {
		assertTrue(ProductoMenu.calcularPrecioProducto("combo corral queso").equals(23850));
	}
	
	@Test
	public void precioProductoTest2() throws FileNotFoundException, IOException {
		assertTrue(ProductoMenu.calcularPrecioProducto("todoterreno").equals(25000));
	}
	
	@Test
	public void precioProductoTest3() throws FileNotFoundException, IOException {
		assertTrue(ProductoMenu.calcularPrecioProducto("costeña").equals(20000));
	}
	
	@Test
	public void precioProductoTest4() throws FileNotFoundException, IOException {
		assertTrue(ProductoMenu.calcularPrecioProducto("hawaiana").equals(20000));
	}
	
	@Test
	public void precioProductoTest5() throws FileNotFoundException, IOException {
		assertTrue(ProductoMenu.calcularPrecioProducto("gaseosa").equals(5000));
	}

}
