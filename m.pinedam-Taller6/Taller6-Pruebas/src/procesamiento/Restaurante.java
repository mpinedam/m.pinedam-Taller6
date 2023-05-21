package procesamiento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import excepciones.PrecioProductoException;
import modelo.Combo;
import modelo.Pedido;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Restaurante {
	
	
	public static ArrayList<String> agregarElemento(String nombreCliente, String direccionCliente, ArrayList<Integer> listaPedido) throws FileNotFoundException, IOException{
		ArrayList<String> productos_total = new ArrayList<String>();
		Map<String, Integer> mapafinal = unirMapas();
		
		
		for (int i=0; i<=(listaPedido.size()-1); i++) {
			
			
			Integer pos = listaPedido.get(i);
			if (pos == 1) {
				String pedido = "corral";
				productos_total.add(pedido);
			}
			else if (pos == 2) {
				String pedido = "corral queso";
				productos_total.add(pedido);
			}
			else if (pos == 3) {
				String pedido = "corral pollo";
				productos_total.add(pedido);
			}	
			else if (pos == 4) {
				String pedido = "corralita";
				productos_total.add(pedido);
			}	
			else if (pos == 5) {
				String pedido = "todoterreno";
				productos_total.add(pedido);
			}		
			else if (pos == 6) {
				String pedido = "1/2 libra";
				productos_total.add(pedido);
			}	
			else if (pos == 7) {
				String pedido = "especial";
				productos_total.add(pedido);
			}	
			else if (pos == 8) {
				String pedido = "casera";
				productos_total.add(pedido);
			}	
			else if (pos == 9) {
				String pedido = "mexicana";
				productos_total.add(pedido);
			}	
			else if (pos == 10) {
				String pedido = "criolla";
				productos_total.add(pedido);
			}	
			else if (pos == 11) {
				String pedido = "costeña";
				productos_total.add(pedido);
			}	
			else if (pos == 12) {
				String pedido = "hawaiana";
				productos_total.add(pedido);
			}	
			else if (pos == 13) {
				String pedido = "wrap de pollo";
				productos_total.add(pedido);
			}	
			else if (pos == 14) {
				String pedido = "wrap de lomo";
				productos_total.add(pedido);
			}	
			else if (pos == 15) {
				String pedido = "ensalada mexicana";
				productos_total.add(pedido);
			}	
			else if (pos == 16) {
				String pedido = "papas medianas";
				productos_total.add(pedido);
			}
			else if (pos == 17) {
				String pedido = "papas grandes";
				productos_total.add(pedido);
			}
			else if (pos == 18) {
				String pedido = "papas en casco medianas";
				productos_total.add(pedido);
			}
			else if (pos == 19) {
				String pedido = "papas en casco grandes";
				productos_total.add(pedido);
			}
			else if (pos == 20) {
				String pedido = "agua cristal sin gas";
				productos_total.add(pedido);
			}
			else if (pos == 21) {
				String pedido = "agua cristal con gas";
				productos_total.add(pedido);
			}
			else if (pos == 22) {
				String pedido = "gaseosa";
				productos_total.add(pedido);
			}
			else if (pos == 23) {
				String pedido = "combo corral";
				productos_total.add(pedido);
			}
			else if (pos == 24) {
				String pedido = "combo corral queso";
				productos_total.add(pedido);
			}
			else if (pos == 25) {
				String pedido = "combo todoterreno";
				productos_total.add(pedido);
			}
			else if (pos == 26) {
				String pedido = "combo especial";
				productos_total.add(pedido);
			}
			else if (pos == 27) {
				String pedido = "lechuga";
				productos_total.add(pedido);
			}
			else if (pos == 28) {
				String pedido = "tomate";
				productos_total.add(pedido);
			}
			else if (pos == 29) {
				String pedido = "cebolla";
				productos_total.add(pedido);
			}
			else if (pos == 30) {
				String pedido = "huevo";
				productos_total.add(pedido);
			}
			else if (pos == 31) {
				String pedido = "queso americano";
				productos_total.add(pedido);
			}
			else if (pos == 32) {
				String pedido = "tocineta express";
				productos_total.add(pedido);
			}
			else if (pos == 33) {
				String pedido = "papa callejera";
				productos_total.add(pedido);
			}
			else if (pos == 34) {
				String pedido = "pepinillos";
				productos_total.add(pedido);
			}
			else if (pos == 35) {
				String pedido = "cebolla grille";
				productos_total.add(pedido);
			}
			else if (pos == 36) {
				String pedido = "suero costeño";
				productos_total.add(pedido);
			}
			else if (pos == 37) {
				String pedido = "frijol refrito";
				productos_total.add(pedido);
			}
			else if (pos == 38) {
				String pedido = "queso fundido";
				productos_total.add(pedido);
			}
			else if (pos == 39) {
				String pedido = "tocineta picada";
				productos_total.add(pedido);
			}
			else if (pos == 40) {
				String pedido = "piña";
				productos_total.add(pedido);
			}
		
		}
		
		ArrayList<String> pedidoFinal = Pedido.agregarProducto(productos_total, nombreCliente, direccionCliente);
		
		return pedidoFinal;
		
		
		
			
	}

	public static HashMap<String, Integer> unirMapas() throws FileNotFoundException, IOException{
		
		HashMap<String, Integer> mapafinal = LoaderRestaurante.cargarMenu();
		Map<String, Integer> mapaC = Combo.CalcularPrecioCombos();
		Map<String, Integer> mapaI = LoaderRestaurante.cargarIngredientes();
		
		
		for (Entry<String, Integer> entry : mapaC.entrySet()) {
			String llaves = entry.getKey();
			Integer valores = entry.getValue();
			
			mapafinal.put(llaves, valores);
		}

		for (Entry<String, Integer> entry : mapaI.entrySet()) {
			String llaves = entry.getKey();
			Integer valores = entry.getValue();
			
				
			mapafinal.put(llaves, valores);
		}
		
		
		return mapafinal;
		
	}
	

	
	
}
