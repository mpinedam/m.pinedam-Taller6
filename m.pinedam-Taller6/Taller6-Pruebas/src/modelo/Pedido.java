package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import excepciones.PrecioProductoException;
import procesamiento.LoaderRestaurante;
import procesamiento.Restaurante;

public class Pedido {
	
	
	private int numeroPedido;
	private int idPedido;
	String nombreCliente;
	String direccionCliente;
	
	public Pedido(int numeroPedido, int idPedido, String nombreCliente, String direccionCliente) {
		this.numeroPedido = numeroPedido;
		this.idPedido = idPedido;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		
		
		
	}
	
	public int darNumPedido() {
		return numeroPedido;
	}
	
	public int darIdpedido() {
		return idPedido;
	}
	
	public static ArrayList<String> agregarProducto(ArrayList<String> productos_total, String nombreCliente, String direccionCliente ) throws FileNotFoundException, IOException{
		Map<String, Integer> mapafinal = Restaurante.unirMapas();
		
		ArrayList<String> pedidofinal = new ArrayList<>();
		pedidofinal.add(nombreCliente);
		pedidofinal.add(direccionCliente);
		
		int random = (int) (Math.random()*(5555-999))+5555;
		pedidofinal.add("12345");
		
		int sumaPrecios = 0;
		
		for (int i = 0; i <= productos_total.size()-1; i++) {
			
			String comida = productos_total.get(i);
			Integer precioprod = mapafinal.get(comida);
			String valormeterlista = comida + " -- " + precioprod;
			sumaPrecios = sumaPrecios + precioprod;
			pedidofinal.add(valormeterlista);
			

			try {
				PrecioProductoException.precioProductoEx(sumaPrecios, comida);
			}
			catch (Exception e) {
					System.out.println("Hubo error");
					System.out.println(e.getMessage());
					pedidofinal.remove(valormeterlista);
					sumaPrecios = sumaPrecios - precioprod;
				}
			
			
		}
		
		
		
		double iva = 0.19;
		double precioiva = sumaPrecios * iva;
		double finalpedido = sumaPrecios + precioiva;
		
		
		String neto = "Precio Neto --" + sumaPrecios;
		String ivaP = "IVA -- " + precioiva;
		String precioTotal = "Total -- " + finalpedido;
		
		pedidofinal.add(neto);
		pedidofinal.add(ivaP);
		pedidofinal.add(precioTotal);
		String cadena = " ";
		
		int random2 = (int) (Math.random()*(2000-0))+200;
		pedidofinal.add("Calorias -- " + "2000");
		
		for (int i = 0; i<= pedidofinal.size()-1; i++) {
			String linea = pedidofinal.get(i);
			System.out.println(linea);
			cadena = cadena + ";" + linea;	
			
			generarArchivoTexto(cadena);
		}
		
		mapaCompletoPedidos(pedidofinal);
		
		return pedidofinal;
			
	}
	
	private static void generarArchivoTexto (String cadena) {
		try {
            String ruta = "facturas/pedido.txt";
            String escribir = cadena;
            File file = new File(ruta);
 
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(escribir);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
		
		
	}

private static HashMap<String, ArrayList<String>> mapaPedidosGen = new HashMap<String, ArrayList<String>>();
	
	
	public static HashMap<String, ArrayList<String>> mapaCompletoPedidos (ArrayList<String> listaPedido){
		String llave = listaPedido.get(2);
		
		mapaPedidosGen.put(llave, listaPedido);
		
		
		if (mapaPedidosGen.size() > 1) {
			for (Entry<String, ArrayList<String>> entry : mapaPedidosGen.entrySet()) {
				List<String> valor = entry.getValue();
				List<String> valorusar = valor.subList(3, valor.size()-4);
				List<String> valornuevo = listaPedido.subList(3, listaPedido.size()-4);
				ArrayList<String> vof = new ArrayList<>();
				
				
				
				for (int i = 0; i <= valorusar.size()-1; i++) {
					for (int j= 0; i<= valornuevo.size()-1; i++) {
						String comida1 = valorusar.get(i);
						String comida2 = valorusar.get(j);
						if (comida1.equals(comida2) == true) {
							vof.add("True");
						if (comida1.equals(comida2) == false) {
							vof.add("False");
						}
						}
							
				if (vof.contains("False") == true) {
					System.out.println("No existe un pedido igual");
				} else {
					System.out.println("Ya existe un pedido igual realizado previamente");
				}
					
						
				}
					
				
					}
					
				}
			}
				
			
		
		

		
		return mapaPedidosGen;
		
	}
	
	
	

		
		
	}
	
	

