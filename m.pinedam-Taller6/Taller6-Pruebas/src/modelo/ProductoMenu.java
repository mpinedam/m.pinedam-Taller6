package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import procesamiento.Restaurante;

public class ProductoMenu {

	private String nombre;
	private int preciobase;

	public ProductoMenu(String nombre, int preciobase) {
		this.nombre = nombre;
		this.preciobase = preciobase;
		
		
	}
	
	
	public String darNombre() {
		return nombre;
	}
	
	public int darPrecio() {
		
		return preciobase;
	}
	
	public static Integer calcularPrecioProducto(String producto) throws FileNotFoundException, IOException {
		HashMap<String, Integer> mapaProductos = new HashMap<String, Integer>();
		mapaProductos = Restaurante.unirMapas();
		Integer precio = mapaProductos.get(producto);
		
		return precio;
		
		
	}
	
}
