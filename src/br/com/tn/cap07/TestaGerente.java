package br.com.tn.cap07;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		gerente.setNome("Jo�o da Silva");
		gerente.setSenha(4321);
		gerente.setSalario(5000.0);
		System.out.println(gerente.getBonificacao());
	}

}
