package ar.edu.unlam.pb2.cuenta;

public class CajaDeAhorros extends CuentaSueldo {
	private Integer contadorExtracciones;
	private static final Double COSTO_ADICIONAL = 6.0;
	public CajaDeAhorros(Integer cbu, String alias, Double saldo) {
		super(cbu, alias, saldo);
		this.contadorExtracciones = 0;
	}

	@Override
	public Double extraerDinero(Double extraer) {
		if (this.getSaldo() > extraer && extraer > 0) {
			this.setSaldo(this.getSaldo() - extraer);
			this.contadorExtracciones++;
		}
		if(this.contadorExtracciones >5) {
			this.setSaldo(this.getSaldo() - COSTO_ADICIONAL);
		}
		return this.getSaldo();
	}

}
