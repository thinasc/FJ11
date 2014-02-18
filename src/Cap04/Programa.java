package Cap04;

public class Programa {

	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		Cliente c = new Cliente();
		minhaConta.titular = c;

		minhaConta.titular.nome = "Duke";
		minhaConta.saldo = 1000.0;
		
		System.out.println("Saldo Inicial: " + minhaConta.saldo);
	}

}
