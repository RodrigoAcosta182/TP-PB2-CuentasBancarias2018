package ar.edu.unlam.pb2.cuenta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void testDepositarDineroCuentaSueldo() {
		CuentaSueldo miCuenta = new CuentaSueldo(0003, "chidori", 5000.0);
		Double expected = miCuenta.depositarDinero(3000.0);
		Double actual = miCuenta.mostrarSaldo();
		assertEquals(expected, actual);
	}

	@Test
	public void testExtraerDineroCuentaSueldo() {
		CuentaSueldo miCuenta = new CuentaSueldo(0003, "kamui", 5000.0);
		Double expected = miCuenta.extraerDinero(2000.0);
		Double actual = miCuenta.mostrarSaldo();
		assertEquals(expected, actual);
	}

	@Test
	public void testExtraerCajaDeAhorro() {
		Double saldoInicial = 20000.0;
		CajaDeAhorros miCaja = new CajaDeAhorros(0001, "rasengan", saldoInicial);
		miCaja.extraerDinero(1000.0);
		miCaja.extraerDinero(1000.0);
		miCaja.extraerDinero(1000.0);
		miCaja.extraerDinero(1000.0);
		miCaja.extraerDinero(1000.0);
		// saque dos veces con costo adicional de 6.
		miCaja.extraerDinero(1000.0);
		miCaja.extraerDinero(1000.0);

		Double expected = saldoInicial - 7000.0 - 6.0 - 6.0;
		Double actual = miCaja.mostrarSaldo();

		assertEquals(expected, actual);

	}

}
