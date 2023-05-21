package excepciones;

@SuppressWarnings("serial")
public class PrecioProductoException extends Exception{
	
	public static int precioProductoEx(int precio, String producto) throws Exception{
		
		if (precio > 150000){
			throw new Exception("El producto "+ producto + " no se puede agregar");
		}
		return precio;
		
	}

}
