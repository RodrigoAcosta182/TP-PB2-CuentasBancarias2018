package ar.edu.unlam.pb2;

public class CajaAhorro extends Cuenta {

	private Integer cantidaddeintentos;

	public CajaAhorro(Integer cbu, Integer numerodecuenta, Double saldo) {
		super(cbu, numerodecuenta, saldo);
		this.cantidaddeintentos = 0;
	}

	@Override
	public void extraer(Double saldo) {
		if (saldo <= this.getSaldo()) {
			Double saldoactual = this.getSaldo() - saldo;
			this.setSaldo(saldoactual);
			this.cantidaddeintentos++;
				if (this.cantidaddeintentos > 5 && this.getSaldo() >= saldo + 6) {
					Double saldoconrecargo = this.getSaldo() - 6;
					this.setSaldo(saldoconrecargo);
			}
		}
	}




}
