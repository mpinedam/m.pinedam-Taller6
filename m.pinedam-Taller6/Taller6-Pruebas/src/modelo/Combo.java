package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import procesamiento.LoaderRestaurante;

public class Combo {
	
	public double descuento;
	public String nombreCombo;
	
	
	private Combo (double descuento, String nombreCombo) {
		this.descuento = descuento;
		this.nombreCombo = nombreCombo;
	}
		
		
	private double darDescuento() {
			return descuento;
	}
		
	private String darNombreCombo() {
			return nombreCombo;
		}
	
	
		
	public static Map<String,Integer> CalcularPrecioCombos() throws FileNotFoundException, IOException{
		HashMap<String,Integer> precioFinalC = new HashMap<String,Integer>();
		Map<String, List<String>> mapa = LoaderRestaurante.cargarCombos();
		Map<String, Integer> mapaProds = LoaderRestaurante.cargarMenu();
		
		for (Entry<String, List<String>> entry : mapa.entrySet()) {
			int precioCombosinD = 0;
			List<String> listaprods = entry.getValue();
			for (int i = 1; i <= listaprods.size()-1; i++) {
				String comida = listaprods.get(i);
				int precioComida = mapaProds.get(comida);
				precioCombosinD = precioCombosinD + precioComida;
				
				String descuento = listaprods.get(0);
				String[] numeroUsar = descuento.split("%");
				float numeroFinal = 1-(Float.parseFloat(numeroUsar[0]))/100;
				Integer precioCombo = (int) (precioCombosinD * numeroFinal);
						
				
				precioFinalC.put(entry.getKey(), precioCombo);
				
				
			}
				
				
			
		} 
		
		
		return precioFinalC;
		
		
		
	}
	
}



