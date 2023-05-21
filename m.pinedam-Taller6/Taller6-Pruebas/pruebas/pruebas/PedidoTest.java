package pruebas;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import modelo.Pedido;

public class PedidoTest {

	@Test
	public void agregarProductoTest() throws FileNotFoundException, IOException {
		ArrayList<String> pedido = new ArrayList<String>();
		pedido.add("combo corral queso" );
		pedido.add("combo especial");
		
		ArrayList<String> listaPedidoCompleto = new ArrayList<String>();
		listaPedidoCompleto.add("Mariana");
		listaPedidoCompleto.add("Casa32");
		listaPedidoCompleto.add("12345");
		listaPedidoCompleto.add("combo corral queso -- 23850");
		listaPedidoCompleto.add("combo especial -- 32085");
		listaPedidoCompleto.add("Precio Neto --55935");
		listaPedidoCompleto.add("IVA -- 10627.65");
		listaPedidoCompleto.add("Total -- 66562.65");
		listaPedidoCompleto.add("Calorias -- 2000");
		
		assertEquals(listaPedidoCompleto, Pedido.agregarProducto(pedido, "Mariana", "Casa32"));
		
		
		
	}
	
	@Test 
	public void mapaCompletoTest() {
		HashMap<String, ArrayList<String>> mapaPedidos = new HashMap<String, ArrayList<String>>();
		
		
		ArrayList<String> listaPedidoCompleto = new ArrayList<String>();
		listaPedidoCompleto.add("Mariana");
		listaPedidoCompleto.add("Casa32");
		listaPedidoCompleto.add("12345");
		listaPedidoCompleto.add("combo corral queso -- 23850");
		listaPedidoCompleto.add("combo especial -- 32085");
		listaPedidoCompleto.add("Precio Neto --55935");
		listaPedidoCompleto.add("IVA -- 10627.65");
		listaPedidoCompleto.add("Total -- 66562.65");
		listaPedidoCompleto.add("Calorias -- 2000");
		
		mapaPedidos.put("12345", listaPedidoCompleto);
		
		assertEquals(mapaPedidos, Pedido.mapaCompletoPedidos(listaPedidoCompleto));
		
		
	}
	
	@Test
	  public void crearFacturaTest() {
	      String ruta = "facturas/pedido.txt";

	
	        File archivoFactura = new File(ruta);
	        assertTrue(archivoFactura.exists());
	    }
	}

