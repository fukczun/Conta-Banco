package contaEncapsulada;

public class Inicio {

	public static void main(String[] args) {
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
				
		contaCorrente.depositar(50);
		contaPoupanca.depositar(75);
		
		contaCorrente.sacar(20);
		contaPoupanca.sacar(100);
		
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaPoupanca.getSaldo());
	}
}