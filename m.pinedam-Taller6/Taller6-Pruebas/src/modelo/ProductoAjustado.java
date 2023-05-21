package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ProductoAjustado {
	
	private ProductoMenu base;
	
	public ProductoAjustado(ProductoMenu base) {
		this.base = base;

	}
	
	
	public static Integer obtenerPrecioProductoAjustado(String producto) throws FileNotFoundException, IOException{
		Integer precio = ProductoMenu.calcularPrecioProducto(producto);
		
		return precio;
		
		
	}

}
