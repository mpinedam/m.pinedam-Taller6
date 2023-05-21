package excepciones;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class IngredienteRepetidoException extends HamburguesaException{
	
	
	
	public static ArrayList<String> productoRepetidoEx(ArrayList<String> listaIngredientes) throws Exception {
		for (int i = 0; i <= (listaIngredientes.size()-1); i++) {			
			int contador = 0;
			for (int j = 0; j <= (listaIngredientes.size()-1); j++) {
				if (listaIngredientes.get(i).equals(listaIngredientes.get(j))) {
					contador = contador + 1;
				}
			}
			
		if (contador > 1)
			
			throw new Exception("El ingrediente esta repetido");
		
			
		}
		return listaIngredientes;

}
	
}

