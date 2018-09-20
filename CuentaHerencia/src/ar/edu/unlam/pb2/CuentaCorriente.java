package ar.edu.unlam.pb2;

public class CuentaCorriente extends Cuenta{
	
	public CuentaCorriente(Integer cbu, Integer numerodecuenta, Double saldo) {
		super(cbu, numerodecuenta, saldo);
		
	}

	
	@Override
	public void extraer(Double saldo){
		if (this.getSaldo() >= saldo){
			Double saldoactual = this.getSaldo() - saldo;
			this.setSaldo(saldoactual);
		}else {
			Double saldodiferencial =  saldo - this.getSaldo();
			Double calcularporcentaje = saldodiferencial * 0.05;
			Double saldototal = this.getSaldo() - (calcularporcentaje + saldo);
			this.setSaldo(saldototal);
		}
		
		 
			
		
		
	}
	
}
