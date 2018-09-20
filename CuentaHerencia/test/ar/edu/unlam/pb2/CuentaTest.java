package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void testRetirarDineroCajaAhorro(){
		CajaAhorro miCaja = new CajaAhorro(123, 258, 15000.0);
		
		miCaja.extraer(16000.0);
		assertEquals(15000.0, miCaja.getSaldo(),0.0);
		
	}

	@Test
	public void testRetirarDineroCuentaCorriente(){
		CuentaCorriente miCaja = new CuentaCorriente(123, 258, 200.0);
		
		miCaja.extraer(450.0);
		assertEquals(-262.5, miCaja.getSaldo(),0.0);
		
	}
}
