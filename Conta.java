package contaEncapsulada;

public class Conta {
	private double saldo;

	
	public String getSaldo() {
		return "Saldo: R$" + saldo;
	}
	public void sacar(double saque) {
		if (saque>saldo){
			System.out.println("Saldo insuficiente!");
		}else{
			saldo -= saque;	
		}
	}
	public void depositar(double deposito) {
		saldo += deposito;
	}
}
