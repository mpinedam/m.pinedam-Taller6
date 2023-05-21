package pruebas;

import java.io.*;
import java.util.*;

import modelo.Combo;
import procesamiento.LoaderRestaurante;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComboTest {
	
	private Combo combo;
	
	@Test
	public void TestcalcularPrecioCombos1() throws FileNotFoundException, IOException {
		HashMap<String, Integer> resultado = new HashMap<String, Integer>();
		resultado.put("combo corral", 22050);
		resultado.put("combo corral queso", 23850);
		resultado.put("combo todoterreno", 34317);
		resultado.put("combo especial", 32085);
		
		assertTrue(Combo.CalcularPrecioCombos().equals(resultado));
		
	}


}