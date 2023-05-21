package excepciones;

import java.util.ArrayList;

public class ProductoRepetidoException extends HamburguesaException{
	
	public static ArrayList<String> productoRepetidoEx(ArrayList<String> listaProductos) throws Exception {
		for (int i = 0; i <= (listaProductos.size()-1); i++) {			
			int contador = 0;
			for (int j = 0; j <= (listaProductos.size()-1); j++) {
				if (listaProductos.get(i).equals(listaProductos.get(j))) {
					contador = contador + 1;
				}
			}
			
		if (contador > 1)
			
			throw new Exception("El producto esta repetido");
		
			
		}
		return listaProductos;

}
}
