package consola;

import procesamiento.Restaurante;
import procesamiento.LoaderRestaurante;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;







public class Aplicacion 
{

	

	public void ejecutarAplicacion() throws Exception
	{
		String x = "Restaurante Hamburguesas";
		System.out.println(x);
		boolean continuar = true;
		do {
			mostrarMenu();
			int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
			if (opcion_seleccionada == 1)
				ejecutarCargarArchivos();
			else if (opcion_seleccionada == 2)
				ejecutarMostrarMenu();
			else if (opcion_seleccionada == 3)
				ejecutarInciarPedido();
			else if (opcion_seleccionada == 4)
				ejecutarAgregarNuevoElemento();
			
			
				
				
			
			
			
		} while (continuar);
		
	}
	
	private void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Cargar Archivos");
		System.out.println("2. Mostrar Menu");
		System.out.println("3. Iniciar pedido");
		System.out.println("4. Agregar un nuevo elemento al pedido");
		System.out.println("5. Cerrar pedido y guardar factura");
		System.out.println("6. Consultar pedido dado su id");
		System.out.println("7. Salir de la aplicación\n");
	}
	
	private void menu2() {
		System.out.println("\nSeleccione una Opción\n");
		System.out.println("1. Mostrar Menu Productos");
		System.out.println("2. Mostrar Menu Combos");
		System.out.println("3 Mostrar Menu Ingredientes");
		
		
	}
	
		
	private void menu3() {
		System.out.println("\nSeleccione una Opción\n");
		System.out.println("1. Corral");
		System.out.println("2. Corral queso");
		System.out.println("3. Corral pollo");
		System.out.println("4. Corralita");
		System.out.println("5. 1/2 libra");
		System.out.println("6. Especial");
		System.out.println("7. Casera");
		System.out.println("8. Mexicana");
		System.out.println("9. Criolla");
		System.out.println("10. Costeña");
		System.out.println("11. Hawaiana");
		System.out.println("12. Wrap de pollo");
		System.out.println("13. Wrap de lomo");
		System.out.println("14. Ensalada mexicana");
		System.out.println("15. Papas medianas");
		System.out.println("16. Papas grandes");
		System.out.println("17. Papas en casco medianas");
		System.out.println("18. Papas en casco grandes");
		System.out.println("19. Agua cristal sin gas");
		System.out.println("20. Agua cristal con gas");
		System.out.println("21. Gaseosa");
		System.out.println("22. Combo Corral");
		System.out.println("23. Combo Corral queso");
		System.out.println("24. Combo Todoterreno");
		System.out.println("25. Combo Especial");
		System.out.println("26. Lechuga");
		System.out.println("27. Tomate");
		System.out.println("28. Cebolla");
		System.out.println("29. Queso mozzarella");
		System.out.println("30. Huevo");
		System.out.println("31. Queso americano");
		System.out.println("32. Tocineta express");
		System.out.println("33. Papa callejera");
		System.out.println("34. Pepinillos");
		System.out.println("35. Cebolla grille");
		System.out.println("36. Suero costeño");
		System.out.println("37. Frijol refrito");
		System.out.println("38. Queso fundido");
		System.out.println("39. Tocineta picada");
		System.out.println("40. Piña");
	}
	
	
	private void siono() {
		System.out.println("Desea agregar un producto a su pedido: ");
		System.out.println("1. Si");
		System.out.println("2. No");
	}
	
	private void ejecutarCargarArchivos() throws Exception
	{
		System.out.println("\n" + "Cargar un archivo de restaurante" + "\n");
		try
		{
			
			menu2();
			int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
				LoaderRestaurante.cargarMenu();
				else if (opcion_seleccionada == 2)
				LoaderRestaurante.cargarCombos();
				else if (opcion_seleccionada == 3)
				LoaderRestaurante.cargarIngredientes();
				
			
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}
	}

	
	
	
	
	private void ejecutarMostrarMenu() throws Exception
	{
		System.out.println("\n" + "Cargar un archivo de restaurante" + "\n");
		try
		{
			
			menu2();
			int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
				LoaderRestaurante.cargarMenupr();
				else if (opcion_seleccionada == 2)
				LoaderRestaurante.cargarCombospr();
				else if (opcion_seleccionada == 3)
				LoaderRestaurante.cargarIngredientespr();
				
			
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}
	}
	
	
	private void ejecutarInciarPedido() {
		
		System.out.println("El pedido ha sido iniciado");
		
		
		
				
	}
	
	
	private void ejecutarAgregarNuevoElemento() throws FileNotFoundException, IOException {
		String nombreCliente = input("Ingrese su nombre: ");
		String direccionCliente = input("Ingrese su direccion:");
		
		
		ArrayList<Integer> listaPedido = new ArrayList<Integer>();
		menu3();	
			int siono = 1;

			while (siono == 1) {
				siono();
				siono = Integer.parseInt(input("Seleccione: "));
				int comida_seleccionada1 = Integer.parseInt(input("Seleccione un producto, si su respuesta anterior fue 'NO' digite 0: "));
				listaPedido.add(comida_seleccionada1);				
		}
		
		

		Restaurante.agregarElemento(nombreCliente, direccionCliente, listaPedido);
		
		
		
		
		}
			

		
			
		
		
		
				
		
		
	
		

	public static void main(String[] args) throws Exception
	{
	Aplicacion consola = new Aplicacion();
	consola.ejecutarAplicacion();
	}
	
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;


	}
}

