package ar.edu.unlam.pb2;

public class Cuenta {

	private Integer cbu;
	private Integer numerodecuenta;
	private Double saldo;

	public Cuenta(Integer cbu, Integer numerodecuenta, Double saldo) {
		this.cbu = cbu;
		this.numerodecuenta = numerodecuenta;
		this.saldo = saldo;
	}

	public void extraer(Double saldo) {
		if(saldo <= this.saldo){
			this.saldo -= saldo;
		}
	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}

	public Integer getNumerodecuenta() {
		return numerodecuenta;
	}

	public void setNumerodecuenta(Integer numerodecuenta) {
		this.numerodecuenta = numerodecuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
}
