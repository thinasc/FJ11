package Cap04;

public class TestaAlgunsMetodos {

	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		Cliente c = new Cliente();
		minhaConta.titular = c;

		minhaConta.titular.nome = "Duke";
		minhaConta.saldo = 1000;

		if (minhaConta.saca(2000)) {
			System.out.println("Consegui sacar");
		} else {
			System.out.println("Não consegui sacar");
		}

		minhaConta.saca(200);

		minhaConta.deposita(500);
		System.out.println(minhaConta.saldo);
	}

}